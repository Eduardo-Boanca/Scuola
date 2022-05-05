import java.net.*;
import java.io.*;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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
            ArrayList<String> raceResults = new ArrayList<String>();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode " + responseCode);
            } else {
                StringBuilder infoString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                for (int i = 0; i < scanner.nextLine().length(); i++) {
                    while (scanner.hasNext()) {
                        infoString.append(scanner.nextLine());
                        raceResults.add(infoString.toString());
                    }
                }

                try {
                    // Classe responsabile per il processo di creazione del file XML da Oggetto
                    JAXBContext jaxbContext = JAXBContext.newInstance(Main.class);
                    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

                    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                    // Stampa il file nella console
                    // jaxbMarshaller.marshal(infoString, System.out);

                    // Crea il file nel PC
                    FileOutputStream output = new FileOutputStream("Race_Results.xml");
                    jaxbMarshaller.marshal(infoString, output);
                } catch (JAXBException e) {
                    e.printStackTrace();
                }

                scanner.close();

                // System.out.println(infoString);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}