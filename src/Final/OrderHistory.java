package Final;

import java.util.ArrayList;

public class OrderHistory {
    static ArrayList<Order> orders=new ArrayList<>();

    public static ArrayList<Order> getOrders() {
        return orders;
    }
    public static void showOrdersHistory(){
        if (orders.isEmpty()){
            System.out.println("Empty");
        }
        else {
            for(int i=0;i<orders.size();i++) {
                System.out.println("Order "+i+" ["+"Customer :"+orders.get(i).getCustomer().getUsername()+"-  Product_Reference: "+orders.get(i).getProduct_reference()+"- Date:   "+orders.get(i).getDate()+" ]");
            }}
    }
    public static void addOrder(Order order){
        orders.addLast(order);
    }
}
