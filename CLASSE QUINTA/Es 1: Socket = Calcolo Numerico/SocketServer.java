import java.net.*;
import java.util.*;
import java.io.*;

public class SocketServer {

    private final static int PORTA_SERVER = 9999;
    private static ServerSocket serverSocket;
    private static Socket clientSocket;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(PORTA_SERVER);
        } catch (Exception e) {
            System.err.println("Errore interno del server " + e.getMessage());
        }

        gestisciClient();
    }

    public static void gestisciClient() {
        try {
            clientSocket = serverSocket.accept();
            Scanner input = new Scanner(clientSocket.getInputStream());
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream());
            int numeroRicevuto = input.nextInt(); // numero ricevuto dal client
            int risposta;

            if (numeroRicevuto % 7 == 0) {
                risposta = numeroRicevuto;
                output.println(risposta);
            } else {
                risposta = numeroRicevuto;
                output.println(risposta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
