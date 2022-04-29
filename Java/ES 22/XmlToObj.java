import java.io.File;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
 
public class XmlToObj {
 
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Macchina.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
 
            File file = new File("macchina.xml");
            File file2 = new File("macchina2.xml");
            Macchina macchina = (Macchina) jaxbUnmarshaller.unmarshal(file);
            System.out.println(macchina);

            Macchina macchina2 = (Macchina) jaxbUnmarshaller.unmarshal(file2);
            System.out.println(macchina2);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}