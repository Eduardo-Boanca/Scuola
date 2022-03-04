import javax.swing.*;
import java.awt.*;

class IntGrafica extends JFrame {

    private JButton btnAggiungi = new JButton("Aggiungi");
    private JButton btnStampa = new JButton("Stampa");

    private JTextField txtA = new JTextField();
    private JTextField txtB = new JTextField();
    private JTextField txtC = new JTextField();
    private JTextField txtD = new JTextField();
    private JTextField txtE = new JTextField();
    Libro libro1 = new Libro();

    private JLabel lblA = new JLabel("Titolo:");
    private JLabel lblB = new JLabel("Autore:");
    private JLabel lblC = new JLabel("Anno di Pubblicazione:");
    private JLabel lblD = new JLabel("Casa Editrice:");
    private JLabel lblE = new JLabel("Voto 1-10:");

    public IntGrafica() {
        setTitle("Inserimento Informazioni");
        setSize(400, 200);
        setLocation(new Point(300, 200));
        setLayout(null);
        setResizable(true);

        btnAggiungi.setBounds(300, 130, 80, 25);
        btnStampa.setBounds(300, 130, 80, 25);

        txtA.setBounds(100, 10, 130, 20);
        txtB.setBounds(100, 35, 130, 20);
        txtC.setBounds(100, 65, 130, 20);
        txtD.setBounds(100, 65, 130, 20);
        txtE.setBounds(100, 65, 130, 20);

        lblA.setBounds(20, 10, 130, 20);
        lblB.setBounds(20, 35, 130, 20);
        lblC.setBounds(20, 65, 130, 20);
        lblD.setBounds(20, 95, 130, 20);
        lblE.setBounds(20, 125, 130, 20);

        add(btnAggiungi);
        add(btnStampa);

        add(lblA);
        add(lblB);
        add(lblC);
        add(lblD);
        add(lblE);

        add(txtA);
        add(txtB);
        add(txtC);
        add(txtD);
        add(txtE);

        btnAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnAggiungiActionPerformed(e);
            }
        });
    }

    private void btnAggiungiActionPerformed(java.awt.event.ActionEvent e)
    {

    } 

}
