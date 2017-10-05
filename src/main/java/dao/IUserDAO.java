package dao;

import model.Role;
import model.User;

import java.util.List;

public interface IUserDAO extends IEntityDAO {

    String getLogin (User user);

    String getPassword (User user);

    Role getRole (Role role);

    boolean isIsActive (User user);
}
