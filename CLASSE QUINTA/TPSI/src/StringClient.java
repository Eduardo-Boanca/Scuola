import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
/* Eduardo Boanca 5^C Informatica
   Esercizio 2: Scambio di messaggi tramite Stringhe seguendo regole di protocollo
*/
public class StringClient {

    private final static int PORTA_SERVER = 9999;
    private final static String NOME_SERVER = "127.0.0.1";

    public static void main(String[] args) throws UnknownHostException, IOException {
        String numero = "";
        String message = "";
        String serverMessage = "";

        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(inputStream);
        Socket socket = new Socket(NOME_SERVER, PORTA_SERVER);

        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader in = new BufferedReader(input);
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Inserisci un numero: ");
        numero = keyboard.readLine();
        message = "NUMERO0;" + numero;
        //Client invia messaggio al Server
        output.println(message);

        //Client riceve messaggio dal Server
        serverMessage = in.readLine();
        //Avviene lo split del messaggio che viene poi inserito nell'array
        String split[] = serverMessage.split(";");
        //System.out.println("NUMERO SPLIT" + split[1]);
        if (split[1].equals("TRUE"))
            System.out.println("Il numero " + numero + " e' multiplo di 7");
        if (split[1].equals("FALSE"))
            System.out.println("Il numero " + numero + " non e' multiplo di 7");
        if (split[1].equals("ERROR"))
            System.out.println("Non è stato inserito un numero");
        socket.close();
    }
}