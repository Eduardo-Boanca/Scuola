import java.net.*;
import java.io.*;

public class SocketServer {

    private final static int PORTA_SERVER = 9999
    private ServerSocket serverSocket
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    private String numeroRicevuto; 	// numeri ricevuta dal client
    private String numeroInviato;  	// numeri inviata dal server

    public  SocketServer {
        try {
            serverSocket = new ServerSocket(PORTA_SERVER);
        } catch (Exception e) {
            System.err.println("Errore interno del server " + e.getMessage());
        }
    }

    public void attendi() {
        System.out.println("Server: in esecuzione");

        try {
            clientSocket = serverSocket.accept();
            serverSocket.close();

            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream());
        } catch (Exception e) {
            System.err.println("Errore di connessione del client " + e.getMessage());
        }
    }

    public void comunica() {
        try {

            //RIVEDERE COME FARE LA RICEZIONE DEL NUMERO DA PARTE DEL SERVER DEL

            System.out.println("Server: ricevo il numero dal client: " + numeroRicevuto; */

            if(numeroRicevuto % 7 == 0)
                out.println("Il numero è multiplo di 7");
            else
                out.println("Il numero non è multiplo di 7");

            System.out.println("Server: chiusura connessione");
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Errore di comunicazione " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SocketServer server;

        server = new SocketServer();
        server.attendi();
        server.comunica();
    }

}
