package control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import service.UserService;
import vo.UserVo;

/**
 * Created by Auser on 2017/4/10.
 */
@Controller
@RequestMapping(value = "/user")
public class UserControl {

    @Autowired
    UserService userService;

    /**
     * 根据用户账户，密码登录
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public @ResponseBody  UserVo getUser(String userName, String password){
        //1.参数校验
        if(userName == null|| password == null){
            return null;
        }
        //2.登录接口分发
        return userService.getUser(userName, password);
    }
}
