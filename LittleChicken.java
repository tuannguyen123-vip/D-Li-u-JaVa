
import java.util.Scanner;


public class LittleChicken extends Chicken{
    private double weight;

    public LittleChicken() {
    }

    public LittleChicken(double weight) {
        this.weight = weight;
    }

    public LittleChicken(double weight, String name, String color, int price) {
        super(name, color, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+"LittleChicken{" + "weight=" + weight + '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap weight: ");
        weight = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void inThongTIn() {
        super.inThongTIn();
        System.out.println(toString());
    }
    
}
