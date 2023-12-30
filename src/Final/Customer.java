package Final;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.Scanner;

public class Customer extends User implements Search{
    String role;
    int customerNumber;
    ArrayList<Product> cart;
    public Customer(String username,String password,int userId,int customerNumber){
        super(username,password,userId);
        this.customerNumber=customerNumber;
        this.role="Customer";
        this.cart=new ArrayList<>();
    }



    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }


    public int getCustomerNumber() {
        return customerNumber;
    }
    ///////////////////////////////////////////////////////////////////
    public void showProductList(){
        ProductList.showList();
    }
    ///////////////////////////////
    public void showCart(){
        for(int i=0;i<cart.size();i++){
            System.out.println("Product "+i+" ["+cart.get(i).toString()+" ]");
        }
    }
    ///////////////////////////////////////////////////////
    public void addToCart() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Reference of product you want to add to your cart");
        int reference=scanner.nextInt();
        for (int i=0;i<ProductList.getProducts().size();i++){
            if(ProductList.getProducts().get(i).getReference()==reference){
                if (ProductList.getProducts().get(i).getQuantity()==0){
                    System.out.println("Out Of Stock");
                }
                else {
                cart.addLast(ProductList.getProducts().get(i));
                ProductList.getProducts().get(i).setQuantity(ProductList.getProducts().get(i).getQuantity()-1);
                System.out.println("Product added Successfully To Cart");

                }
            }
        }
    }
    //////////////////////////////////////////////////////
    public void searching(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("To Filter Products by Category press 1");
        System.out.println("To Filter Products by Price press 2 ");
        int key=scanner.nextInt();
        if(key==1){
            ProductList.searchByCategory();

        }
        else if (key==2){
            ProductList.searchByPriceInterval();
        }
        else {
            System.out.println("Invalid command");
        }
    }
    ////////////////////////////////////////////////////
    public void passOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reference Of The Product You Want To Order");
        int reference = scanner.nextInt();
        Order order = new Order(this, reference);
        for (int j = 0; j < cart.size(); j++) {
            if (cart.get(j).getReference() == reference) {
                OrderHistory.addOrder(order);
                System.out.println("It is Time For Payment! "+" Product :"+cart.get(j).getName()+" with price:"+cart.get(j).getPrice());
                System.out.println("Credit Card :");
                int credit_card= scanner.nextInt();
                System.out.println("Expiration Date");
                String date=scanner.nextLine();
                System.out.println("Discount code");
                String discount_code=scanner.nextLine();
                if (cart.get(j).getDiscount_code().equals(discount_code)){
                    int price= (int) (cart.get(j).getPrice()-cart.get(j).getPrice()*0.5);
                    System.out.println("You got a discount !Payment Done only with price :"+price);
                }
                else {
                    System.out.println("No discount !Payment Done  with price :"+cart.get(j).getPrice());
                }



            }
        }


    }
    ///////////////////////////////////////////////
    public void rateProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reference Of The Product You Want To Rate");
        int reference = scanner.nextInt();
        System.out.println("what is the value of your Rating");
        int rate=scanner.nextInt();
        for (int j=0;j<ProductList.getProducts().size();j++){
            if (ProductList.getProducts().get(j).getReference()==reference){
                if(rate==0){
                    ProductList.getProducts().get(j).setRating0();
                }
                else if(rate==1){
                    ProductList.getProducts().get(j).setRating1();
                }
                else{
                    ProductList.getProducts().get(j).setRating2();
                }

            }

        }
    }
    ////////////////////////////////////////////////////







    ///////////////////////////////////////////////////
    public void customerMenu() throws OutOfStockException {
        while (true){
            Scanner Sc = new Scanner(System.in);
            System.out.println("To see All Products press 1");
            System.out.println("To see Products added To your Cart press 2 ");
            System.out.println("TO add a Product to your Cart press 3");
            System.out.println("To Search Specific Products Press 4");
            System.out.println("To Pass An Order Press 5");
            System.out.println("To Rate A Product Press 6");
            System.out.println("To Quit userMenu Press 7");
            int key=Sc.nextInt();
            if (key==1){
                this.showProductList();
            }
            else if (key==2){
                this.showCart();
            }
            else if (key==3){
                this.addToCart();
            }
            else if (key==4){
                this.searching();
            }
            else if(key==5){
                this.passOrder();
            }
            else if (key==6){
                this.rateProduct();
            }
            else if (key==7){
                break;
            }

            else {
                System.out.println("Wrong Command");
            }
        }
    }



}
