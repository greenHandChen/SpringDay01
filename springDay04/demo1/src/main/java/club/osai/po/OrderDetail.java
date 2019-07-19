package club.osai.po;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OrderDetail.java
 * @Version: 1.0
 * @Date: 2019/7/19
 * @Description:
 */

public class OrderDetail {
    private Long id;
    private Long ordersId;
    private Long itemsId;
    private Long itemsNum;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", itemsId=" + itemsId +
                ", itemsNum=" + itemsNum +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public Long getItemsId() {
        return itemsId;
    }

    public void setItemsId(Long itemsId) {
        this.itemsId = itemsId;
    }

    public Long getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Long itemsNum) {
        this.itemsNum = itemsNum;
    }
}
