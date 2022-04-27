import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class IntGrafica extends JFrame {
    private JLabel l1, l2, l3, l4, l5, l6, l7;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JButton b1, b2;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu;
    private JMenuItem menuItem1, menuItem2;
    private int recensione; // DA TOGLIERE FORSE
    Libro li1 = new Libro();
    Film f1 = new Film();

    IntGrafica() {
        menu = new JMenu("Menu");
        menuBar.add(menu);
        menuItem1 = new JMenuItem("FILM");
        menu.add(menuItem1);
        menuItem2 = new JMenuItem("LIBRO");
        menu.add(menuItem2);
        this.setJMenuBar(menuBar);

        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(150, 179, 255));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf1 = new JTextField(5);
        add(tf1);

        tf2 = new JTextField(5);
        add(tf2);

        tf3 = new JTextField(5);
        add(tf3);

        tf4 = new JTextField(5);
        add(tf4);

        tf5 = new JTextField(5);
        add(tf5);

        l1 = new JLabel("Nuovo oggetto: ");
        add(l1);

        l2 = new JLabel("Nuovo oggetto: ");
        add(l2);

        l3 = new JLabel("Titolo: ");
        add(l3);

        l4 = new JLabel("Autore: ");
        add(l4);

        l5 = new JLabel("Anno di pubblicazione: ");
        add(l5);

        l6 = new JLabel("Casa editrice/distributrice: ");
        add(l6);

        l7 = new JLabel("Recensione: ");
        add(l7);

        b1 = new JButton("Libro");
        add(b1);
        b2 = new JButton("Film");
        add(b2);

        b2.setVisible(false);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                b1ActionPerformed(event);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                b2ActionPerformed(event);
            }
        });

        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                menuItem1ActionPerformed(event);
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                menuItem2ActionPerformed(event);
            }
        });

        l1.setBounds(20, 280, 100, 20);
        l1.setBounds(20, 300, 100, 100);
        l1.setBounds(20, 10, 70, 100);
        l1.setBounds(20, 50, 70, 100);
        l1.setBounds(20, 100, 70, 100);
        l1.setBounds(20, 150, 70, 100);
        l1.setBounds(20, 200, 70, 100);

        tf1.setBounds(300, 50, 50, 20);
        tf1.setBounds(300, 90, 50, 20);
        tf1.setBounds(300, 135, 50, 20);
        tf1.setBounds(300, 185, 50, 20);
        tf1.setBounds(300, 235, 50, 20);

        b1.setBounds(400, 400, 80, 30);
        b1.setBounds(400, 400, 80, 30);

        setSize(500, 500);
        setVisible(true);

    }

    public void b1ActionPerformed(ActionEvent e) {
        String text = tf2.getText();
        int val1 = Integer.parseInt(text.trim());
        String text2 = tf5.getText();
        int val2 = Integer.parseInt(text2.trim());

        li1.setTitolo(tf1.getText());
        li1.setAutore(tf2.getText());
        li1.setAnno_pubb(val1);
        li1.setCasa_Editor(tf4.getText());
        li1.setVoto_Decimi(val2);
        l2.setText(li1.toString());
    }

    public void b2ActionPerformed(ActionEvent e) {
        String text = tf3.getText();
        int val1 = Integer.parseInt(text.trim());
        String text2 = tf5.getText();
        int val2 = Integer.parseInt(text2.trim());

        f1.setTitolo(tf1.getText());
        f1.setAutore(tf2.getText());
        f1.setAnno_pubb(val1);
        f1.setCasa_Distro(tf4.getText());
        f1.setStelle_Recensioni(val2);
        l2.setText(f1.toString());
    }

    public int getRecensione() {
        return this.li1.getVoto_Decimi();
    }

    public void menuItem1ActionPerformed(ActionEvent e) {
        b1.setVisible(false);
        b1.setVisible(true);
    }

    public void menuItem2ActionPerformed(ActionEvent e) {
        b1.setVisible(true);
        b1.setVisible(false);
    }

    public static void main(String[] args) {
        new IntGrafica();
    }
}
