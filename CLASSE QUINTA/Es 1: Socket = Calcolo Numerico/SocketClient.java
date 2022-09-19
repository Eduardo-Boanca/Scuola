import java.net.*;
import java.util.*;
import java.io.*;

public class SocketClient {

    private final static int PORTA_SERVER = 9999;
    private final static String NOME_SERVER = "127.0.0.1";
    private int numeroUtente;
    private int numeroServer;
    private static Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public static void main(String[] args) throws IOException {
        try {
            clientSocket = new Socket(NOME_SERVER, PORTA_SERVER);
        } catch (UnknownHostException e) {
            System.out.println("Host sconosciuto " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Errore di comuncazione " + e.getMessage());
        }

        accessoServer();
    }


    public static void accessoServer() {
        try {
            Scanner input = new Scanner(clientSocket.getInputStream());
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            //Scanner inputUtente = new Scanner(System.in);

            int numeroInserito, rispostaServer;

            do {
                System.out.println("Inserisci il numero ");
                numeroInserito = ((int) Math.random()*100);
                //numeroInserito = inputUtente.nextInt();

                //invio numeri al server
                output.println(numeroInserito);
                rispostaServer = input.readLine(); //ricevo risposta dal server
                System.out.println("SERVER: " + rispostaServer);
            } while(numeroInserito != 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connetti() {
        System.out.println("Client: creazione della connessione");
    }

    public void comunica() {
        try {
            numeroUtente = ((int) (Math.random()*70));
            System.out.println("numero utente: " + numeroUtente);
            System.out.println("Client: invio del numero al server");
            out.println(numeroUtente);
            numeroServer = in.nextInt();
            System.out.println("Client: Risposta del server: " + numeroServer);
            System.out.println("Chiusura connessione");
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Errore di comunicazione");
        }
    }


}
