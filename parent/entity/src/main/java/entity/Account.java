package entity;

public class Account {
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }

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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Account() {
    }

    public Account(Integer id, String username, Integer money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    private Integer money;
}
