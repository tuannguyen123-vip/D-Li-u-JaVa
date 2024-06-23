
package assignment;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien{
    private double doanhSo;
    private double hoaHong;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhSo, double hoaHong, String maNv, String hoTen, double luongCB, String phongban) {
        super(maNv, hoTen, luongCB, phongban);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap doanh so: ");
        doanhSo = sc.nextDouble();
        System.out.print("Moi ban nhap so hoa hong: ");
        hoaHong = sc.nextDouble();
    } 
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("Luong doanh so:"+doanhSo+ "Hoa hong: "+ hoaHong);
        
    }
    @Override
    public double getThuNhap() {
      return super.getLuongCB() +hoaHong +doanhSo;
    }

   
}
