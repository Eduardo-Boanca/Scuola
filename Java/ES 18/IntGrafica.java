import javax.swing.*;
import java.awt.*;

class IntGrafica extends JFrame {
    JFrame frame = new JFrame("Interfaccia Grafica");
    JButton btn1 = new JButton("Aggiungi");
    JButton btn2 = new JButton("Aggiungi");
    JButton btn3 = new JButton("Aggiungi");
    JButton btn4 = new JButton("Aggiungi");
    Libro li1 = new Libro();

    IntGrafica() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().add(btn1); // Adds Button to content pane of frame
        frame.getContentPane().add(btn2); 
        frame.getContentPane().add(btn3); 
        frame.getContentPane().add(btn4); 
        frame.setVisible(true);
    }
}
