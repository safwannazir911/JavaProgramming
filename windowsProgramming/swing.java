package windowsProgramming;

import javax.swing.*;
import java.awt.event.*;

public class swing {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Example");

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 80, 30);

        // Add action listener to the button
        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        };
        button.addActionListener(a);

        // Add the button to the frame
        frame.add(button);

        // Set the layout, size, and visibility of the frame
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
