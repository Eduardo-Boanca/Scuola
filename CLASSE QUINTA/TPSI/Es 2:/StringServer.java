import java.io.*;
import java.net.*;

public class StringServer {
   public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        
        while(true) {
            Socket s = ss.accept();
            InputStreamReader input = new InputStreamReader(s.getInputStream());
            BufferedReader tastiera = new BufferedReader(input);
            tastiera.readLine();
            System.out.println("Il server ha ricevuto " + tastiera.readLine());

            PrintWriter output = new PrintWriter(s.getOutputStream(), true);
            output.println("Ciao dal server");
            s.close();
        }
    }
}
