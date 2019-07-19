package com.mapper;

import com.domain.OrdersExt;

import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 9:35 2019/7/19
 * @Modified By:
 */
public interface OrderMapper {
    //一对一之resultType
    List<OrdersExt> findOrdersAndUser();
    //一对一之resultMap （一对一的resultMap中的映射使用<association property="副表对应的java类对象" javaType="副表对应的java类全限定名称">
    List<OrdersExt> findOrderAndUserResultMap();
    //一对多之resultMap
    // （当多表进行连接,返回的结果集为多个表的字段时，在主表所对应的类下进行拓展类，拓展类继承主类）
    //  拓展类作为resultMap的type。
    //  一对多中的一方作为主表,多方作为副表,多方在resultMap使用,<collection property="副表对应的java类对象" ofType="集合中每个元素对应的java类全限定名称">标签
    List<OrdersExt> findOrdersAndOrdersDatilsAndUserResultMap();

    List<OrdersExt> findOrdersAndOrdersDatilsAndUserAndItemsResultMap();
}
