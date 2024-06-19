
package poly;

public class Demo {

    public static void main(String[] args) {
      Xhelper hp = new Xhelper(); // Muốn dùng phải tạo tên mục sang mục main
       System.out.println(hp.sum(4,5));  //Tổng các số có thể nhiều hơn khi viết vào trong System.out.println(hp.sum(v.v..));
      System.out.println(hp.sum(4,5,6));
        System.out.println("Tong cac so:"+hp.sum(4,5,5,10,6));
    
        int a[]= {5,6,8,7,9,8}; //Tổng của cả mảng
       System.out.println("tong cua mang la: "+hp.sum(a));
    // Gọi biến(trường) Static, phương thức static
    //Không cần tạo đối tượng, gọi trực tiếp TenLop.bienStatic
    //Gọi TenLop.TenPhuongthucStatic()
    Xhelper.bienStatic=100; //Gọi biến(trường) Static
        System.out.println("Tong:"+Xhelper.Tinhtong(10,10)); //Gọi phương thức Static
    }
}
