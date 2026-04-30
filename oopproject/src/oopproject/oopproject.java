package oopproject;

import java.awt.Color;
import javax.swing.*;

public class oopproject {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo");
        frame.getContentPane().setBackground(Color.GRAY);

        JButton button = new JButton("click");
        button.setBounds(100, 100, 100, 40);

        button.addActionListener(e -> {
            button.setText("clicked!");
            button.setBackground(Color.PINK);

            String username = JOptionPane.showInputDialog("enter your username:");
            String password = JOptionPane.showInputDialog("enter your password:");

            if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "you cant leave it blank");
            } 
            else if (username.equals("ayca") && password.equals("5255")) {
                JOptionPane.showMessageDialog(null, "correct");

                JFrame notesFrame = new JFrame("My Notes");

                JTextArea notesArea = new JTextArea();
                notesArea.setBounds(20, 20, 450, 280);

                JButton saveButton = new JButton("Save");
                saveButton.setBounds(80, 320, 120, 30);

                saveButton.addActionListener(event -> {
                    JOptionPane.showMessageDialog(null, "Note saved:\n");
                });

                notesFrame.add(notesArea);
                notesFrame.add(saveButton);
                notesFrame.setSize(500, 450);
                notesFrame.setLayout(null);
                notesFrame.setVisible(true);
            } 
            else {
                JOptionPane.showMessageDialog(null, "wrong username or password");
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}