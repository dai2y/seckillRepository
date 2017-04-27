package dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import dao.Entity.User;
import dao.UserDao;

/**
 * Created by Auser on 2017/4/13.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    @Override
    public void insertUser(User user) {
        sqlSessionTemplate.insert("userDao.insertUser", user);
    }

    @Override
    public List<User> isExsitUser(String userName) {
       return sqlSessionTemplate.selectList("userDao.isExsitUser", userName);
    }

    @Override
    public User getUserById(Long userId) {
       return sqlSessionTemplate.selectOne("userDao.getUserById", userId);
    }

    @Override
    public User getUserByLogin(User user) {
        return sqlSessionTemplate.selectOne("userDao.getUserByLogin", user);
    }
}
