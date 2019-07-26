package com.example.userservice.entity;

public class Country {

    private Long countryId;
    private String countryName;

    public Country(Long countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

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

    public Country() {
    }
}
