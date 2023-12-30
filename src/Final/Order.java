package Final;

import java.util.Date;

public class Order {
    Customer customer;
    int product_reference;
    Date date;
    public Order(Customer customer,int product_reference){
        this.customer=customer;
        this.product_reference=product_reference;
        this.date=new Date();
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getProduct_reference() {
        return product_reference;
    }

    public Date getDate() {
        return date;
    }
}
