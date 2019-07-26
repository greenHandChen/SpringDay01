package com.hand.servicetest.Entity;

public class Dept {
    private Integer userId;
    private String deptName;
    private Integer deptId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "userId=" + userId +
                ", deptName='" + deptName + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
