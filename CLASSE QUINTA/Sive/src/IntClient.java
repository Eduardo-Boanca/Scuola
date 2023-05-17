import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class IntClient {
    public static void main(String[] args) throws IOException {
        String messaggio;
        Socket s = new Socket("localhost", 9999);
        PrintWriter output = new PrintWriter(s.getOutputStream(), true);

        for (int i = 0; i < 3; i++) {
            int tmp =(int)(Math.random() * 10);
            output.println(tmp);
            messaggio = "NUMERO" + i+";" + tmp;
            System.out.println(messaggio);
            output.println(messaggio);
        }
        //System.out.println(s.getInputStream().read());
        s.close();
    }
}


