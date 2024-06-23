public class Students {
   public String name;
   public double diem;
   public  String khoahoc;

    public Students() {
    }

    public Students(String name, double diem, String khoahoc) {
        this.name = name;
        this.diem = diem;
        this.khoahoc = khoahoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }
    
   public String getxeploai(){
       if (this.diem < 3) {
           return "kem";
       }
       if (this.diem < 5) {
           return "yeu";
       }
       if (this.diem < 6.5) {
           return "Trung binh";
       }
       if (this.diem < 7.5) {
           return "Kha";
       }
       if (this.diem < 9) {
           return "Gioi";
       }
   return "Xuat sac";
    }
public boolean isBouns(){
    return this.diem >= 7.5;
}
}
