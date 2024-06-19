
import java.util.ArrayList;
import java.util.Scanner;


public class NhanVienService {
    ArrayList<NhanVien> Nvl = new ArrayList<>();
    public void nhapTT(){
        while (true) {            
            Scanner sc = new Scanner(System.in);
            NhanVien nv = new NhanVien();
            nv.nhapThongTin();
            Nvl.add(nv);
            System.out.print("Ban co muon su dung tiep khong Y/N: ");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void xuatTT(){
        for (NhanVien nv : Nvl) {
            System.out.println(nv);
        }
    }

    
    public void fakeData(){
        Nvl.add(new NhanVien("001", "Phan Manh Quynh", 5000, 2003));
        Nvl.add(new NhanVien("006", "Hoang Van Thu", 6000, 2000));
        Nvl.add(new NhanVien("008", "Tuong Quoc Tien", 7000, 2006));
        Nvl.add(new NhanVien("010", "Vu Huong Han", 8500, 1999));
        Nvl.add(new NhanVien("015", "Nguyen Thi Linh", 3000, 1995));
    }
}
