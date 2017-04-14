package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Entity.User;
import dao.UserDao;
import vo.UserVo;

/**
 * Created by Auser on 2017/4/10.
 */
@Service
public class UserService {

    private  static final Logger log = LogManager.getLogger(UserService.class);
    @Autowired
    UserDao userDao;

    /**
     * 提供用户登录功能
     * @param userName
     * @param pwd
     * @return UserVo
     */
    public UserVo getUser(String userName, String pwd){
        User user = new User();
        user.setUserName("admin");
        user.setUserStatus("1");
        userDao.insertUser(user);
        return new UserVo();
    }

    public UserVo registerUser(String userName, String pwd){
        if(userName == null || pwd == null){
            //抛参数为空异常
        }
        //
        return null;
    }



}
