import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Ordine {
    
    private String customerId;
    String orderId;
    Double orderTotal;

    ArrayList<OrderDetail> orderDetailList;

    public String getCustomerId() {
        return customerId;
    }

    @XmlElement(name = "CustomerID")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    //Crea attributo per il nodo genitore
    @XmlAttribute
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    @XmlElement(name = "OrderTotal")
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public ArrayList<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    //Aggiunge un "wrapper" intorno alla rappresentazione XML
    @XmlElementWrapper(name = "OrderDetails")

    @XmlElement(name = "OrderDetail")
    public void setOrderDetailList(ArrayList<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

}
