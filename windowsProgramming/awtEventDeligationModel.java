
import java.awt.*;
import java.awt.event.*;

public class awtEventDeligationModel {

    public static void main(String[] args) {
        Button button;
        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);

        Frame frame = new Frame();
        // Register the button with an ActionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    System.out.println("Button was clicked!");
                }
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
