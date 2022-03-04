import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calcolatrice extends JFrame {

	Container finestra;
	JPanel tasti, pan1, pan2, pan3;
	JTextField display;
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, piu, meno, div, per, ris, azzera;
	ActionListener lis;
	GridLayout griglia;
	public float tot = 0;
	float num1, num2;
	char operazione;
	int s = 0;

	void numeri(int n) {
		tot = (tot * 10) + n;
		display.setText("" + tot);
		if (s == 0)
			s = 1;
		if (s == 2)
			s = 3;
	}

	void risultato() {
		switch (operazione) {
			case '+':
				tot = num1 + num2;
				break;
			case '-':
				tot = num1 - num2;
				break;
			case '*':
				tot = num1 * num2;
				break;
			case '/':
				tot = num1 / num2;
				break;
		}
	}

	void operazione(char c) {
		operazione = c;
		if (s == 1) {
			num1 = tot;
			tot = 0;
			display.setText("" + tot);
			s = 2;
		}
		if (s == 3) {
			num2 = tot;
			risultato();
			num1 = tot;
			tot = 0;
			display.setText("" + tot);
			s = 2;
		}
	}
	

	class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object sorgente = e.getSource();
			if (sorgente == btn0)
				numeri(0);
			if (sorgente == btn1)
				numeri(1);
			if (sorgente == btn2)
				numeri(2);
			if (sorgente == btn3)
				numeri(3);
			if (sorgente == btn4)
				numeri(4);
			if (sorgente == btn5)
				numeri(5);
			if (sorgente == btn6)
				numeri(6);
			if (sorgente == btn7)
				numeri(7);
			if (sorgente == btn8)
				numeri(8);
			if (sorgente == btn9)
				numeri(9);
			if (sorgente == azzera) {
				tot = 0;
				display.setText("" + tot);
				s = 0;
			}
			if (sorgente == piu)
				operazione('+');
			if (sorgente == meno)
				operazione('-');
			if (sorgente == div)
				operazione('/');
			if (sorgente == per)
				operazione('*');
			if (sorgente == ris) {
				if (s == 3) {
					num2 = tot;
					risultato();
					display.setText("" + tot);
					num1 = tot;
					s = 1;
				}
			}
		}
	}

	public Calcolatrice() {

		lis = new Listener();

		display = new JTextField("" + tot);
		display.setEditable(false); // per evitare che il display sia modificabile a mano
		display.setHorizontalAlignment(JTextField.LEFT); //orientamento del display

		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		piu = new JButton("+");
		meno = new JButton("-");
		div = new JButton(":");
		per = new JButton("*");
		ris = new JButton("=");
		azzera = new JButton("DEL");

		btn0.addActionListener(lis);
		btn1.addActionListener(lis);
		btn2.addActionListener(lis);
		btn3.addActionListener(lis);
		btn4.addActionListener(lis);
		btn5.addActionListener(lis);
		btn6.addActionListener(lis);
		btn7.addActionListener(lis);
		btn8.addActionListener(lis);
		btn9.addActionListener(lis);
		piu.addActionListener(lis);
		meno.addActionListener(lis);
		div.addActionListener(lis);
		per.addActionListener(lis);
		ris.addActionListener(lis);
		azzera.addActionListener(lis);

		tasti = new JPanel();
		griglia = new GridLayout(4, 4); // griglia 4 per 4
		tasti.setLayout(griglia);

		// distanza tra i tasti
		griglia.setHgap(20); //orizzontale
		griglia.setVgap(20); //verticale

		tasti.add(btn1);
		tasti.add(btn2);
		tasti.add(btn3);
		tasti.add(piu);
		tasti.add(btn4);
		tasti.add(btn5);
		tasti.add(btn6);
		tasti.add(meno);
		tasti.add(btn7);
		tasti.add(btn8);
		tasti.add(btn9);
		tasti.add(per);
		tasti.add(btn0);
		tasti.add(azzera);
		tasti.add(ris);
		tasti.add(div);

		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();

		finestra = getContentPane();
		finestra.setLayout(new BorderLayout(15, 15));
		finestra.add(display, BorderLayout.NORTH);
		finestra.add(tasti, BorderLayout.CENTER);
		finestra.add(pan1, BorderLayout.SOUTH);
		finestra.add(pan2, BorderLayout.EAST);
		finestra.add(pan3, BorderLayout.WEST);

		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		pack(); //Il metodo pack ridimensiona la cornice in modo che tutto il suo contenuto sia uguale alla dimensione preferita
		setVisible(true);
	}
}