import java.io.*;

public class Persona {// inizio classe

  // attributi
  private String nome = "";
  private String cognome = "";

  public Persona(String myNome, String myCognome) {
    this.nome = myNome; // this = di questo oggetto
    this.cognome = myCognome;
  }

  public Persona() {

  }

  @Override
  public String toString() {
    String str = (this.nome + " " + this.cognome);
    return str;
  }

  public boolean equals(Persona temp) {
    boolean b;
    if ((temp.getNome().equals(this.nome)) && (temp.getCognome().equals(this.cognome))) {
      b = true;
    } else
      b = false;
    return b;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String myNome) {
    myNome = nome;
  }

  public String getCognome() {
    return this.cognome;
  }

  public void setCognome(String myCognome) {
    myCognome = cognome;
  }

  // metodo che inserisce il nome nella stringa
  public String input_nome() {
    boolean controllo = false;
    String n = "";
    boolean numeric = false;

    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    Function.clearConsole();
    do {
      System.out.print("Inserire il nome della persona: ");
      controllo = false;
      try {
        n = tastiera.readLine();

      } catch (Exception e) {
        Function.clearConsole();
        System.out.print("Inserire il nome della persona: ");
        controllo = true;
      }
    } while (controllo == true || numeric == true);
    Function.clearConsole();
    return n;
  }

  // metodo che inserisce il cognome nella stringa
  public String input_cognome() {
    boolean controllo = false;
    String c = "";
    boolean numeric = false;
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    Function.clearConsole();
    do {
      System.out.print("Inserire il cognome della persona: ");
      controllo = false;
      try {
        c = tastiera.readLine();

      } catch (Exception e) {
        Function.clearConsole();
        System.out.print("Inserire il cognome della persona: ");
        controllo = true;
      }
    } while (controllo == true || numeric == true);
    Function.clearConsole();
    return c;
  }
}