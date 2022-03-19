import java.awt.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Graph extends JFrame {
    int x,y;
    final int scala = 100;
    int marg = 60;  

    private void alertBox(String s){
        JOptionPane.showMessageDialog(null, s);
    }

    public Graph() {
        setTitle("Grafico di Funzioni");
        setSize(700, 700);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alertBox("PER MODIFICARE LA FUNZIONA ANDARE \nA MODIFICARE IL CODICE DEL PROGRAMMA");
        x = 30;
        y = 350;
    }

	public void paint(Graphics g) {
        g.drawLine(350, 60, 350, 670); //asse y
        g.drawLine(30, 350, 670, 350); //asse x
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

            /*******************************
             * INSERIRE LA FUNZIONE QUA
            *******************************/
            by = scala * (Math.pow(0.01 * ax, 2));

            x = (int) ((int) ax + 350); //cast a int perchè i valori sono double
            y = (int) ((int) 350 - by);

            x++;

        }catch(Exception e) {
            System.out.println("ERRORE");
        }
    }
}