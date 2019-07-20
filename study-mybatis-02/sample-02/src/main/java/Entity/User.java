package Entity;

import java.util.Date;

public class User {

    // 自增主键
    private Integer id;

    // 用户账号
    // 用户生日
    // 用户性别
    // 用户地址
    private String username;

    private Date birthday;

    private Integer sex;

    private String address;

    // 构造方法
    public User() {

        super();

    }

    public User(String username, String address, Date birthday, Integer sex) {

        this.username = username;

        this.address = address;

        this.birthday = birthday;

        this.sex = sex;

    }

    // Getter & Setter
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

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    // getAllInfo
    public void getAllInfo() {

        System.out.println("id:" + this.id);

        System.out.println("username:" + this.username);

        System.out.println("birthday:" + this.birthday);

        System.out.println("sex:" + this.sex);

        System.out.println("address:" + this.address);

    }

}
