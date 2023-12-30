package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {
    static ArrayList<Product> products=new ArrayList<>();;


    public static ArrayList<Product> getProducts() {
        return products;
    }
    public static void showList(){
        if (products.isEmpty()){
            System.out.println("No products");
        }
        else {
        for(int i=0;i<products.size();i++) {
            System.out.println("Product "+i+" ["+products.get(i).toString()+" ]");
        }}
    }
    public static void addProduct(Product product) {
        int i=0;
        while (i<products.size()){
            if(products.get(i).getReference()==product.getReference()){
                break;
            }
            i++;
        }
        if (i==products.size()){
            products.addLast(product);
        }
        else {
           System.out.println("Product Already Exists"); ;
        }

    }
    public static void removeProduct(Product product){
        int i=0;
        while (i< products.size()){
            if(products.get(i).getReference()==product.reference){
                products.remove(products.get(i));
            }
            i++;
        }
    }
    public static void modify(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("reference :");
        int reference=scanner.nextInt();
        int i=0;

        while (i<products.size()){
            if (products.get(i).getReference()==reference){
                products.get(i).manipulate();
                break;
            }
            i++;
        }
    }
    public static void searchByCategory(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Category :");
        scanner.nextLine();
        String category=scanner.nextLine();
        for (int i=0;i<products.size();i++){
            if (products.get(i).getCategory().equals(category)){
                System.out.println("Product "+i+" ["+products.get(i).toString()+" ]");
            }
        }

    }
    public static void searchByPriceInterval(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Minimal Price ");
        int min_price=scanner.nextInt();
        System.out.println("Maximal Price ");
        int max_price=scanner.nextInt();
        for (int i=0;i<products.size();i++){
            if ((products.get(i).getPrice()>=min_price)&&(products.get(i).getPrice()<max_price)){
                System.out.println("Product "+i+" ["+products.get(i).toString()+" ]");
            }
        }



    }
}
