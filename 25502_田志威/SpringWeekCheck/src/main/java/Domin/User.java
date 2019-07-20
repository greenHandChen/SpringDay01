package Domin;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private Date birthdaty;
    private Character sex;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthdaty() {
        return birthdaty;
    }

    public void setBirthdaty(Date birthdaty) {
        this.birthdaty = birthdaty;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
