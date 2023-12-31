package Final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OutOfStockException, ExistentObjectException {
        Product product=new Tv(1,"Tv LG","Tv","Curved 40 pixel 144Hz",4,2000,"10x1","LG");
        Product product1=new Pc(2,"Pc Gamer","Pc","I7 12600H RTX-4050 16GBR",1,3600,"x45","Msi");
        Product product2=new Keyboard(3,"Mechanic-keyboard","Keyboard","Rgb ",10,100,"012vx","Logitech");
        Product product3=new Tv(4,"Tv Samsung","Tv","Curved 60 pixel 144Hz",4,4000,"10x1","Samsung");
        Product product4=new Pc(5,"Pc Pro","Pc","I9 13000H RTX-2060 8GBR",1,4000,"0112","HP");
        Product product5=new Keyboard(6,"Normal Keyboard","Keyboard","Every Day uses keyboard",7,50,"azerty1","Logitech");
        ProductList.addProduct(product);
        ProductList.addProduct(product1);
        ProductList.addProduct(product2);
        ProductList.addProduct(product3);
        ProductList.addProduct(product4);
        ProductList.addProduct(product5);
        Customer customer1=new Customer("Yasmine","0000",1,1);
        CustomerList.addCustomer(customer1);
        Admin admin1=new Admin("chedli","0000",2,1);
        Admin admin2=new Admin("ahmed","1234",3,2);
        AdminList.addAdmin(admin1);
        AdminList.addAdmin(admin2);
        while (true) {
            Scanner s=new Scanner(System.in);
            System.out.println("Welcome to our Online Shop");
            System.out.println("To Login as a Customer press 1");
            System.out.println("To Login as an Admin press 2");
            System.out.println("To Sign-Up press 3");
            System.out.println("To Exit press 4");
            int key=s.nextInt();


            //////////////////////////////
            if(key==1){
                System.out.println("UserName :");
                String username=s.next();
                System.out.println("Password :");
                String password=s.next();
                System.out.println("UserId :");
                int userId=s.nextInt();
                System.out.println("CustomerNumber :");
                int customerNumber=s.nextInt();
                Customer customer=new Customer(username,password,userId,customerNumber);
                if (CustomerList.searchCustomer(customer)){
                    System.out.println("Welcome Customer "+customer.getUsername());
                    customer.customerMenu();
                }
                else {
                    System.out.println("Invalid Informations");
                }
            }
            /////////////////////////////////////////////////
            else if (key==2){
                System.out.println("UserName :");
                String username=s.next();
                System.out.println("Password :");
                String password=s.next();
                System.out.println("UserId :");
                int userId=s.nextInt();
                System.out.println("AdminNumber :");
                int adminNumber=s.nextInt();
                Admin admin=new Admin(username,password,userId,adminNumber);
                if (AdminList.searchAdmin(admin)){

                    admin.adminMenu();
                }
                else {
                    System.out.println("Invalid Informations");
                }
            }
            ////////////////////////////////////////////////
            else if (key==3){
                System.out.println("UserName :");
                String username=s.next();
                System.out.println("Password :");
                String password=s.next();
                System.out.println("UserId :");
                int userId=s.nextInt();
                System.out.println("CustomerNumber :");
                int customerNumber=s.nextInt();
                Customer customer=new Customer(username,password,userId,customerNumber);
                CustomerList.addCustomer(customer);
                System.out.println("Account Created Successfully");
            }
            ////////////////////////////////////////////////
            else {
                break;
            }

        }



    }
}