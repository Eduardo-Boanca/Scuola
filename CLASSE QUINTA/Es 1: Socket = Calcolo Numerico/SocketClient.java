import java.net.*;
import java.io.*;

public class SocketClient {

    private final static int PORTA_SERVER = 9999;
    private final static String NOME_SERVER = "127.0.0.1";
    private int numeroUtente;
    private int numeroServer;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public SocketClient() throws IOException, UnknownHostException {
        clientSocket = new Socket(NOME_SERVER, PORTA_SERVER);
        out = new PrintWriter(clientSocket.getOutputStream());
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
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
            numeroServer = in.readLine();
            System.out.println("Client: Risposta del server: " + numeroServer);
            System.out.println("Chiusura connessione");
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Errore di comunicazione");
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            Socket client = new SocketClient();
            client.connetti();
            client.comunica();
        } catch (UnknownHostException e) {
            System.out.println("Host sconosciuto " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Errore di comuncazione " + e.getMessage());
        }
    }
}
