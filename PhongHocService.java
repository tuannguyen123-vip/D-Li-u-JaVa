
package poly;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhongHocService {
    ArrayList<PhongHoc> Pht = new ArrayList<>();
    public void nhapTT(){
        while (true) {            
          Scanner sc = new Scanner(System.in);
          PhongHoc ph = new PhongHoc();
          ph.nhap();
          Pht.add(ph);
          System.out.print("Ban co muon su dung tiep ko(Y/N): ");
          String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
   public void xuatTT(){
       for (PhongHoc ph : Pht) {
           System.out.println(ph);
       }
   }
   public void timTang3(){
   boolean check = false;
     for (PhongHoc ph : Pht) {
           check = true;
         if (ph.getTang()==3) {
             System.out.println(ph);
             break;
         }
       }
     if (check == false) {
     System.out.println("Khong tin thay tang so 3???");
}
}
public void demSV(){
    int dem = 0;
    boolean check = false;
    for (PhongHoc phs : Pht) {
        check = true;
        if (phs.getSoSV() < 50) {
            dem++;
            System.out.println(phs);
            break;
        }
    }
    if (check == false) {
        System.out.println("Khong co lop hoc nao co so SV >50???");
    }
}
public void sapXepTang(){
  Pht.sort((o1,o2)->{
  Double d1 = o1.getTang();
  Double d2 = o2.getTang();
  return d1.compareTo(d2);
  });
}
public void fakeData(){
    Pht.add(new PhongHoc("NN", 50,2));
    Pht.add(new PhongHoc("CNTT",30,3));
    Pht.add(new PhongHoc("Kinh doanh", 20, 2));
    }
}