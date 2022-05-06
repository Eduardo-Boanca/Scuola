import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PPila extends JFrame implements ActionListener {
    ArrayList<String> lista = new ArrayList<String>();
    private JPanel campi = new JPanel();
    private JPanel bottoni = new JPanel();

    private JTextField tf = new JTextField(10);
    private JTextField feedback = new JTextField(10); //da un feedback su quello che è avvenuto es. Il carrello è vuoto. Inserisci un ordine

    private JLabel oggetto = new JLabel("Inserire quello che si vuole acquistare");
    private JLabel carrello = new JLabel("Carrello ");

    private JButton ordina = new JButton("Ordina");
    private JButton ritira = new JButton("Ritira");
    private JButton contenuto = new JButton("Contenuto");

    public PPila() {
        super("LIFO");
        oggetto.setHorizontalAlignment(JLabel.CENTER);
        carrello.setHorizontalAlignment(JLabel.CENTER);

        ordina.setForeground(Color.BLACK);
        ritira.setForeground(Color.BLACK);
        contenuto.setForeground(Color.BLACK);

        campi.setLayout(new GridLayout(3, 2, 2, 2));
        campi.add(oggetto);
        campi.add(tf);
        campi.add(carrello);
        campi.add(feedback);

        bottoni.setLayout(new GridLayout(3, 2, 2, 2));
        bottoni.add(ordina);
        bottoni.add(ritira);
        bottoni.add(contenuto);

        setLayout(new GridLayout(2, 1, 5, 15));
        add(campi);
        add(bottoni);

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
        String str = tf.getText(); // prende il testo all'intendo del TextField
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
                    feedback.setText("Ultimo ordine " + lista.get(size - 1) + " ritirato");
                    lista.remove(size - 1); // rimuovo l'ultimo elemento della lista essendo LIFO
                } else
                    feedback.setText("Il carrello è vuoto. Inserisci un ordine");

                tf.setText(""); // cancello il contenuto del TextField
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