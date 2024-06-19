
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        NhanVienService nvs = new NhanVienService();
        while (true) {            
            System.out.println("----------------------------------");
            System.out.println("1.fakeData");
            System.out.println("2.Nhap thong tin");
            System.out.println("3.Xuat thong tin");
            System.out.println("4.Xuat thong tin co luong > 500");
            System.out.println("5.Xuat nhan vien theo khoang luong");
            System.out.println("6.Tim ma nhan vien");
            System.out.println("7.Xuat nhan vien co tuoi tu 18 - 30");
            System.out.println("8.Dem so nhan vien co tuoi > 18");
            System.out.println("9.Sap xep nhan vien theo ten giam dan");
            System.out.println("10.Sap xep nhan vien theo luong giam dan");
            System.out.println("11.Sap xep nhan vien theo tuoi giam dan");
            System.out.println("12.Tim ma NV");
            System.out.println("13.Tim ten NV");
            System.out.println("14.Xuat NV theo trang thai");
            System.out.println("15.Xoa NV");
            System.out.println("16.Xuat danh sach NV co tuoi chan");
            System.out.println("17.Xuat danh sach NV co tuoi le");
            System.out.println("18.Xuat NV co chu cai dau do nguoi dung nhap");
            System.out.println("19.Ke Thua");
            System.out.println("0.Thoat");
            System.out.println("-------------------------------------");
            System.out.print("Moi ban chon nhap: ");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Moi ban su dung muc nay!!");
                     nvs.fakeData();
                     nvs.xuatTT();
                    break;
                case 2:
                    System.out.println("Moi ban su dung muc nay!!");
                     nvs.nhapTT();
                    break;
                case 3:
                    System.out.println("Moi ban su dung muc nay!!");
                     nvs.xuatTT();
                    break;
                case 4:
                    System.out.println("Moi ban su dung muc nay!!");
               
                    break;
                case 5:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 6:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 7:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 8:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 9:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 10:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 11:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 12:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 13:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 14:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 15:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 16:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 17:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 18:
                    System.out.println("Moi ban su dung muc nay!!");
                
                    break;
                case 19:
                    System.out.println("Moi ban su dung muc nay!!");
                    NhanVienTuVan nvtv = new NhanVienTuVan("Tot", "0011", "Nguyen Hai My", 5000, 2003);
                    nvtv.inThongTin();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung meun!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban da chon sai muc, Moi ban chon lai!!!");
            }
       }
    }
}
