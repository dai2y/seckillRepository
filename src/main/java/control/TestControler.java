package control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vo.UserVo;

/**
 * Created by Auser on 2016/12/27.
 */
@Controller
@RequestMapping(value = "/account")
public class TestControler {
    @RequestMapping(value = "/getUser")
    public @ResponseBody UserVo login(@RequestParam(value ="name") String name){
        UserVo vo = new UserVo();
        if(!name.isEmpty()){
            vo.setUserName(name);
        }
        return vo;
    }



}
