package Final;

import java.util.Scanner;

public abstract  class Product {
    int reference;
    String name;
    String discount_code;
    String category;
    String description;
    int quantity;
    int price;
    int [] ratings;
    public Product(int reference,String name,String category,String description,int quantity,int price,String discount_code){
        this.reference=reference;
        this.name=name;
        this.category=category;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
        this.ratings=new int[3];
        this.discount_code=discount_code;

    }

    public String getDiscount_code() {
        return discount_code;
    }

    public void setRating0(){
        this.ratings[0]=this.ratings[0]+1;
    }
    public void setRating1(){
        this.ratings[1]=this.ratings[1]+1;
    }
    public void setRating2(){
        this.ratings[2]=this.ratings[2]+1;
    }
    public String showRatings(){
        return "Ratings [ "+ratings[0]+" , "+ratings[1]+" , "+ratings[2]+" ]";
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReference() {
        return reference;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return " -reference: "+reference+"  -name :"+name+" -category : "+category+" -price : "+price+" -quantity :"+quantity+" -description :"+description+" "+showRatings();
    }
    ////////////////////////////////////////////////////////////////////
    public void manipulate(){

            Scanner scanner=new Scanner(System.in);
            System.out.println("To Change reference press 1");
            System.out.println("To Change name press 2");
            System.out.println("To Change Category press 3");
            System.out.println("To Change description press 4");
            System.out.println("To Change price press 5");
            System.out.println("To Change quantity press 6");
            int key=scanner.nextInt();

            switch (key){
                case 1:
                    System.out.println("Enter the new reference:");
                    int reference=scanner.nextInt();
                    setReference(reference);
                    break;

                case 2:
                    System.out.println("Enter the new name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    setName(name);
                    break;
                case 3:
                    System.out.println("Enter the new category:");
                    scanner.nextLine();
                    String category = scanner.nextLine();
                    setCategory(category);
                    break;
                case 4:
                    System.out.println("Enter the new description:");
                    scanner.nextLine();
                    String description = scanner.nextLine();
                    setDescription(description);
                    break;
                case 5:
                    System.out.println("Enter the new price:");
                    int price = scanner.nextInt();
                    setPrice(price);
                    break;
                case 6:
                    System.out.println("Enter the new quantity:");
                    int quantity = scanner.nextInt();
                    setQuantity(quantity);
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }

        }


}

