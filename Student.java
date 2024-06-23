
public class Student {
    private String MaNV;
    private String Hoten;
    private String Email;
    private String SDT;
    private String DiaChi;
    private boolean gt;
    private String hinh;

    public Student() {
    }

    public Student(String MaNV, String Hoten, String Email, String SDT, String DiaChi, boolean gt, String hinh) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.Email = Email;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.gt = gt;
        this.hinh = hinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
   
}
