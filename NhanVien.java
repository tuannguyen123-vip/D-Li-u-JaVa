
package assignment;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNv;
    protected String hoTen;
    protected double luongCB;
    protected String phongban;

    public NhanVien() {
    }

    public NhanVien(String maNv, String hoTen, double luongCB, String phongban) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.phongban = phongban;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    
    

  public void nhap(){
       Scanner sc = new Scanner(System.in);
            System.out.print("Moi ban nhap ma nhan vien: ");
            maNv = sc.nextLine();
            System.out.print("Moi ban nhap ho va ten: ");
            hoTen = sc.nextLine();
            System.out.print("Moi ban nhap so luong: ");
            luongCB = sc.nextDouble();
           
  }
public void xuat(){
    System.out.print("Ma nhan vien cua ban la:"+ maNv +"\nHo va ten cua ban:\n"+ hoTen + "\nLuong CB cua ban la:\n"+luongCB);
}
    
    public abstract double getThuNhap();
   
    public double getThueTN(){
        double thue = 0;
        if (getThuNhap() < 9000000) {
            thue = 0;
        } else if(getThuNhap() >= 9000000 && getThuNhap() < 15000000){
            thue = getThuNhap() * 0.1;
        }else if (getThuNhap() >= 15000000) {
            thue = getThuNhap() * 0.12;
        }
       return thue;
    }
}
