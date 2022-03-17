import javax.swing.*;
import java.awt.*;

class IntGrafica extends JFrame {

    private JLabel l1, l2;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JButton b1;
    private int recensione;
    Libro li1 = new Libro();
    IntGrafica() {
        
        //Absolute layout
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(255, 179, 134));
        //X=close
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
        l2 = new JLabel();
        add(l2);
        b1 = new JButton("Insert");
        add(b1);
        
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l1.setBounds(20,280,100,20);
        l2.setBounds(20,300,100,100);
        tf1.setBounds(30,10,50,20);
        tf2.setBounds(30,50,50,20);
        tf3.setBounds(30,100,50,20);
        tf4.setBounds(30,150,50,20);
        tf5.setBounds(30,200,50,20);
        b1.setBounds(300,280,70,30);
        setSize(400,400);
        setVisible(true);
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        String text = tf3.getText();
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

    public int getRecensione()
    {
        return this.li1.getVoto_Decimi();
    }

    public void setRecensione(int recensione)
    {
        //this.li1.setVoto_in_decimi(Integer.parseInt(tf3.getText()))=recensione;
    }

 }

