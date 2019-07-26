package com.masirhh.userprovider.beans;

import com.masirhh.countryprovider.beans.Country;

public class UserExt extends User {

    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString()+"UserExt{" +
                "country=" + country +
                '}';
    }
}
