
package mobjava;

 class MOBJava {

    public static void main(String[] args) {
      //Tao doi tuong SinhVIen
      SinhVien nh = new SinhVien();
      //Nhap thong tin cho no
      nh.nhap(); //goi phuong thuc nhap() de nhap thong tin cho sv
      //Xuat thong tin 
      nh.xuat(); //goi phuong thuc xuat() de xuat thong tin cho sv
      nh.getXepLoai();
      // Cách thứ 2 để xuất getXepLoai ra màn hình là:
        System.out.println(nh.getXepLoai());
    }
    
}
