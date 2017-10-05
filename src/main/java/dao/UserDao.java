package dao;

import model.Role;
import model.User;

import java.util.List;

public class UserDao extends BaseDaoEntity implements IUserDAO {

    private static List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> setUsers) {
        users = setUsers;
    }

    public static boolean isValid (User loginUser) {
        int i = users.indexOf(loginUser);
        if (i !=-1 ) {
            return true;
        }
        return false;
    }

    public String getLogin(User user) {
        return null;
    }

    public String getPassword(User user) {
        return null;
    }

    public Role getRole(Role role) {
        return null;
    }

    public boolean isIsActive(User user) {
        return false;
    }
}
