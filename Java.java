
package sile6;

import java.util.Scanner;


public class Java {

    public static void main(String[] args) {
        //nhập vào 1 chuỗi họ tên
        Scanner sc = new Scanner(System.in);
        String hoTen,ho,ten,dem;
        System.out.print("Moi nhap vao ho ten: ");
        hoTen = sc.nextLine();
        //Thử 1 vài phương thức
        System.out.println("Ho ten in hoa: "+ hoTen.toUpperCase());
        System.out.println("In thuong :"+hoTen.toLowerCase());
        System.out.println("Do dai: "+hoTen.length());
        System.out.println("Ky tu thu 3: "+hoTen.charAt(2));
        
        //tách họ, đệm, tên
        int viTriDau = hoTen.indexOf(" "); //Vị trí xuất hiện khoảng trắng đầu tiên,,Trong khoảng trắng là dấu cách
        int viTriCuoi = hoTen.lastIndexOf(" "); //Vị trí xuất hiện khoảng trắng cuối
        
        ho = hoTen.substring(0, viTriDau);
        dem = hoTen.substring( viTriDau +1 , viTriCuoi);
        ten = hoTen.substring(viTriCuoi +1);
        System.out.println("Ket qua");
        System.out.println("Ho: "+ho);
        System.out.println("Ten: "+ten);
        System.out.println("Dem: "+dem);
    }
    
}
