import java.awt.*;
import javax.swing.*;
//import static javax.swing.JOptionPane.showMessageDialog;


public class Graph extends JFrame {
    private int x,y;
    private final int scala = 100;
    //private int marg = 60;  
    private double ax, by;
    Thread thread = new Thread();

    // private void alertBox(String s){
    //     JOptionPane.showMessageDialog(null, s);
    // }

    public Graph() {
        setTitle("Grafico di Funzioni");
        setSize(700, 700);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //alertBox("PER MODIFICARE LA FUNZIONA ANDARE \nA MODIFICARE IL CODICE DEL PROGRAMMA");
        x = 0;
        y = 350;
    }
    

    public void paint(Graphics g) {
        //g.drawString("Funzione:", +by, 30, 60);
        g.drawString("Funzione", 30, 60);
        g.drawLine(350, 30, 350, 700); //asse y
        g.drawLine(0, 350, 700, 350); //asse x
        g.setColor(Color.GREENn);
        g.fillOval(x, y, 3, 3); //per poter rappresentare il grafico tramite puntini
        run();
        repaint(); //usato per aggiornare il frame (aggiorna e poi richiama il metodo paint())
    }


    public void run() {
        try {
            Thread.sleep(1);
  
            ax = x - 350; //per trovare l'origine
            by = y - 350; //per trovare l'origine

            /*******************************
             * INSERIRE LA FUNZIONE QUA
            *******************************/
            //by = scala * (Math.pow(0.01 * ax, 2));
            by = scala * (0.01 * (2 * ax + 1));

            //
            x = (int) (350 + ax); //cast a int perchè i valori ax,by sono double
            y = (int) (350 - by);

            x++;

        }catch(Exception e) {
            System.out.println("ERRORE");
        }
    }
}