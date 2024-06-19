
package poly;

public class Xhelper {
   public static int bienStatic;
   
   //Khối Static
   static {
       System.out.println("Nội dung Khối static()"
           + "sẽ chạy trước khi tạo đối tượng hoặc\n"
           + "truy suất bất kỳ thành viên tĩnh khác");
   }
   //Phương thức static
    public static int Tinhtong(int...x){ //x là tham số biến đổi
       //Bản chất của tham số biến đổi là mảng
        int tong = 0;
        for (int i : x) { //Duyệt mảng
            tong +=i;  // Cộng dồn các phần tử vào biến tổng 
        }
       
       return tong;
    }
    public int sum(int...x){ //x là tham số biến đổi
       //Bản chất của tham số biến đổi là mảng
        int tong = 0;
        for (int i : x) { //Duyệt mảng
            tong +=i;  // Cộng dồn các phần tử vào biến tổng 
        }
       
       return tong;
    }
}
