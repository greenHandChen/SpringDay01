package com.hand.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "hand_employee")
public class HandEmployee implements Serializable {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY) // 配置主键生成策略: 自动增长
   @Column(name = "id")
    private Integer id;//员工编号

    @Override
    public String toString() {
        return "HandEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public HandEmployee(String name, Double salary, Date birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public HandEmployee() {
    }

    @Column(name = "name")
    private String name;//员工姓名
    @Column(name = "salary")
    private Double salary;//员工薪水
    @Column(name = "birthday")
    private Date birthday;//员工生日
}
