package com.ct.user.domain;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
public class Country {
    private Long countryId;
    private String countryName;

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
