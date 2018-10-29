package com.skanderjabouzi.serializableparcelable;

import java.io.Serializable;

public class Address implements Serializable {

    private String Street;
    private int number;
    private String City;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}

