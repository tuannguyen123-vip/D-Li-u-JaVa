
import java.util.Scanner;


public class NhanVien {
    private String maNv;
    private String tenNV;
    private double luong;
    private int namsinh;

    public NhanVien() {
    }

    public NhanVien(String maNv, String tenNV, double luong, int namsinh) {
        this.maNv = maNv;
        this.tenNV = tenNV;
        this.luong = luong;
        this.namsinh = namsinh;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNv=" + maNv + ", tenNV=" + tenNV + ", luong=" + luong + ", namsinh=" + namsinh + '}';
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ma NV: ");
        maNv = sc.nextLine();
        System.out.print("Moi ban nhap ten NV: ");
        tenNV = sc.nextLine();
        System.out.print("Moi ban nhap nam sinh: ");
        namsinh = Integer.parseInt(sc.nextLine());
        int tuoi = 2024 - namsinh;
        do {            
        System.out.print("Moi ban nhap luong: ");
        luong = Double.parseDouble(sc.nextLine()); 
         } while (luong <= 0);
    }
    public void inThongTin(){
        System.out.println(toString());
    }
}
