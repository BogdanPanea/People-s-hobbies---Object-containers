package com.siit.containers;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Address {

    private String country;
    private String region;
    private String City;

    public Address(String country) {
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                '}';
    }
}
