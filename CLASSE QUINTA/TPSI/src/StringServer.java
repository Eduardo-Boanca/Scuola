import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
/* Eduardo Boanca 5^C Informatica
   Esercizio 2: Scambio di messaggi tramite Stringhe seguendo regole di protocollo
*/
public class StringServer {

    private final static int PORTA_SERVER = 9999;

    public static boolean isNumber(String splitNumber) {
        for (int i = 0; i < splitNumber.length(); i++) {
            char num = splitNumber.charAt(i);
            if (num < '0' || num > '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String clientMessage = "";
        int numero = 0;
        ServerSocket socketServer = new ServerSocket(PORTA_SERVER);

        while (true) {
            Socket socket = socketServer.accept();
            InputStreamReader inputStream = new InputStreamReader(socket.getInputStream());
            BufferedReader input = new BufferedReader(inputStream);
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            //Il server riceve il messaggio dal client
            clientMessage = input.readLine();
            System.out.println("Il numero ricevuto e': " + clientMessage);
            //Avviene lo split del messaggio che viene poi inserito nell'array
            String[] split = clientMessage.split(";");

            if (isNumber(split[1])) {
                numero = Integer.valueOf(split[1]);
                System.out.println("Numero dopo lo split(): " + numero);

                if (numero % 7 == 0)
                    //Il server invia il messaggio al client
                    output.println("MESSAGE;TRUE");
                else
                    //Il server invia il messaggio al client
                    output.println("MESSAGE;FALSE");
            } else {
                //Il server invia il messaggio al client
                System.out.println("MESSAGE;ERROR");
            }
        }
    }
}