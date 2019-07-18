package mybatis.enity;

import java.util.Date;

/**
 * @Description:用户对象POJO类
 * @Author: TanLinQuan
 * @Date: 2019/7/18 11:42
 * @Version: V1.0
 **/
public class User {

//    用户ID
    private Integer id;
//    用户姓名
    private String username;
//    用户生日
    private Date birthday;
//    用户性别
    private Integer sex;
//    用户地址
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
}
