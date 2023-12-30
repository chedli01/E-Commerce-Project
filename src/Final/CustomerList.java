package Final;

import java.util.ArrayList;

public class CustomerList {
    static ArrayList<Customer> customers=new ArrayList<>();;

    public static void showCustomers(){
        if (customers.isEmpty()){
            System.out.println("Empty");
        }
        for (int i=0;i<customers.size();i++){
            System.out.println("Customer "+i+" : "+customers.get(i).getUsername());
        }
    }
    public static void addCustomer(Customer customer) {
        int i=0;
        while (i<customers.size()) {
            if (customers.get(i).getUserId() == customer.getUserId()) {
                break;
            }
            i++;
        }
        if(i==customers.size()){
            customers.addLast(customer);
        }
        else {
            System.out.println("Customer Already exists");

        }

    }
    public static boolean searchCustomer(Customer customer){
        int i=0;
        while (i< customers.size()){
            if ((customers.get(i).getUsername().equals(customer.getUsername()))&&(customers.get(i).getPassword().equals(customer.getPassword()))){
                return true;
            }
            i++;
        }
        return false;
    }

}
