import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class IntServer {
    public final static int COST=3;
    public static void main(String[] args) throws IOException {
        int var=0;
        String clientMessage= "";
        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        PrintWriter output = new PrintWriter(s.getOutputStream(), true);
        InputStreamReader inputStream = new InputStreamReader(s.getInputStream());
        BufferedReader input = new BufferedReader(inputStream);

        for (int i = 0; i < COST; i++) {
            String read = input.readLine();
            System.out.println(read);
            String[] dividi = read.split(";");
            int temp=Integer.parseInt(dividi[1]);
            var=var+temp;
            System.out.println("Server0;" + var);
            System.out.println("Il numero ricevuto e': " + clientMessage);

        }
        var=var/COST;
        String tot = "Totale;" +var;
        output.println(tot);
        s.close();
    }
}
