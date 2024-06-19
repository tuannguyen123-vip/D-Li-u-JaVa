
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ChickenService cks = new ChickenService();
        while (true) {            
            System.out.println("------------------------------");
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Xuat thong tin");
            System.out.println("3.In phan tu theo khoang price");
            System.out.println("4.Sap xep cac phan tu tang dan price");
            System.out.println("5.Tinh gia TB cac Chicken");
            System.out.println("6.Fakedata");
            System.out.println("7.Ke Thua");
            System.out.println("0.Thoat");
            System.out.println("------------------------------");
            System.out.print("Moi ban chon muc tren: ");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Moi ban su dung muc nay!!"); 
                    cks.nhapTT();
                    break;
                case 2:
                    System.out.println("Moi ban su dung muc nay!!"); 
                    cks.inTT();
                    break;
                case 3:
                    System.out.println("Moi ban su dung muc nay!!"); 
                    cks.inPT();
                    break;
                case 4:
                    System.out.println("Moi ban su dung muc nay!!"); 
                    cks.sapXepTangDan();
                    cks.inTT();
                    break;
                case 5:
                    System.out.println("Moi ban su dung muc nay!!"); 
                   
                    break;
                case 6:
                    System.out.println("Moi ban su dung muc nay!!"); 
                    cks.fakeData();
                    break;
                case 7:
                    System.out.println("Moi ban su dung muc nay!!"); 
                    LittleChicken lck = new LittleChicken(3, "Ga tay", "Den", 15000);
                    lck.inThongTIn();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung meun!!"); 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon lai, Ban da nhap sai????");
            }
        }
    }
    
}
