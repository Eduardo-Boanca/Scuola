import java.io.*;
import java.net.*;

public class StringServer {
    public static void main(String) {
        ServerSocket ss = new ServerSocket();
        
        while(true) {
            Socket s = ss.accept();
            InputStreamReader input = new InputStreamReader(s.getInputStream());
        }
    }
}
