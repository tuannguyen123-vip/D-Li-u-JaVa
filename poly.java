
public class poly {
   String maSV;
   String hoTen;
   double tiengAnh;
   double tinHoc;
   double gdTC;

    public poly() {
    }

    public poly(String maSV, String hoTen, double tiengAnh, double tinHoc, double gdTC) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gdTC = gdTC;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() { 
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public double getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(double tinHoc) {
        this.tinHoc = tinHoc;
    }

    public double getGdTC() {
        return gdTC;
    }

    public void setGdTC(double gdTC) {
        this.gdTC = gdTC;
    }
 public double diemTB(){
    double tb;
    tb = (this.tiengAnh + this.tinHoc + this.gdTC)/3;
    return tb;
}
}
