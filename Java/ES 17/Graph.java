import java.awt.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Graph extends JFrame {
    int x,y;
    final int scala = 100;
    int marg = 60;  
    JFrame frame = new JFrame();

    private void alertBox(String s){
        JOptionPane.showMessageDialog(null, s);
    }

    public Graph() {
        frame.setTitle("Grafico di Funzioni");
        frame.setSize(700, 1080);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alertBox("PER MODIFICARE LA FUNZIONA ANDARE \nA MODIFICARE IL CODICE DEL PROGRAMMA");
        x = 30;
        y = 350;

    }

	public void paint(Graphics g) {
        // g.drawLine(350, 60, 350, 670); //asse y
        // g.drawLine(30, 350, 670, 350); //asse x
        frame.pack();
        int width = frame.getWidth();
        int height = frame.getHeight(); 
        g.drawLine(marg, marg, marg, height - marg); //asse y
        g.drawLine(marg, height - marg, width - marg, height - marg); //asse x
        g.setColor(Color.RED);
        g.fillOval(x, y, 3, 3);
        run();
        repaint();
    }

    public void run() {
        try {
            Thread.sleep(1);
            double ax, by;
            ax = x - 350; //per trovare l'origine
            by = y - 350; //per trovare l'origine

            // by = (50 * Math.cos(0.1 * ax/Math.PI));
            by = scala * (Math.pow(0.01 * ax, 2));

            x = (int) ((int) ax + 350); //cast a int perchè i valori sono double
            y = (int) ((int) 350 - by);

            x++;

        }catch(Exception e) {
            System.out.println("ERRORE");
        }
    }
}