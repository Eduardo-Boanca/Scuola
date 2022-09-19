import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer{
    public static void main (String[] args)
    {
        try{
            //creazione del server
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true)
            {
                //accettare connessioni dal cliente 
                Socket clientSocket = serverSocket.accept();
                //leggere i dati passati 
                int numero = clientSocket.getInputStream().read();
                numero = numero % 7;
                clientSocket.getOutputStream().write(numero);
                //chiusura della connessione
                clientSocket.close();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}