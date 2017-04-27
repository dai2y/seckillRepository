package dao;

import java.util.List;

import dao.Entity.User;

/**
 * Created by Auser on 2017/4/12.
 */
public interface UserDao {
    void insertUser(User user);

    List<User> isExsitUser(String userName);

    User getUserById(Long userId);

    User getUserByLogin(User user);
}
