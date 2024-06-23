
public class TraKiem {
   int ID;
   String Ma;
   String Ten;
   boolean gioiTinh;
   int tuoi;

    public TraKiem() {
    }

    public TraKiem(int ID, String Ma, String Ten, boolean gioiTinh, int tuoi) {
        this.ID = ID;
        this.Ma = Ma;
        this.Ten = Ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
   
}
