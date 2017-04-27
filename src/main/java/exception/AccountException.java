package exception;

import statusCode.AccountStatus;

/**
 * Created by Auser on 2017/4/17.
 */
public class AccountException  extends Exception{
   private  int code;

    private String msg;

     public AccountException(int code){
        this.code = code;
    }

    public AccountException(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public AccountException(AccountStatus accountStatus){
        this.code = accountStatus.getrReturnCode();
        this.msg = accountStatus.getReturnMsg();
    }

    @Override
    public String getMessage(){
        return msg;
    }


}
