package com.hand.area.entity;

public class Country {
    private Integer countryId;
    private String countryName;

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
