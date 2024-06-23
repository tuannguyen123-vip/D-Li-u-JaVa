
import java.util.ArrayList;
import java.util.Scanner;

public class ChucVuService {
    ArrayList<ChucVu> CvList = new ArrayList<>();
    public void nhapTT(){
        while (true) {            
        Scanner sc = new Scanner(System.in);
        ChucVu cv = new ChucVu();
        cv.nhapThongTin();
        CvList.add(cv);
        System.out.print("Ban co muon su dung tiep khong Y/N: ");
        String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void xuatTT(){
        for (ChucVu cv : CvList) {
            System.out.println(cv);
        }
    }
   public void khoangPhuCap(){
    Scanner sc = new Scanner(System.in);
    double bd = 0;
    double kt = 0;
       do {           
           System.out.print("Moi ban nhap khoang luong bat dau: ");   
           bd = sc.nextDouble();
           System.out.print("Moi ban nhap khoang luong ket thuc: ");
           kt = sc.nextDouble();
           if (bd > kt) {
               System.out.println("Moi ban nhap lai??");
           }else{
               break;
           }
       } while (true);
        for (ChucVu cv : CvList) {
            if (cv.getPhucap() >= bd && cv.getPhucap() <= kt) {
                cv.inThongTin();
            break;
            }
       }
   }
  public void xuatTen(){
   Scanner sc = new Scanner(System.in);
      System.out.print("Moi ban nhap ten can tim:");
   String tim = sc.nextLine();
   boolean check = false;  
   for (ChucVu cv : CvList) {
          if (cv.getTenCV().equalsIgnoreCase(tim)) {
           check = true;
           cv.inThongTin();
           break;
       }
      }
      if (check == false) {
          System.out.println("Ten nhan vien khong ton tai???");
      }
  }
 public void timKhoangPC(){
     Scanner sc = new Scanner(System.in);
     double phucap = 500;
     boolean check = false;
     System.out.print("Moi ban nhap so phu cap dieu kien > 500: ");
     phucap = sc.nextDouble();
     for (ChucVu cv : CvList) {
         if (cv.getPhucap() < phucap) {
             cv.inThongTin();
             check = true;
             break;
         }
     }
     if (check == false) {
         System.out.println("Khong co phu cap > 500??");
     }
 }
 public void sapXepTen(){
  CvList.sort((o2,o1)->{
  String d2 = o1.getTenCV();
  String d1 = o2.getTenCV();
  return d2.compareTo(d1);
  });
 }
public void sapXepPC(){
    CvList.sort((a2,a1)->{
     Double v2 = a1.getPhucap();
     Double v1 = a2.getPhucap();
     return v2.compareTo(v1);
    });
}
public void timPhuCapMax(){
    for (ChucVu cv : CvList) {
        if (cv.getPhucap() < cv.getPhucap()) {
            cv.inThongTin();
        }
    }
}
public void timMaCV(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Moi ban nhap maCV can tim: ");
    String tim = sc.nextLine();
    boolean check = false;
    for (ChucVu cv : CvList) {
        if (cv.getMacv().equalsIgnoreCase(tim)) {
            cv.inThongTin();
            check = true;
            break;
        }
    }
    if (check == false) {
        System.out.println("Khong tim thay ma nhan vien phu hop???");
    }
}
public void fakeData(){
    CvList.add(new ChucVu("003", "nguyen thi van", 1500));
    CvList.add(new ChucVu("005", "tran quoc bao", 6500));
    CvList.add(new ChucVu("0010", "pham gia lieu", 7500));
    CvList.add(new ChucVu("008", "hoang thai son", 9500));
}
}
