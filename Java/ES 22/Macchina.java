import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Macchina {

    private String brand;
    private String anno;
    private String targa;

    public String getBrand() {
        return brand;
    }

    @XmlElement
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAnno() {
        return anno;
    }

    @XmlElement
    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getTarga() {
        return targa;
    }

    @XmlElement
    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Macchina [Brand: " + brand + ", anno: " + anno + ", targa: " + targa + "]";
    }

}