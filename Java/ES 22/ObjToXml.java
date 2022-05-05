import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ch.randelshofer.quaqua.ext.base64.Base64.OutputStream;

public class ObjToXml {
    public static void main(String[] args) throws FileNotFoundException {
        
        Ordine ordine = new Ordine();
        ordine.setCustomerId("Cliente01");
        ordine.setOrderId("1");
        ordine.setOrderTotal(100.00);

        ArrayList<OrderDetail> orders = new ArrayList<OrderDetail>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setLineId("Line01");
        orderDetail.setItemNumber("Item05");
        orderDetail.setQuantity(10);
        orderDetail.setPrice(15.99);
        orders.add(orderDetail);

        orderDetail = new OrderDetail();
        orderDetail.setLineId("Line02");
        orderDetail.setItemNumber("Item10");
        orderDetail.setQuantity(5);
        orderDetail.setPrice(3.99);
        orders.add(orderDetail);

        ordine.setOrderDetailList(orders);

        try {
            //Classe responsabile per il processo di creazione del file XML da Oggetto
            JAXBContext jaxbContext = JAXBContext.newInstance(Ordine.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Stampa il file nella console
            jaxbMarshaller.marshal(ordine, System.out);

            //Crea il file nel PC
            FileOutputStream output = new FileOutputStream("Ordine.xml");
            jaxbMarshaller.marshal(ordine, output);
        } catch(JAXBException e) {
            e.printStackTrace();
        }
    }
}
