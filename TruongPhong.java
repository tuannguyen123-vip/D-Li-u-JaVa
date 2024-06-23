
import java.util.Scanner;


public class TruongPhong extends ChucVu{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String macv, String tenCV, double phucap) {
        super(macv, tenCV, phucap);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public String toString() {
        return super.toString()+"TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc =  new Scanner(System.in);
        System.out.print("Moi ban nhap luong trach nhiem: ");
        trachNhiem = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(toString());
    }
    
}
