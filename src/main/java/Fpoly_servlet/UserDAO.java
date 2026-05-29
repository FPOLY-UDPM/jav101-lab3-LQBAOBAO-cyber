package Fpoly_servlet;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    // Giả lập cơ sở dữ liệu
    private static List<User> ls = new ArrayList<>();

    static {
        ls.add(new User("fpoly", "123", "FPT Polytechnic"));
        ls.add(new User("admin", "admin", "Administrator"));
    }

    public User checkLogin(String username, String password) {
        for (User u : ls) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
    
    public boolean exists(String username) {
        for (User u : ls) {
            if (u.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
