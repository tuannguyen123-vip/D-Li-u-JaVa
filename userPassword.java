
import java.util.ArrayList;
import java.util.List;


public class userPassword {
    List<Dangnhap> list = new ArrayList<>();

    public userPassword() {
        list.add(new Dangnhap("giangvien", "123456", "Giang vien"));
        list.add(new Dangnhap("daotao", "123", "Phong dao tao"));
    }
    public boolean check(String username, String pass){
        for (Dangnhap dn : list) {
             if (dn.getUsername().equalsIgnoreCase(username) && dn.getPassword().equalsIgnoreCase(pass)) {
                return true;
            }
        }
        return false;
    }
 }
