import java.io.*;
/**
 * @author Eduardo Boanca
 * @version 1.00
 */
public class Main {
    
    /** 
     * @param args[]
     */
    public static void main(String args[]) {
        Lista lista = new Lista();
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int scelta = 0;
        boolean correct;
        do {
            System.out.println("1 - Inserisci Persona");
            System.out.println("2 - Visualizza Lista delle Persone");
            System.out.println("3 - Cerca Persona ");
            System.out.println("4 - Elimina Persona");
            System.out.println("5 - Importa file CSV");
            System.out.println("6 - Esporta CSV");
            System.out.println("7 - Importa file JSON");
            System.out.println("8 - Esporta JSON");
            System.out.println("9 - Esci");
            System.out.println("Scelta: ");
            do {
                do {
                    correct = false;
                    try {
                        scelta = Integer.valueOf(tastiera.readLine()).intValue();
                        correct = true;
                    } catch (Exception e) {
                        System.out.println("Input non corretto!");
                        System.out.println("Rinserisci il numero dell'operaione da svolgere: ");
                    }
                } while (!correct);
                if (scelta < 1 || scelta > 5) {
                    System.out.println("Il valore che inserisci deve essere compreso tra 1 e 9");
                    System.out.println("Reinserisci il numero");
                }
            } while (scelta < 1 || scelta > 5);
            switch (scelta) {
                case 1:
                    lista.inserisci();
                    break;
                case 2:
                    lista.stampa();
                    break;
                case 3:
                    if (lista.contiene())
                        System.out.println("\nLa persona cercata si trova nella lista\n");
                    else
                        System.out.println("\nLa persona cercata NON si trova nella lista\n");
                    break;
                case 4:
                    lista.elimina();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
            }
        } while (scelta != 9);
    }
}
