package dao.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

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
}
