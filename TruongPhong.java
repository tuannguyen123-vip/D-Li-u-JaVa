
package sile7.Modeed;

import java.util.Scanner;

public class TruongPhong extends NhanVien{// TruongPhong là con của NhanVien
    // TruongPhong đc sử dụng tài sản pullic, protected
    //default (cùng gói) của cha.
    
    //Lớp con: Làm việc như bình thường. Muốn gọi đến tài sản của cha
    //thì super.tenThuocTinh, super.tenPhongThuc()

 private double trachNhiem;

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(int i, String nguyen_Van_Minh, double d) {
        super.xuat();
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
//super.toString(): gọi toString của cha
    @Override
    public String toString() {
        return super.toString()+ "TruongPhong{" + "trachNhiem=" + trachNhiem + '}';
    }
//ghi đè phương thức: Nếu cha, con có cùng phương thức cùng cú pháp 
    //phương thức của con đè lên phương thức của cha
    @Override
    public void xuat() {
        System.out.println(toString());
    }
    
    @Override 
    public void nhap() {
       super.nhap();
       Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap luong trach nhiem: ");
        this.trachNhiem = Double.parseDouble(sc.nextLine());
    }
    
}
