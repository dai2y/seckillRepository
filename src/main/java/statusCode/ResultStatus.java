package statusCode;

/**
 * Created by Auser on 2017/4/17.
 */
public enum ResultStatus implements Status{
    SUCCESS(100, "成功");
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String msg;

    ResultStatus(int code, String msg) {
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
