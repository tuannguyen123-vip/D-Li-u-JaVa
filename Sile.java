
package sile;

import java.util.ArrayList;

public class Sile {

    public static void main(String[] args) {
       //Khai báo ArrayLiist ko định kiểu lưu kiểu bất kỳ
       
       ArrayList Lstk = new ArrayList();
       Lstk.add(1);//Thêm vào List 1 số nguyên
       Lstk.add(2.5);//Thêm vào List 1 số thực 
       Lstk.add("Chuoi");//Thêm vào List 1 chuooix 
       Lstk.add(true);//Thêm vào List 1 giá trị boolean
    
       //Khi lấy ra => phải ép về kiểu gốc 
       //lấy phần tử thứ 2
       Double so = (Double) Lstk.get(1);
        System.out.println("phần tử thứ 3: "+Lstk.get(1));
      }

}
