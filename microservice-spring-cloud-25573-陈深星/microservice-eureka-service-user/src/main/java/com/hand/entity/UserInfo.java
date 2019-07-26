package com.hand.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键自增策略
    private Integer id;

    private String infoa;
    private String infob;

    // Getter & Setter
    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getInfoa() {

        return infoa;

    }

    public void setInfoa(String infoa) {

        this.infoa = infoa;

    }

    public String getInfob() {

        return infob;

    }

    public void setInfob(String infob) {

        this.infob = infob;

    }

    // toString
    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", infoa='" + infoa + '\'' +
                ", infob='" + infob + '\'' +
                '}';
    }
}
