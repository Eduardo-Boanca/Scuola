import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.swixml.SwingEngine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlToObj {
    public static void main(String[] args) throws Exception {
        Macchina macchina = new Macchina();
        Macchina macchina2 = new Macchina();
        macchina.setBrand("Mclaren");
        macchina.setAnno("2022");
        macchina.setTarga("X1BC34WK");

        macchina2.setBrand("Cadillac");
        macchina2.setAnno("2022");
        macchina2.setTarga("A1B2C3D4");

        JAXBContext context = JAXBContext.newInstance(Macchina.class);
        Marshaller marshall = context.createMarshaller();
        marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshall.marshal(macchina, new File("macchina.xml"));
        //marshall.marshal(macchina2, new File("macchina2.xml"));


    }


}
