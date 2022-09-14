import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calcolatrice extends JFrame implements ActionListener {
    JButton b10, b11, b12, b13, b14, b15;
    JButton b[] = new JButton[10];
    int i, r, n1, n2;
    JTextField res;
    char op;

    public Calcolatrice() {
        super("Calcolatrice");

        setLayout(new BorderLayout());
        JPanel p = new JPanel(); //JPanel() è il container
        p.setLayout(new GridLayout(4, 4));
        
        //Bottoni con i numeri
        for (int i = 0; i <= 9; i++) {
            b[i] = new JButton(i + ""); //per inserire il valore del tasto 0-9
            p.add(b[i]);
            b[i].addActionListener(this); //(this) per dire su che bottone si sta eseguendo l'azione
        }

        //Bottone con le operazioni
        b10 = new JButton("+");
        p.add(b10);
        b10.addActionListener(this);

        b11 = new JButton("-");
        p.add(b11);
        b11.addActionListener(this);

        b12 = new JButton("*");
        p.add(b12);
        b12.addActionListener(this);

        b13 = new JButton("/");
        p.add(b13);
        b13.addActionListener(this);

        b14 = new JButton("=");
        p.add(b14);
        b14.addActionListener(this);

        b15 = new JButton("C");
        p.add(b15);
        b15.addActionListener(this);

        res = new JTextField(10);
        add(p, BorderLayout.CENTER); //i bottoni sono posizioni al centro tramite borderLayout
        add(res, BorderLayout.NORTH); //Il TextField con il risultato è posizionato "a nord" tramite borderLayout
        setVisible(true);
        setSize(200, 200);
    }


    public void actionPerformed(ActionEvent e) {
        JButton buttonPressed = (JButton) e.getSource(); //per capire quale tasto è stato premuto
        
        //se il tasto b15 ovvero cancella è premuto il contenuto del TextField è Azzerato 
        if (buttonPressed == b15) {
            r = n1 = n2 = 0;
            res.setText("");
        } else if (buttonPressed == b14) { //se il tasto b15 ovvero "=" è premuto
            n2 = Integer.parseInt(res.getText()); //da stringa a intero tramite getText e parseInt
            eval(); //metodo che dice quale operazione è stata scelta
            res.setText("" + r); //il risultato viene mostrato
        }

        else {
            boolean opf = false; //indica se il tasto è cliccato oppure no
            if (buttonPressed == b10) {
                op = '+';
                opf = true;
            }
            if (buttonPressed == b11) {
                op = '-';
                opf = true;
            }
            if (buttonPressed == b12) {
                op = '*';
                opf = true;
            }
            if (buttonPressed == b13) {
                op = '/';
                opf = true;
            }

            //se opf è falso significa che è stato premuto uno dei tasti tra 0 e 9
            //e ciò implica che il bottone che è stato cliccato e salvato dentro a n1 o n2
            if (opf == false) {
                for (i = 0; i < 10; i++) {
                    if (buttonPressed == b[i]) {
                        String t = res.getText(); //prendo il testo del bottone cliccato
                        t += i;
                        res.setText(t); //e lo ritorno nel TextField
                    }
                }
            } else {
                n1 = Integer.parseInt(res.getText());
                res.setText("");
            }
        }
    }

    //metodo che si basa su attributo "op" e in base all'operazione scelta
    //viene detto quale operazione eseguire una volta premuto il bottone "="
    int eval() {
        switch (op) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                r = n1 / n2;
                break;

        }
        return 0;
    }

    public static void main(String arg[]) {
        new Calcolatrice();
    }
}