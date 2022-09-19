import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class finestra extends Frame implements MouseListener {

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    ArrayList<Point> points = new ArrayList<>(); // creazione arraylist per i punti

    finestra() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // codice per permettere la chiusura della finestra
            }
        });

        addMouseListener(this);
        setSize(700, 700);

        setVisible(true);
    }

    // metodo che permette di disegnare
    public void disegna() {
        int x1, y1, x2, y2; // cordinate

        Graphics g = getGraphics();
        g.clearRect(0, 0, 700, 700);
        g.setColor(Color.RED);

        for (int i = 0; i < points.size(); i++) {
            if (i == 0) // primo click
            {
                x1 = (int) points.get(i).getX();
                y1 = (int) points.get(i).getY();
            } else {
                x1 = (int) points.get(i - 1).getX();
                y1 = (int) points.get(i - 1).getY();
            }
            x2 = (int) points.get(i).getX();
            y2 = (int) points.get(i).getY();
            g.drawLine(x1, y1, x2, y2); // disegno delle linee
        }
    }

    //metodo che rileva l'evento del mouse per poter aggiungere linee se
    //il tasto sinistro è premuto, o cancellare linee se il tasto destro è premuto
    @Override
    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            Point p = new Point(e.getX(), e.getY());
            points.add(p);
            System.out.println("Nuovo punto:" + points.size());
            disegna();
        }
        if (SwingUtilities.isRightMouseButton(e)) {
            int pos = points.size() - 1;
            System.out.println("Annullata in posizione" + pos);
            if (points.size() > 0)
                points.remove(pos);
            else
                System.out.println("Non ci sono altri punti da rimuovere");
            disegna();
        }
    }

    public static void main(String[] args) {
        new finestra();
    }
}