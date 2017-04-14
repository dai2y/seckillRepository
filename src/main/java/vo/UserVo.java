package vo;

/**
 * Created by Auser on 2017/4/6.
 */
public class UserVo {
    /**
     * 用户账号
     */
    private String  userName;
    /**
     * 用户等级
     */
    private String usergrade;

    /**
     * 用户组织
     */
    private String userOrg;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsergrade() {
        return usergrade;
    }

    public void setUsergrade(String usergrade) {
        this.usergrade = usergrade;
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg;
    }
}
