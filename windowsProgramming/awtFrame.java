import java.awt.*;
import java.awt.event.*;

public class awtFrame extends Frame implements ActionListener {
    Button button;

    awtFrame() {
        // Create a frame
        Frame frame = new Frame("AWT Example");

        // Create a button
        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30); // x, y, width, height

        // Register the button with an ActionListener
        button.addActionListener(this);

        // Add the button to the frame
        frame.add(button);

        // Set the layout, size, and visibility of the frame
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    // ActionListener method to handle button click
    public void actionPerformed(ActionEvent e) {
        button.setLabel("Clicked!");
    }

    public static void main(String[] args) {
        new awtFrame();
    }
}
