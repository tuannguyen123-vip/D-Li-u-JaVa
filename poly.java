
package sile7;

import sile7.Modeed.NhanVien;
import sile7.Modeed.TruongPhong;

public class poly {
       public static void main(String[] args) {
      NhanVien nv = new NhanVien("Nguyen Nhat Minh", Double.valueOf(9000)) {};
      NhanVien nv2 =  new NhanVien("Nguyen Nhat Mam", 8000.0) {}; 
     nv.xuat();
     nv2.xuat();
     
     TruongPhong tp = new TruongPhong(500,"Nguyen Van Minh" ,9000.0);
    tp.xuat();
    }
    
}
