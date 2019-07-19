package com.ssm.model;
/**
 * Created by minxi.jiang on 2019/7/19
 * @decription:用于销售人员拓展pojo类，描述个人信息和相对应的manager工号和姓名
 * */
public class SellerAndManager extends  Seller{
        private String  seller_manager_no;
        private String  seller_manager_name;
        private SellerRecords sellerRecords;

    public SellerRecords getSellerRecords() {
        return sellerRecords;
    }

    public void setSellerRecords(SellerRecords sellerRecords) {
        this.sellerRecords = sellerRecords;
    }

    public String getSeller_manager_no() {
        return seller_manager_no;
    }

    public void setSeller_manager_no(String seller_manager_no) {
        this.seller_manager_no = seller_manager_no;
    }

    public String getSeller_manager_name() {
        return seller_manager_name;
    }

    public void setSeller_manager_name(String seller_manager_name) {
        this.seller_manager_name = seller_manager_name;
    }

    @Override
    public String toString() {
        return "SellerAndManager{" +super.toString()+
                "seller_manager_no='" + seller_manager_no + '\'' +
                ", seller_manager_name='" + seller_manager_name + '\'' +
                '}';
    }
}
