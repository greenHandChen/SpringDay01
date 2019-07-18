package com.jmx.domain;

public class Account {
      private Integer id;
      private String username;
      private String money;

    public String getUsername() {
        return username;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
