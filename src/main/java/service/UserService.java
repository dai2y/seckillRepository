package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import commenUtil.EncryptionUtil;
import dao.Entity.User;
import dao.UserDao;
import exception.AccountException;
import statusCode.AccountStatus;
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
    public User getUser(String userName, String pwd) throws AccountException{
        //1.校验参数非空
        if(userName == null || pwd == null){
            throw new AccountException(AccountStatus.PARAMETER_REQUIRED);
        }
        //2.密码登录认证，返回认证后的用户
        User user = new User();
        pwd = EncryptionUtil.MD5Encrypt(pwd);
        if(!pwd.isEmpty()){
            user.setUserName(userName);
            user.setPassword(pwd);
           return  userDao.getUserByLogin(user);
        }
        return null;
    }

    public User registerUser(String userName, String pwd) throws AccountException{
        //1.校验参数非空
        if(userName == null || pwd == null){
            throw new AccountException(AccountStatus.PARAMETER_REQUIRED);
        }
        //2.查询是否存在用户
        List<User> list = userDao.isExsitUser(userName);
        if(!list.isEmpty()){
            throw new AccountException(AccountStatus.ALREADY_EXSITS);
        }
        //3.写入用户
        User user = new User();
        user.setUserName(userName);
        pwd = EncryptionUtil.MD5Encrypt(pwd);
        if(!pwd.isEmpty()){
            user.setPassword(pwd);
            userDao.insertUser(user);
        }
        //4.返回查看用户
        user = userDao.getUserById(user.getId());
        return user;
    }
}
