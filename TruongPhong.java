
package assignment;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String maNv, String hoTen, double luongCB, String phongban) {
        super(maNv, hoTen, luongCB, phongban);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
     public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban luong trach nhiem: ");
       trachNhiem = sc.nextDouble();
    } 
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("Luong trach nhiem:"+trachNhiem);
        
    }
    
    @Override
    public double getThuNhap() {
       return super.luongCB + trachNhiem;
    }

    
   
}
