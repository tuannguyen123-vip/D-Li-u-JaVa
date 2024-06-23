
package poly;

import java.util.Scanner;

public class PhongHoc {
private String tenPhong;
private int soSV;
private double tang;

    public PhongHoc() {
    }

    public PhongHoc(String tenPhong, int soSV, double tang) {
        this.tenPhong = tenPhong;
        this.soSV = soSV;
        this.tang = tang;
    }
   
    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public double getTang() {
        return tang;
    }

    public void setTang(double tang) {
        this.tang = tang;
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "tenPhong=" + tenPhong + ", soSV=" + soSV + ", tang=" + tang + '}';
    }

  
   public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.print("Moi ban nhap so SV: ");
        soSV = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap so tang: ");
        tang = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println("\n"+tenPhong+"\n"+soSV+"\n"+tang);       
        
    }
}