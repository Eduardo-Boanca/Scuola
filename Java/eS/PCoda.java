import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PCoda extends JFrame implements ActionListener {
    ArrayList<String> lista = new ArrayList<String>();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();

    private JTextField tf = new JTextField(10);
    private JTextField feedback = new JTextField(10);// da un feedback su quello che è avvenuto es. ""Il carrello è vuoto. Inserisci un ordine"

    private JLabel oggetto = new JLabel("Inserire quello che si vuole acquistare");
    private JLabel carrello = new JLabel("Carrello ");

    private JButton ordina = new JButton("Ordina");
    private JButton ritira = new JButton("Ritira");
    private JButton contenuto = new JButton("Contenuto");

    public PCoda() {
        super("FIFO");
        oggetto.setHorizontalAlignment(JLabel.CENTER);
        carrello.setHorizontalAlignment(JLabel.CENTER);

        ordina.setForeground(Color.BLACK);
        ritira.setForeground(Color.BLACK);
        contenuto.setForeground(Color.BLACK);

        p1.setLayout(new GridLayout(3, 2, 2, 2));
        p1.add(oggetto);
        p1.add(tf);
        p1.add(carrello);
        p1.add(feedback);

        p2.setLayout(new GridLayout(3, 2, 2, 2));
        p2.add(ordina);
        p2.add(ritira);
        p2.add(contenuto);

        setLayout(new GridLayout(2, 1, 5, 15));
        add(p1);
        add(p2);

        feedback.setEditable(false);
        ordina.addActionListener(this);
        ritira.addActionListener(this);
        contenuto.addActionListener(this);

        pack();
        setSize(800, 300);
        setLocation(500, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pulsante = e.getActionCommand();
        String str = tf.getText();
        int size = lista.size();
        switch (pulsante) {
            case "Ordina":
                if (str.isEmpty() == false) {// Empty controlla che il contenuto del textfield sia vuoto o no
                    lista.add(str);
                    feedback.setText("Inserimento avvenuto");
                } else
                    feedback.setText("Il carrello è vuoto. Inserisci un ordine");
                tf.setText("");
                break;

            case "Ritira":
                if (size > 0) {
                    feedback.setText("Primo ordine " + lista.get(0) + " ritirato");
                    lista.remove(0);
                } else
                    feedback.setText("Il carrello è vuoto. Inserisci un ordine");
                tf.setText("");
                break;

            case "Contenuto":
                if (size > 0) {
                    feedback.setText(lista.toString());
                } else
                    feedback.setText("Il carrello è vuoto. Inserisci un ordine");
                break;
        }
    }

}