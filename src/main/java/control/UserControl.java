package control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import control.returnModel.ResultModel;
import exception.AccountException;
import service.UserService;
import statusCode.AccountStatus;
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
    public ResponseEntity<ResultModel>  getUser(String userName, String password){
        //1.参数校验
        if(userName == null|| password == null){
            return new ResponseEntity(
                    ResultModel.error(AccountStatus.PARAMETER_REQUIRED),HttpStatus.OK);
        }
        try{
            return new ResponseEntity(
                    ResultModel.success(AccountStatus.REGISTER_SUCCESS,
                            userService.getUser(userName,password)),
                    HttpStatus.OK);
        }catch (AccountException e){
            return new ResponseEntity(ResultModel.error(AccountStatus.REGISTER_ERROR), HttpStatus.OK);
        }
    }

    /**
     * 注册用户
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "registerUser", method = RequestMethod.GET)
    public ResponseEntity<ResultModel>  registerUser(String userName, String password){
        //1.参数校验
        if(userName == null|| password == null){
            return new ResponseEntity(
                    ResultModel.error(AccountStatus.PARAMETER_REQUIRED),HttpStatus.OK);
        }
        try{
            return new ResponseEntity(
                    ResultModel.success(AccountStatus.REGISTER_SUCCESS,
                            userService.registerUser(userName,password)),
                            HttpStatus.OK);
        }catch (AccountException e){
           return new ResponseEntity(ResultModel.error(AccountStatus.REGISTER_ERROR), HttpStatus.OK);
        }


    }


}
