package windowsProgramming;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class p1 {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Java Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create a text field
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create submenus
        JMenu newSubMenu = new JMenu("New");
        JMenuItem newFileItem = new JMenuItem("File");
        JMenuItem newProjectItem = new JMenuItem("Project");
        newSubMenu.add(newFileItem);
        newSubMenu.add(newProjectItem);

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");

        // Add items to menus
        fileMenu.add(newSubMenu);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add items to edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set menu bar to frame
        frame.setJMenuBar(menuBar);

        // Create a button with an image
        JButton imageButton = new JButton(
                new ImageIcon("/home/safwannazir911/Desktop/food-101/food-101/images/apple_pie/134.jpg"));
        frame.add(imageButton, BorderLayout.SOUTH);

        // Create a table with 3 attributes
        String[] columnNames = { "Attribute 1", "Attribute 2", "Attribute 3" };
        Object[][] data = {
                { "Data 1", "Data 2", "Data 3" },
                { "Data 4", "Data 5", "Data 6" },
                { "Data 7", "Data 8", "Data 9" }
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        // The line `JScrollPane scrollPane = new JScrollPane(table);` is creating a
        // JScrollPane component that
        // wraps around the JTable component.
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Agitdd key listener to text field
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                textField.setText("I know key handling");
            }
        });

        // Set frame visibility
        frame.setVisible(true);

    }
}
