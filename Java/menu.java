import java.util.Scanner;

class Menu {
  // Scrivere un programma con un menu di scelta
  public static void main(String[] args)
  {
    // Costruisco la struttura del menù
    System.out.println(" *** Fai la tua scelta *** ");
    System.out.println("Seleziona un evento:");
    System.out.println(" 0 - Uscire");
    System.out.println(" 1 ");
    System.out.println(" 2 ");
    Scanner input = new Scanner(System.in);

    // Acquisisco il valore per la scelta
    int r = input.nextInt();

    // Effettuo la verifica per l'evento selezionato
    if ( r == 0 ){
        System.out.println("Programma terminato");
    }

    if ( r == 1 ){
        System.out.println("Hello World");
    }

    if ( r == 2 ){
        System.out.println("Il mio nome e cognome è : FABIO DONATANTONIO" );
    }

    // Visualizzo l'errore di immissione di un valore non corretto
    if ( r != 0 && r != 1 && r != 2){
        System.out.println("Il valore inserito non e corretto");
    }
  }
}