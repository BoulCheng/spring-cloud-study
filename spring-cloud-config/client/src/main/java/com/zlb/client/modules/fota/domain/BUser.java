package com.zlb.client.modules.fota.domain;

import java.io.Serializable;
import java.util.Date;

public class BUser implements Serializable {
    private static final long serialVersionUID = 898928155672191577L;

    private Integer id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * '看涨/看跌期权，0表示看跌,1表示看涨
     */
    private Integer estimated;

    /**
     * 推荐人ID，无推荐人为0
     */
    private Integer upid;

    /**
     * 期权值
     */
    private Integer optionValue;

    private Integer createTime;

    private Date createDate;

    /**
     * 0未发送 1发送成功 2发送失败
     */
    private Integer sendStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getEstimated() {
        return estimated;
    }

    public void setEstimated(Integer estimated) {
        this.estimated = estimated;
    }

    public Integer getUpid() {
        return upid;
    }

    public void setUpid(Integer upid) {
        this.upid = upid;
    }

    public Integer getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(Integer optionValue) {
        this.optionValue = optionValue;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }
}