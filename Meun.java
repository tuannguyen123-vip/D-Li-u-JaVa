
import java.util.Scanner;


public class Meun {

    public static void main(String[] args) {
       ChucVuService cvse = new ChucVuService();
        while (true) {            
            System.out.println("----------------------------");
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Xuat thong tin");
            System.out.println("3.Xuat theo khoang phu cap");
            System.out.println("4.Xuat thong tin theo tenNV");
            System.out.println("5.Tim cac chuc vu co phu cap > 500");
            System.out.println("6.Sap xep chuc vu giam dan theo tenNV");
            System.out.println("7.Sap xep chuc vu giam dan theo phu cap");
            System.out.println("8.Xuat cac chuc vu co phu cap lon nhat");
            System.out.println("9.Tim kiem theo maNV");
            System.out.println("10.Ke thua");
            System.out.println("0.Thoat");
            System.out.println("-----------------------------");
            System.out.print("Moi ban chon muc: ");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.nhapTT();
                    break;
                case 2:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.xuatTT();
                    break;
                case 3:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.khoangPhuCap();
                    break;
                case 4:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.xuatTen();
                    break;
                case 5:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.timKhoangPC();
                    break;
                case 6:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.sapXepTen();
                    cvse.xuatTT();
                    break;
                case 7:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.sapXepPC();
                    cvse.xuatTT();
                    break;
                case 8:
                    System.out.println("Moi ban su dung muc nay!!");
                    break;
                case 9:
                    System.out.println("Moi ban su dung muc nay!!");
                    cvse.timMaCV();
                    break;
                case 10:
                    System.out.println("Moi ban su dung muc nay!!");
                    TruongPhong tp = new TruongPhong(1000, "009", "Ho Cat Luong", 15000);
                    tp.inThongTin();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung meun!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban da chon sai, Xin moi ban chon lai");
            }
        }
    }
    
}
