
import java.util.Scanner;


public class NhanVienTuVan extends NhanVien{
    private String ngoaiNgu;

    public NhanVienTuVan() {
    }

    public NhanVienTuVan(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public NhanVienTuVan(String ngoaiNgu, String maNv, String tenNV, double luong, int namsinh) {
        super(maNv, tenNV, luong, namsinh);
        this.ngoaiNgu = ngoaiNgu;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVienTuVan{" + "ngoaiNgu=" + ngoaiNgu + '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
         Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ngoai ngu: ");
        ngoaiNgu = sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(toString());
    }
    
}
