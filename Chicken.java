
import java.util.Scanner;


public class Chicken {
    private String name;
    private String color;
    private int price;

    public Chicken() {
    }

    public Chicken(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chicken{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap name: ");
        name = sc.nextLine();
        System.out.print("Moi ban nhap color: ");
        color = sc.nextLine();
        do {            
        System.out.print("Moi ban nhap price: "); 
        price = Integer.parseInt(sc.nextLine());
        } while (price <=0 );
     }
    public void inThongTIn(){
        System.out.println(toString());
    }
}
