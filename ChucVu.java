
import java.util.Scanner;


public class ChucVu {
   private String macv;
   private String tenCV;
   private double phucap;

    public ChucVu() {
    }

    public ChucVu(String macv, String tenCV, double phucap) {
        this.macv = macv;
        this.tenCV = tenCV;
        this.phucap = phucap;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public double getPhucap() {
        return phucap;
    }

    public void setPhucap(double phucap) {
        this.phucap = phucap;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "macv=" + macv + ", tenCV=" + tenCV + ", phucap=" + phucap + '}';
    }
   public void nhapThongTin(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Moi ban nhap ma chuc vu: ");
       macv = sc.nextLine();
       System.out.print("Moi ban nhap ten chuc vu: ");
       tenCV =  sc.nextLine();
       System.out.print("Moi ban nhap so phu cap: ");
       phucap = Double.parseDouble(sc.nextLine());
   }
   public void inThongTin(){
       System.out.println(toString());
   }
}
