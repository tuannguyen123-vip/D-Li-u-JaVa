
package sile;

import java.util.ArrayList;
import java.util.Collections;

public class sile2 {

    public static void main(String[] args) {
//Khai báo 1 List lưu số thực
        ArrayList<Double> ark = new ArrayList<>();
//thêm vào list 4 số thực
        ark.add(3.1);
        ark.add(Double.valueOf(8));
        ark.add(Double.valueOf(7));
        ark.add(3.1);
        ark.add(1.5);
//Kích thước của List
        System.out.println("Kich thuc cua list: " + ark.size());
        //Xuất list for i
        for (int i = 0; i < ark.size(); i++) {
            System.out.println(ark.get(i) + "\t");
        }
        //Xuất list for each

        for (Double b : ark) {
            System.out.println(b);
        }
//Sấp tăng dần:
        Collections.sort(ark);
        System.out.print("Sau khi sắp tăng dần: " + ark.toString());
//Sắp giảm dần:
        Collections.reverse(ark);
        System.out.println("\nSau khi sắp giảm:" + ark.toString());
//Lưu ý Collections chỉ so sánh với các kiểu số nguyên và số thực
//Nên cần dùng kiểu so sánh khác
    }

}
