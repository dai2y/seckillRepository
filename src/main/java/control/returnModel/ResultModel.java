package control.returnModel;

import statusCode.Status;

/**
 * Created by Auser on 2017/4/17.
 */
public class ResultModel {
    /**
     * 返回状态码
     */
    private int code;

    /**
     * 返回状态
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public ResultModel(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public <T extends Status> ResultModel(T status) {
        this.code = status.getrReturnCode();
        this.msg = status.getReturnMsg();
        this.data = "";
    }

    public <T extends Status> ResultModel(T status, Object data) {
        this.code = status.getrReturnCode();
        this.msg = status.getReturnMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public  static <T extends Status> ResultModel success(T status,Object data){
        return new ResultModel(status,data);
    }
    public  static <T extends Status> ResultModel success(T status){
        return new ResultModel(status);
    }

    public static <T extends Status> ResultModel error(T status){
        return new ResultModel(status);
    }

}
