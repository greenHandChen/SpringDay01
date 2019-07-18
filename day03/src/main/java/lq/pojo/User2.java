package lq.pojo;

import java.util.Date;

public class User2 {
    private Integer num;
    private String nam;
    private Date birthday;
    private Integer sex;
    private String ad;

    @Override
    public String toString() {
        return "User2{" +
                "num=" + num +
                ", nam='" + nam + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", ad='" + ad + '\'' +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
