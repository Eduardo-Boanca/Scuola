import java.net.*;
import java.io.*;
import java.util.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://ergast.com/api/f1/current/last/results");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode " + responseCode);
            } else {
                StringBuilder infoString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while(scanner.hasNext()) {
                    infoString.append(scanner.nextLine()); 
                }

                scanner.close();

                System.out.println(infoString);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}