package com.ssm.model;


import java.sql.Date;
/**
 * Created by minxi.jiang
 * @decription:销售记录pojo类，用于表示销售记录
 * */
public class SellerRecords {
    private String customers_no;
    private String seller_no;
    private String goods_no;
    private String sales_quanty;
    private Date sales_date;

    public String getCustomers_no() {
        return customers_no;
    }

    public void setCustomers_no(String customers_no) {
        this.customers_no = customers_no;
    }

    public String getSeller_no() {
        return seller_no;
    }

    public void setSeller_no(String seller_no) {
        this.seller_no = seller_no;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getSales_quanty() {
        return sales_quanty;
    }

    public void setSales_quanty(String sales_quanty) {
        this.sales_quanty = sales_quanty;
    }

    public Date getSales_date() {
        return sales_date;
    }

    public void setSales_date(Date sales_date) {
        this.sales_date = sales_date;
    }
}
