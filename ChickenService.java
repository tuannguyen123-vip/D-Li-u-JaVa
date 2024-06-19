
import java.util.ArrayList;
import java.util.Scanner;


public class ChickenService {
    ArrayList<Chicken> Ckn = new ArrayList<>();
    public void nhapTT(){
        while (true) {            
            Scanner sc = new Scanner(System.in);
            Chicken ck = new Chicken();
            ck.nhapThongTin();
            Ckn.add(ck);
            System.out.print("Ban co muon su dung nua ko Y/N");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
   public void inTT(){
       for (Chicken ck : Ckn) {
           System.out.println(ck);
       }
   }
   public void inPT(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban so price can thiet: ");
        boolean check = false;
        int priceTT = Integer.parseInt(sc.nextLine());
        for (Chicken ck : Ckn) {
            if (ck.getPrice() >= priceTT) {
                System.out.print(ck);
               check = true;
                break;
            }
       }
       if (check == false) {
           System.out.println("Khong thay price trong du lieu????");
       }
   }
  public void sapXepTangDan(){
      Ckn.sort((i1,i2)->{
      Integer d2 = i2.getPrice();
      Integer d1 = i1.getPrice();
      return d2.compareTo(d1);
      });
  }
public void fakeData(){
    Ckn.add(new Chicken("Ga trong", "Do", 15000));
    Ckn.add(new Chicken("Ga mai", "Trang", 20000));
    Ckn.add(new Chicken("Ga mai mo", "Vang", 35000));
}
}
