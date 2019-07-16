package com.ceh.spring.entity;

import lombok.Data;

import javax.print.attribute.standard.RequestingUserName;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by HuangHeng on 2019/7/16
 */
@Data
public class CollectionBean {
    private String[] str;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
}
