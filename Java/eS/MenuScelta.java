import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuScelta extends JFrame implements ActionListener {
  private JPanel panel = new JPanel();
  private JMenuBar bar = new JMenuBar();

  public MenuScelta() {
    Menu(); //crea la barra dei menu
    this.setJMenuBar(bar);
    this.getContentPane().add(panel, BorderLayout.CENTER); // aggiunge le componenti del frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Per chiudere la finestra
  }

  // creazione delle voci di menu
  public JMenuBar Menu() { //JMenuBar implementa una barra con un menu
    JMenu menu;
    JMenuItem item;
    // menu Modifica
    menu = new JMenu("FIFO/LIFO");

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