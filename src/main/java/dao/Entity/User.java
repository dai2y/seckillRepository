package dao.Entity;

import java.util.Date;

/**
 * Created by Auser on 2017/4/12.
 */
public class User {
    /**
     * 用户id
     */
     private Long id;

    /**
     * 密码
     */
    private String password;

    /**
     * 账户
     */
    private String userName;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录创建人
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
