import java.io.*;

public class Main {
    public static void main(String args[]) {
        Lista lista = new Lista();
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int scelta = 0;
        boolean giusto;
        do {
            System.out.println("1 - Inserisci Persona");
            System.out.println("2 - Visualizza Lista delle Persone");
            System.out.println("3 - Cerca Persona ");
            System.out.println("4 - Elimina Persona");
            System.out.println("5 - Esci");
            System.out.println("Scelta: ");
            do {
                do {
                    giusto = false;
                    try {
                        scelta = Integer.valueOf(tastiera.readLine()).intValue();
                        giusto = true;
                    } catch (Exception e) {
                        System.out.println("Input non corretto!");
                        System.out.println("Rinserisci il numero dell'operaione da svolgere: ");
                    }
                } while (!giusto);
                if (scelta < 1 || scelta > 5) {
                    System.out.println("Il valore che inserisci deve essere compreso tra 1 e 5");
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
            }
        } while (scelta != 5);
    }
}
