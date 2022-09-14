import java.util.ArrayList;

import javax.xml.bind.annotation.*;

public class OrderDetail {
    private String lineId;
    private String itemNumber;
    private int quantity = 0;
    private Double price;

    public String getLineId() {
        return lineId;
    }

    @XmlAttribute
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
