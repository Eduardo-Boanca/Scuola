import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
    public static void main (String[] args)
    {
        int numero = 10;
        
        //creare la connessione con il server
        try{
            Socket clientSocket = new Socket("localhost",9999);
            System.out.println("Il numero è: " + numero);
            //inviare il numero 
            clientSocket.getOutputStream().write(numero);
            if(clientSocket.getInputStream().read() == 0) {
                System.out.println("Il Numero " + numero + " è divisibile per 7");
            } else {
                System.out.println("Il Numero " + numero + " non è divisibile per 7");
            }
            } catch (UnknownHostException e){
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
}