
package assignment;

import java.util.Scanner;


public class poly {

    
    public static void main(String[] args) {
       CacChungNangMeun ccnm = new CacChungNangMeun();
        while (true) {            
            System.out.println("---------------------------"); 
            System.out.println("1.Nhap thong tin nhan vien"); 
            System.out.println("2.Xuat thong tin nhan vien"); 
            System.out.println("3.Tim thong tin nhan vien"); 
            System.out.println("4.Xoa thong tin nhan vien"); 
            System.out.println("5.Them thong tin nhan vien"); 
            System.out.println("6.Tim luong nhan vien"); 
            System.out.println("7.Sap xep nhan vien theo ho ten"); 
            System.out.println("8.Sap xep nhan vien theo thu nhap"); 
            System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat"); 
            System.out.println("----------------------------"); 
            System.out.print("Moi ban chon muc: "); 
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.nhapDSNV();
                    break;
                case 2:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.xuatDSNV();
                    break;
                case 3:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.timMaNV();
                    break;
                case 4:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.XoaNV();
                    break;
                case 5:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.capNhatNV();
                    break;
                case 6:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.timLuongNV();
                    break;
                case 7:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.sapXepTheoTen();
                    ccnm.xuatDSNV();
                    break;
                case 8:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.sapXepThuNhap();
                   ccnm.xuatDSNV();
                    break;
                case 9:
                    System.out.println("Moi ban su dung muc nay!!!");
                    ccnm.xuat5NV();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung meun!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban da nhap sai moi ban nhap lai ??");
            }
        }
    }
    
}
