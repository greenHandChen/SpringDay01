package com.lhb.service2.entity;

/**
 * Created By LHB on 2019/7/26;
 */
public class Country {
    private Long countryId;
    private String countryName;
    public Long getCountryId() {
        return countryId;
    }

    public Country setCountryId(Long countryId) {
        this.countryId = countryId;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public Country setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }




}
