package com.frank.pojo;

import java.util.Date;

public class Items {
    private Integer itemId;
    private String itemName;
    private Double itemPrice;
    private String itemDetail;
    private String pic;
    private Date Itemcreatetime;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getItemcreatetime() {
        return Itemcreatetime;
    }

    public void setItemcreatetime(Date itemcreatetime) {
        Itemcreatetime = itemcreatetime;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemDetail='" + itemDetail + '\'' +
                ", pic='" + pic + '\'' +
                ", Itemcreatetime=" + Itemcreatetime +
                '}';
    }
}
