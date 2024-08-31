package windowsProgramming;

import java.awt.*;

public class awtLayoutManagers {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");

        // Set BorderLayout as the layout manager
        frame.setLayout(new BorderLayout());

        // Add components to different regions
        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"), BorderLayout.SOUTH);
        frame.add(new Button("East"), BorderLayout.EAST);
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
