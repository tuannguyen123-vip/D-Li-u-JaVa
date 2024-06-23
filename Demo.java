
package poly;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        PhongHocService phs = new PhongHocService();
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("----------------------");
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Xuat thong tin");
            System.out.println("3.Xuat thong tin phong hoc tang 3");
            System.out.println("4.Dem co bao nhieu phong hoc > 50 SV");
            System.out.println("5.Sap xep phong hoc theo tang dan");
            System.out.println("6.fakeData");
            System.out.println("0.Thoat");
            System.out.println("-----------------------");
            System.out.print("Moi ban chon muc:");
        int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Moi ban su dung muc nay!!!"); 
                    phs.nhapTT();
                    break;
                case 2:
                    System.out.println("Moi ban su dung muc nay!!!"); 
                   phs.xuatTT();
                    break;
                case 3:
                    System.out.println("Moi ban su dung muc nay!!!"); 
                   phs.timTang3();
                   break;
                case 4:
                    System.out.println("Moi ban su dung muc nay!!!"); 
                    phs.demSV();
                    break;
                case 5:
                    System.out.println("Moi ban su dung muc nay!!!"); 
                    phs.sapXepTang();
                    phs.xuatTT();
                    break;
                case 6:
                    System.out.println("Moi ban su dung muc nay!!!"); 
                    phs.fakeData();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung meun!!!"); 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban chon lai muc???");
            }
        
        }
}
}