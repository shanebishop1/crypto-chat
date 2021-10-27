package uc3m.crypto.server.model;

import uc3m.crypto.security.SHA;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String filePath;
    Set<String> usernames;
    List<User> users;
    List<Message> history;

    public DB(String databasePath) {
        filePath = databasePath;
        usernames = new HashSet<String>();
        users = new ArrayList<User>();
        history = new ArrayList<Message>();
        usernames.add("Server");
        usernames.add("Shane");
        usernames.add("Lukas");
        users.add(new User("Lukas", SHA.digestToString("FI3pxaekTRnlbNmuGlVL9nhHr7DFj24S+imsfd/KmUA="))); //hashed password "p" (Top secret)
        users.add(new User("Shane", SHA.digestToString("FI3pxaekTRnlbNmuGlVL9nhHr7DFj24S+imsfd/KmUA=")));
    }

    public static void saveDatabase(DB database) { //saves the DB into a no extension file
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(database.getFilePath()));
            outputStream.writeObject(database);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printHistory(DB database) {
        for (Message m : database.getHistory()) System.out.println(m.toUIString());
    }

    public static DB loadDatabase(String path) { //loads database from a file
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            DB database = (DB) inputStream.readObject(); //using very useful java ObjectStreams, a very nice feature for serialization
            inputStream.close();
            return database;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Could not find DB file at path: " + path);
            System.out.println("A new DB will be created and written to the given path: " + path);
            return new DB(path);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public User searchUsernamePassword(String username, String password) {
        for (User user : users) {
            if (user != null) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public Set<String> getUsernames() {
        return this.usernames;
    }

    public List<Message> getHistory() {
        return this.history;
    }

    public String getFilePath() {
        return this.filePath;
    }
}
