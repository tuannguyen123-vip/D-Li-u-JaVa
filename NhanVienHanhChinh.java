
package assignment;

public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh() {
    }

    public NhanVienHanhChinh(String maNv, String hoTen, double luongCB, String phongban) {
        super(maNv, hoTen, luongCB, phongban);
    }

    @Override
    public double getThuNhap() {
      return super.getLuongCB();
    }
    
}
