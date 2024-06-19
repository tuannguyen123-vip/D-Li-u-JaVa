
package sile7.Modeed;

import java.util.Scanner;


public abstract class NhanVien {
     private String hoTen;
     private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", luong=" + luong + '}';
    }
    
    public void nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Moi ban nhap ho ten: ");
         this.hoTen = sc.nextLine();
         System.out.print("Moi ban nhap luong: ");
         this.luong = Double.parseDouble(sc.nextLine());
       }
     public void xuat(){
         System.out.print(toString());
     }

}
