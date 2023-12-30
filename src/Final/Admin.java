package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    int adminNumber;

    String role;


    public Admin(String username,String password,int userId,int adminNumber){
        super(username,password,userId);
        this.adminNumber=adminNumber;
        this.role="Admin";

    }


    public int getAdminNumber() {
        return adminNumber;
    }
    public void setAdminNumber(int adminNumber) {
        this.adminNumber = adminNumber;
    }



    ////////////////////////////////////////////////////////
    public void banCustomer(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("CustomerNumber :");

        int customerNumber=Sc.nextInt();
        Customer customer=new Customer("x","x",0,customerNumber);
        System.out.println("To ban Customer With Id : "+customer.getCustomerNumber()+"Please Press 1 / To Cancel Please Press 2 ");
        int key= Sc.nextInt();
        if(key==1){
            int i=0;
            while (i< CustomerList.customers.size()){
                if(CustomerList.customers.get(i).getCustomerNumber()==customer.getCustomerNumber()){
                    CustomerList.customers.remove(CustomerList.customers.get(i));
                }
                i++;
            }
        }
        else {
            System.out.println("Ban Canceled");
        }
    }
    /////////////////////////////////////////////////////////
    public void showProductList(){
        ProductList.showList();
    }
    ////////////////////////////////////
    public void addProduct() throws ExistentObjectException {
        Scanner Sc = new Scanner(System.in);
        System.out.println("To Confirm Please Press 1 / To Cancel Please Press 2 ");
        int key= Sc.nextInt();
        if(key==1){
            System.out.println("Reference :");
            int reference=Sc.nextInt();
            System.out.println("Name :");
            Sc.nextLine();
            String name=Sc.nextLine();
            System.out.println("Category :");
            //Sc.nextLine();
            String category=Sc.nextLine();
            System.out.println("Description :");
            //Sc.nextLine();
            String description=Sc.nextLine();
            System.out.println("Quantity :");
            int quantity=Sc.nextInt();
            System.out.println("Price :");
            int price=Sc.nextInt();
            System.out.println("Brand :");
            Sc.nextLine();
            String brand=Sc.nextLine();
            System.out.println("Discount_Code :");
            String discount_code= Sc.nextLine();



            if (category.equals("Tv")){
                Product product=new Tv(reference,name,category,description,quantity,price,discount_code,brand);
                ProductList.addProduct(product);
                System.out.println("Product added Successfully");
            }
            else if (category.equals("Pc")){
                Product product=new Tv(reference,name,category,description,quantity,price,discount_code,brand);
                ProductList.addProduct(product);
                System.out.println("Product added Successfully");
            }
            else {
                Product product=new Keyboard(reference,name,category,description,quantity,price,discount_code,brand);
                ProductList.addProduct(product);
                System.out.println("Product added Successfully");
            }




        }
        else {
            System.out.println("Action Canceled");
        }
    }
    //////////////////////////////////////////////////////////////
    public void removeProduct(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("To Confirm Please Press 1 / To Cancel Please Press 2 ");
        int key= Sc.nextInt();
        if(key==1){
            System.out.println("Reference :");
            int reference=Sc.nextInt();
            Product product=new Pc(reference,"x","x","x",0,0,"x","x");
            ProductList.removeProduct(product);
        }
        else {
            System.out.println("Action Canceled");
        }

    }
    ///////////////////////////////////////////////////
    public void showCustomers(){
        CustomerList.showCustomers();
    }

    /////////////////////////////////////////////////////////////
    public void modifyProduct(){
        ProductList.modify();

    }
    ///////////////////////////////////////
    public void checkOrdersHistory(){
        OrderHistory.showOrdersHistory();
    }

    //////////////////////////////////////////
    public void adminMenu() throws ExistentObjectException {
        while (true){

            Scanner Sc = new Scanner(System.in);
            System.out.println("Welcome Admin "+this.username);
            System.out.println("To ban a Customer press 1");
            System.out.println("To See product List press 2");
            System.out.println("To add a product press 3");
            System.out.println("To remove a product press 4");
            System.out.println("To see customers list press 5");
            System.out.println("To modify a product press 6");
            System.out.println("To check Orders History press 7 ");

            System.out.println("To Exit press 8");
            int key= Sc.nextInt();
            if(key==1){
                this.banCustomer();
            }
            else if (key==2){
                this.showProductList();
            }
            else if (key==3) {
                this.addProduct();
            }

            else if (key==4){
                this.removeProduct();
            }
            else if (key==5){
                this.showCustomers();
            }
            else if (key==6){
                this.modifyProduct();
            }
            else if (key==7){
                this.checkOrdersHistory();
            }
            else{
                break;
            }


        }
    }


}
