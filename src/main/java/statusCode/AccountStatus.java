package statusCode;

/**
 * Created by Auser on 2017/4/17.
 */
public enum AccountStatus implements Status{
    PARAMETER_REQUIRED(100001,"参数缺失！"),
    REGISTER_SUCCESS(200001,"注册成功！"),
    REGISTER_ERROR(200002,"注册失败！"),
    ALREADY_EXSITS(200003,"用户已存在");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String msg;

    AccountStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public int getrReturnCode() {
        return this.code;
    }

    @Override
    public String getReturnMsg() {
        return this.msg;
    }
}
