package com.tlq.userextraserver.enity;

import lombok.Data;

/**
 * @Description: 城市POJO模型
 * @Author: TanLinQuan
 * @Date: 2019/7/26 15:14
 * @Version: V1.0
 **/
@Data
public class Country {

    private Long countryId;
    private String countryName;

    public Country() {}
    public Country(Long countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }
}
