package ES1;
import java.util.Scanner; //serve per importare librerie che contengono classi di oggetti

/* --------------------------------
Eduardo Boanca 4C Informatica
Primo programma Java
---------------------------------*/
public class controllo {
    public static void main(String [] args)
    {
        int scelta;
        do
        {
            System.out.println(" *** Fai la tua scelta *** ");
            System.out.println("Seleziona un evento:");
            System.out.println("0 - Uscire");
            System.out.println("1 - Visualizza su schermo 'HELLO WORLD' ");
            System.out.println("2 - Visualizza su schermo un numero casuale");
            System.out.println("3 - Visualizza su schermo il tuo nome");
            Scanner sc = new Scanner(System.in); //oggeto sc in classe Scanner
            System.out.println("Scelta: ");
            scelta = sc.nextInt(); /* Scans the next token of the input as an int. 
                                    su oggetto sc, prende il numero int da tastiera e lo inserisce nella variabile scelta */


        switch (scelta) 
        {
            case 0:
                System.out.println("Uscita dal programma");
            break;

            case 1:
                System.out.println("Hello World!");
            break;

            case 2:
                int random = (int)(Math.random() * 100 + 1); //stampa un numero partendo da 0 arrivando a 99 + 1
                System.out.println("Il numero casuale è " + random);
            break;

            case 3:
                Scanner input = new Scanner (System.in);
                System.out.print("\nInserisci il nome: ");
                String firstName = input.next(); //prende un input stringa
                System.out.print("Inserisci il cognome: ");
                String lastName = input.next();
                System.out.println();
                System.out.println("Ciao "+firstName+" "+lastName);
            break;

            default:
                System.out.println("ERRORE! Premi Invio per continuare e reinserisci la scelta");
                new java.util.Scanner(System.in).nextLine(); //equivale al system("pause")
                System.out.println("\033[H\033[2J");
            break;
        }

        }while(scelta < 0 || scelta > 3);

    }
}
