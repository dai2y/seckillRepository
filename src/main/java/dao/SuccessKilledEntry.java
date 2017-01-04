package dao;

import java.util.Date;

/**
 * 秒杀明细记录实体
 * Created by Auser on 2016/12/30.
 */
public class SuccessKilledEntry {
    private Long seckillId;

    private Long userPhone;

    private Integer state;

    private Date createTime;

    private SecKillEntry secKillEntry;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public SecKillEntry getSecKillEntry() {
        return secKillEntry;
    }

    public void setSecKillEntry(SecKillEntry secKillEntry) {
        this.secKillEntry = secKillEntry;
    }

    @Override
    public String toString() {
        return "SuccessKilledEntry{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                ", secKillEntry=" + secKillEntry +
                '}';
    }
}
