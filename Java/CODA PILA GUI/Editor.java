import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Editor extends JFrame implements ActionListener {
  private JPanel p = new JPanel();
  private JMenuBar bar = new JMenuBar();

  public Editor() {
    creaMenu(); //crea la barra dei menu
    this.setJMenuBar(bar);
    this.getContentPane().add(p, BorderLayout.CENTER); // aggiunge le componenti del frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Per chiudere la finestra
  }

  // creazione delle voci di menu
  public JMenuBar creaMenu() { //JMenuBar implementa una barra con un menu
    JMenu menu;
    JMenuItem item;
    // menu Modifica
    menu = new JMenu("PANETTERIA");

    bar.add(menu);
    // voci
    item = new JMenuItem("FIFO");
    item.addActionListener(this);
    menu.add(item);
    item = new JMenuItem("LIFO");
    item.addActionListener(this);
    menu.add(item);
    return bar;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String pulsante = e.getActionCommand();

    switch (pulsante) {
      case "FIFO":
        new PCoda(); //Se viene scelto FIFO verrà visualizzata la gui relativa al FIFO
        break;
      case "LIFO":
        new PPila(); // Se viene scelto LIFO verrà visualizzata la gui relativa al LIFO
        break;
    }
  }

}