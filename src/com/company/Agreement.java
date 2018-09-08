package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Agreement {
    private Integer id;
    private String name;
    private String descr;
    private ArrayList<Country> countries;

    public Agreement(String name, String descr, Integer id) {
        this.name = name;
        this.descr = descr;
        countries = new ArrayList<>();
        this.id = id;
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

    public Boolean addCountry(Country country){
        if(!this.countries.contains(country)){
            this.countries.add(country);
            return true;
        }
        return false;
    }

    public Boolean removeCountry(Country country){
        if(this.countries.contains(country)){
            this.countries.remove(country);
            return true;
        }
        return false;
    }

    public Integer getId() {
        return id;
    }
}
