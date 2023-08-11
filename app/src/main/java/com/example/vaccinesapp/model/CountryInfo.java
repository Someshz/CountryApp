package com.example.vaccinesapp.model;

public class CountryInfo {
    private int countryImage;
    private String countryName;

    public CountryInfo(int countryImage, String countryName) {
        this.countryImage = countryImage;
        this.countryName = countryName;
    }

    public int getCountryImage() {
        return countryImage;
    }

    public void setCountryImage(int countryImage) {
        this.countryImage = countryImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
