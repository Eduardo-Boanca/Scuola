import java.net.*;
import java.nio.file.Paths;
import java.io.*;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://ergast.com/api/f1/current/last/results.xml");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            // ArrayList<String> raceResults = new ArrayList<String>();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode " + responseCode);
            } else {
                StringBuilder infoString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    infoString.append(scanner.nextLine());
                }

                // DATI SU FILE JSON CON JACKSON API
                // ObjectMapper mapper = new ObjectMapper();
                // try {
                //     mapper.writeValue(Paths.get("Race_Results.json").toFile(), infoString);
                // } catch (JsonProcessingException e) {
                //     e.printStackTrace();
                // }

                // *****PER ESPORTARE UN FILE TXT*****//
                try {
                PrintWriter out = new PrintWriter("Race_Results.txt");
                out.println(infoString.toString());
                } catch (FileNotFoundException e) {
                System.err.println("File doesn't exist");
                e.printStackTrace();
                }


                //PER ESPORTARE I DATI IN XML
                // try {
                // // Classe responsabile per il processo di creazione del file XML da Oggetto
                // JAXBContext jaxbContext = JAXBContext.newInstance(Main.class);
                // Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

                // jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

                // // Stampa il file nella console
                // jaxbMarshaller.marshal(infoString, System.out);

                // // Crea il file nel PC
                // FileOutputStream output = new FileOutputStream("Race_Results.xml");
                // jaxbMarshaller.marshal(infoString, output);
                // } catch (JAXBException e) {
                // e.printStackTrace();
                // }

                scanner.close();

                //System.out.println(infoString);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}