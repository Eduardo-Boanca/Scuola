import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import ch.randelshofer.quaqua.ext.base64.Base64.OutputStream;

public class XmlToObj {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            // Ottiene l'input dal file
            FileInputStream input = new FileInputStream("Ordine.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Ordine.class);

            //Classe responsabile per il processo di creazione dell'Oggetto da file XML
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Ordine ordine = (Ordine) jaxbUnmarshaller.unmarshal(input);

            ArrayList<OrderDetail> orders = ordine.getOrderDetailList();

            for(int i = 0; i < orders.size(); i++) {
                System.out.println("Dettaglio Ordine: ");
                OrderDetail orderDetail = orders.get(i);
                
                System.out.println("Line ID: " + orderDetail.getLineId());
                System.out.println("Item Number: " + orderDetail.getItemNumber());
                System.out.println("Quantità: " + orderDetail.getQuantity());
                System.out.println("Prezzo: " + orderDetail.getPrice());

                System.out.println();

            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
