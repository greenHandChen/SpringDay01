package spring;

public class User {

    // 用户编号
    private Long id;

    // 用户账号
    // 用户密码
    private String username;
    private String password;

    public User(){

    }

    public User(Long id, String username, String password) {

        this.id = id;

        this.username = username;

        this.password = password;

    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getAllInfo
    public void getAllInfo() {

        System.out.println("username:" + username);

        System.out.println("password:" + password);

    }


}
