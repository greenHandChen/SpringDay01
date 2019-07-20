package com.exam.domain;

import java.util.Date;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 8:56 2019/7/19
 * @Modified By:
 */
public class Orders {
    private Integer id;
    private Integer userid;
    private String number;
    private String note;
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}
