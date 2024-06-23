
package mobjava;
import java.util.Scanner;

public class SinhVien {
    String hoTen;
    double diem;
public void nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Moi ban nhap ten: ");
    hoTen = sc.nextLine();
    System.out.print("Moi ban nhap diem: ");
    diem = Double.parseDouble(sc.nextLine());
}
public void xuat(){
    System.out.println(hoTen +"\t"+ diem +"\t"+ getXepLoai());
}
public String getXepLoai(){
    if (diem >= 5 ) {
        return "Dat";
    } else {
        return "Truot";
    }
  
  }
//Nạp chồng (overloading) phương thức getXepLoai
//(trong lớp có nhiều phương thức tên là getXepLoai)
public String getXepLoai(double  diem){
    if (diem >= 5 ) {
        return "Dat";
    } else {
        return "Truot";
    }
  
  }
}
