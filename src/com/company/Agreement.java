package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Agreement {
    private String name;
    private String descr;
    private ArrayList<Country> countries;

    public Agreement(String name, String descr, ArrayList<Country> countries) {
        this.name = name;
        this.descr = descr;
        this.countries = countries;
        countries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        this.countries.add(country);
    }

}
