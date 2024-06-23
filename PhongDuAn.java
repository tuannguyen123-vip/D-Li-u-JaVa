
package poly;

import java.util.Scanner;

public class PhongDuAn extends PhongHoc{
    private double dienTich;

    public PhongDuAn() {
    }

    public PhongDuAn(double dienTich) {
        this.dienTich = dienTich;
    }

    public PhongDuAn(double dienTich, String tenPhong, int soSV, double tang) {
        super(tenPhong, soSV, tang);
        this.dienTich = dienTich;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "PhongDuAn{" + "dienTich=" + dienTich + '}';
    }

  public void nhapDT(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Moi ban nhap dien tich: ");
      dienTich = Double.parseDouble(sc.nextLine());
  }
    public void xuatDT(){
        System.out.println(super.toString());  
    }
}
