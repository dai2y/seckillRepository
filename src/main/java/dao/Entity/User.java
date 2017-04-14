package dao.Entity;

import java.util.Date;

/**
 * Created by Auser on 2017/4/12.
 */
public class User {
    /**
     * 用户id
     */
     private Long userId;
    /**
     * 账户
     */
    private String userName;

    private String userOrg;

    /**
     * 用户等级
     */
    private String userStatus;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录创建人
     */
    private String createUser;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getCreeteTime() {
        return createTime;
    }

    public void setCreeteTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userOrg='" + userOrg + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                '}';
    }
}
