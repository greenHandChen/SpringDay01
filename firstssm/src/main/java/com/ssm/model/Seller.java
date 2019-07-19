package com.ssm.model;
/**
 * Created by minxi.jiang on 2019/7/19
 * @decription:汉得销售人员pojo类，描述销售人员个人信息
 *
 */

public class Seller {
    private String seller_no;
    private String seller_name;
    private String  manager_no;

    public String getSeller_no() {
        return seller_no;
    }

    public void setSeller_no(String seller_no) {
        this.seller_no = seller_no;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getManager_no() {
        return manager_no;
    }

    public void setManager_no(String manager_no) {
        this.manager_no = manager_no;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "seller_no='" + seller_no + '\'' +
                ", seller_name='" + seller_name + '\'' +
                ", manager_no='" + manager_no + '\'' +
                '}';
    }
}
