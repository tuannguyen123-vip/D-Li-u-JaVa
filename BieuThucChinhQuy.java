
package sile6;

import java.util.Scanner;

public class BieuThucChinhQuy {
    public static void main(String[] args) {
        //Dùng biểu thức chính quy, Nhập email đúng định dạng
        //Nếu nhập sai, nhập lại cho đến khi đúng
        Scanner sc = new Scanner(System.in);
        String email, mauEmail ="\\w+@\\w+(\\.\\w+)+{1,2}";
         while (true) {            
        
        System.out.println("Moi ban nhap email: ");
        email = sc.nextLine();      
        
        if (email.matches(mauEmail)) {
            System.out.println("Email dung dinh dang ");
           break;
        } else {
            System.out.println("Email sai dinh dang, vui long nhap lai ");
        }
       }
            System.out.print("Email ban vua nhap la: "+ email);    
    }
}
