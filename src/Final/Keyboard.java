package Final;

public class Keyboard extends Product{
    String brand;
    public Keyboard(int reference,String name,String category,String description,int quantity,int price,String discount_code,String brand){
        super(reference,name,category,description,quantity,price,discount_code);
        this.brand=brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
}
