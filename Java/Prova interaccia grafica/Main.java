import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Etichetta");
        JButton button = new JButton("Pulsante");

        panel.add(label);
        panel.add(button);

        Container container = frame.getContentPane();
        container.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}