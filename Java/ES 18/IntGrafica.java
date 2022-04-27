import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class IntGrafica extends JFrame {
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JLabel l1, l2, l3, l4, l5, l6, l7;
    private JButton button1, button2;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu;
    private JMenuItem menuItem1, menuItem2;
    Film film = new Film();
    Libro libro = new Libro();

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

        tf1 = new JTextField(10);
        add(tf1);

        tf2 = new JTextField(10);
        add(tf2);

        tf3 = new JTextField(10);
        add(tf3);

        tf4 = new JTextField(10);
        add(tf4);

        tf5 = new JTextField(10);
        add(tf5);

        l1 = new JLabel();
        add(l1);

        l2 = new JLabel();
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

        button1 = new JButton("Aggiungi Libro");
        add(button1);
        button2 = new JButton("Aggiungi Film");
        add(button2);

        button2.setVisible(false);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                b1ActionPerformed(event);
            }
        });

        button2.addActionListener(new ActionListener() {
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

        l1.setBounds(20, 280, 200, 20);
        l2.setBounds(20, 300, 200, 100);
        l3.setBounds(20, 10, 200, 100);
        l4.setBounds(20, 50, 200, 100);
        l5.setBounds(20, 100, 200, 100);
        l6.setBounds(20, 150, 200, 100);
        l7.setBounds(20, 200, 200, 100);

        tf1.setBounds(500, 50, 100, 20);
        tf2.setBounds(500, 90, 100, 20);
        tf3.setBounds(500, 135, 100, 20);
        tf4.setBounds(500, 185, 100, 20);
        tf5.setBounds(500, 235, 100, 20);

        button1.setBounds(500, 400, 200, 30);
        button2.setBounds(500, 400, 200, 30);

        setSize(700, 500);
        setVisible(true);

    }

    public void b1ActionPerformed(ActionEvent e) {
        String text = tf2.getText();
        int val1 = Integer.parseInt(text.trim());
        String text2 = tf5.getText();
        int val2 = Integer.parseInt(text2.trim());

        libro.setTitolo(tf1.getText());
        libro.setAutore(tf2.getText());
        libro.setAnno_pubb(val1);
        libro.setCasa_Editor(tf4.getText());
        libro.setVoto_Decimi(val2);
        l2.setText(libro.toString());
    }

    public void b2ActionPerformed(ActionEvent e) {
        String text = tf3.getText();
        int val1 = Integer.parseInt(text.trim());
        String text2 = tf5.getText();
        int val2 = Integer.parseInt(text2.trim());

        film.setTitolo(tf1.getText());
        film.setAutore(tf2.getText());
        film.setAnno_pubb(val1);
        film.setCasa_Distro(tf4.getText());
        film.setStelle_Recensioni(val2);
        l2.setText(film.toString());
    }

    public int getRecensione() {
        return this.libro.getVoto_Decimi();
    }

    public void menuItem1ActionPerformed(ActionEvent e) {
        button1.setVisible(false);
        button2.setVisible(true);
    }

    public void menuItem2ActionPerformed(ActionEvent e) {
        button1.setVisible(true);
        button2.setVisible(false);
    }
}
