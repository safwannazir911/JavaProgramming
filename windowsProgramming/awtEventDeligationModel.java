package windowsProgramming;

import java.awt.*;
import java.awt.event.*;

public class awtEventDeligationModel extends Frame implements ActionListener {
    Button button;

    awtEventDeligationModel() {
        super("AWT Example");

        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);

        // Register the button with an ActionListener
        button.addActionListener(this);

        this.add(button);
        this.setSize(300, 300);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button was clicked!");
        }
    }

    public static void main(String[] args) {
        new awtEventDeligationModel();
    }
}
