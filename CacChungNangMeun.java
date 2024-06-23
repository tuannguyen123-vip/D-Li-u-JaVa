
package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CacChungNangMeun {
    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhapDSNV(){
        do {            
            System.out.print("Moi ban chon loai nhan vien 1.Hanh Chinh | 2.Tiep Thi | 3.Truong Phong | 0.Thoat: ");
            int hoi = sc.nextInt();
            switch (hoi) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap();
                    list.add(nvhc);
                    break;
                case 2:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap();
                    list.add(nvtt);
                    break;
                case 3:
                    TruongPhong tt = new TruongPhong();
                    tt.nhap();
                    list.add(tt);
                    break;
            }
            if (hoi == 0) {
                break;
            }
        } while (true);
}
public void xuatDSNV(){
    for (NhanVien nv : list) {
        if (nv instanceof NhanVienHanhChinh) {
           ((NhanVienHanhChinh)nv).xuat();
        }else if (nv instanceof NhanVienTiepThi) {
            ((NhanVienTiepThi)nv).xuat();
        }else if(nv instanceof TruongPhong){
           ((TruongPhong)nv).xuat();
        }
    }
}
public void timMaNV(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Moi ban nhap ma NV can tim: ");
   boolean check = false;
    String ma = sc.nextLine();
    for (NhanVien nv : list) {
        if (nv.getMaNv().equalsIgnoreCase(ma)) {
        check = true;
            if (nv instanceof NhanVienHanhChinh) {
           ((NhanVienHanhChinh)nv).xuat();
        }else if (nv instanceof NhanVienTiepThi) {
            ((NhanVienTiepThi)nv).xuat();
        }else if(nv instanceof TruongPhong){
           ((TruongPhong)nv).xuat();
       break; 
        }   
   }
    }
     if (check == false) {
     System.out.print("Khong tin thay nhan vien???");

}
}
public void XoaNV(){
     Scanner sc = new Scanner(System.in);
    System.out.print("Moi ban nhap ma NV can xoa: ");
   boolean check = false;
    String ma = sc.nextLine();
    for (NhanVien nv : list) {
        if (nv.getMaNv().equalsIgnoreCase(ma)) {
          check = true;
            list.remove(nv);
       break; 
        }
    }
        if (check == false) {
        System.out.print("Khong tin thay nhan vien???");
}
}
public void capNhatNV(){
     Scanner sc = new Scanner(System.in);
    System.out.print("Moi ban cap nhap them thong tin: ");
    String ma = sc.nextLine();
    for (NhanVien nv : list) {
        if (nv.getMaNv().equalsIgnoreCase(ma)) {
            if (nv instanceof NhanVienHanhChinh) {
           ((NhanVienHanhChinh)nv).nhap();
        }else if (nv instanceof NhanVienTiepThi) {
            ((NhanVienTiepThi)nv).nhap();
        }else if(nv instanceof TruongPhong){
           ((TruongPhong)nv).nhap();
       break; 
        }   
   }
    }
}
public void timLuongNV(){
    Scanner sc = new Scanner(System.in);
   double bd = 0;
   double kt = 0;
    do {        
   System.out.print("Moi ban nhap khoang luong bat dau tim: ");
  bd = sc.nextDouble();
   System.out.println("Moi ban nhap khoang luong ket thuc tim: ");
  kt = sc.nextDouble();
        if (bd > kt ) {
            System.out.print("Moi ban nhap lai");
        } else {
          break;
        }
    } while (true);
    for (NhanVien nv : list) {
        if (nv.getThuNhap() >= bd && nv.getThuNhap() <= kt) {
            if (nv instanceof NhanVienHanhChinh) {
           ((NhanVienHanhChinh)nv).xuat();
        }else if (nv instanceof NhanVienTiepThi) {
            ((NhanVienTiepThi)nv).xuat();
        }else if(nv instanceof TruongPhong){
           ((TruongPhong)nv).xuat();
       break; 
        }   
   }
    }
   }
public void sapXepTheoTen(){
    Collections.sort(list, (nv1,nv2) -> (int) (nv1.getHoTen().compareTo(nv2.getHoTen())));
}
public void sapXepThuNhap(){
    Collections.sort(list, (nv1,nv2) -> (int) (nv2.getThuNhap() - nv1.getThuNhap()));
}
public void xuat5NV(){
    sapXepThuNhap();
    int i = 1;
    for (NhanVien nv : list) {
        if (nv instanceof NhanVienHanhChinh) {
           ((NhanVienHanhChinh)nv).xuat();
        }else if (nv instanceof NhanVienTiepThi) {
            ((NhanVienTiepThi)nv).xuat();
        }else if(nv instanceof TruongPhong){
           ((TruongPhong)nv).xuat(); 
    }
    i++;
        if (i == 5) {
            break;
        }
    }
}
}