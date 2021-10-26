package uc3m.crypto.client.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

public class MessagingTemplate {
    private JPanel Messages;
    private JTextArea out;
    private JList contacts;
    private JPanel panelSouth;
    private JButton buttonSend;
    private JTextField in;
    private JLabel usernameLabel;
    private JScrollBar outScrollbar;
    private JPanel panelNorth;
    private JCheckBox signedModeCheckBox;
    private JButton logOutButton;
    private JPanel Settings;
    private JPanel MainPanel;
    private JButton settingsButton;
    private JTextField listenPort;
    private JTextField targetPort;
    private JTextField targetIP;
    private JButton applyButton;
    private JButton exitButton;
    private JButton testButton;

    public MessagingTemplate() {
    }

    public JPanel getMainPanel() {
        return this.Messages;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MainPanel = new JPanel();
        MainPanel.setLayout(new CardLayout(0, 0));
        Messages = new JPanel();
        Messages.setLayout(new BorderLayout(0, 0));
        MainPanel.add(Messages, "Card1");
        out = new JTextArea();
        Messages.add(out, BorderLayout.CENTER);
        contacts = new JList();
        contacts.setPreferredSize(new Dimension(100, 0));
        Messages.add(contacts, BorderLayout.WEST);
        panelSouth = new JPanel();
        panelSouth.setLayout(new BorderLayout(0, 0));
        Messages.add(panelSouth, BorderLayout.SOUTH);
        buttonSend = new JButton();
        buttonSend.setFocusable(false);
        buttonSend.setText("Button");
        panelSouth.add(buttonSend, BorderLayout.EAST);
        in = new JTextField();
        in.setColumns(0);
        in.setMinimumSize(new Dimension(50, 30));
        in.setPreferredSize(new Dimension(50, 30));
        panelSouth.add(in, BorderLayout.CENTER);
        usernameLabel = new JLabel();
        usernameLabel.setText("Username:");
        panelSouth.add(usernameLabel, BorderLayout.WEST);
        outScrollbar = new JScrollBar();
        Messages.add(outScrollbar, BorderLayout.EAST);
        panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        Messages.add(panelNorth, BorderLayout.NORTH);
        signedModeCheckBox = new JCheckBox();
        signedModeCheckBox.setText("Signed mode");
        panelNorth.add(signedModeCheckBox);
        logOutButton = new JButton();
        logOutButton.setText("Logout");
        panelNorth.add(logOutButton);
        settingsButton = new JButton();
        settingsButton.setText("Settings");
        panelNorth.add(settingsButton);
        testButton = new JButton();
        testButton.setText("Test");
        panelNorth.add(testButton);
        Settings = new JPanel();
        Settings.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        MainPanel.add(Settings, "Card2");
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        Settings.add(panel1);
        final JLabel label1 = new JLabel();
        label1.setText("Listen on port:");
        panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        listenPort = new JTextField();
        panel1.add(listenPort, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Target port:");
        panel1.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetPort = new JTextField();
        panel1.add(targetPort, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Target IP:");
        panel1.add(label3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetIP = new JTextField();
        panel1.add(targetIP, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        applyButton = new JButton();
        applyButton.setText("Apply");
        panel1.add(applyButton, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        exitButton = new JButton();
        exitButton.setText("Exit");
        panel1.add(exitButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainPanel;
    }

}