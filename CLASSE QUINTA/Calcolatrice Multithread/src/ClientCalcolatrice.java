import java.io.*;
import java.net.*;

public class ClientCalcolatrice {

    private final static int PORTA_SERVER = 5555;
    private final static String NOME_SERVER = "127.0.0.1";

    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        try {
          Socket socket = new Socket(NOME_SERVER, PORTA_SERVER);
          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
          InputStreamReader isr = new InputStreamReader(socket.getInputStream());
          BufferedReader in = new BufferedReader(isr);

          while(true) {
              System.out.println("Inserisci il numero: ");
              String num1 = tastiera.readLine();
              out.println("Risultato: " + num1);
              String serverAnswer = in.readLine();

              if(serverAnswer.contains("Done:")) {
                  System.out.println("Primo numero inviato con successo al server(" + num1 + ")");
                  break;
              } else if (serverAnswer.contains("Error:")) {
                  System.out.println("Errore nell'invio del primo numero al server(" + num1 + ")");
                  System.out.println("Risposta del server: " + serverAnswer);
              }
          }
          while(true) {
              System.out.println("Inserisci l'operazione da eseguire: ");
              String operazione = tastiera.readLine();
              out.println("Operazione: " + operazione);
              String serverAnswer = in.readLine();
              if (serverAnswer.contains("Success:")) {
                  System.out.println("Operazione effettuata con successo");
              } else if (serverAnswer.contains("Error:")) {
                  System.out.println("Errore nell'invio dell'operazione al server(" + operazione + ")");
                  System.out.println("Risposta del server: " + serverAnswer);
              } else if (serverAnswer.contains("Risultato:")) {
                  System.out.println("Risultato: " + serverAnswer.split(":")[1]);
                  break;
              }
          }
          socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
