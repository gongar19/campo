package com.company;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String descr;
    //private ArrayList<Agreement> agreements;
    private List<ResidenceType> residenceTypes;

    public Country(String name, String descr) {
        this.name = name;
        this.descr = descr;
        //this.agreements = new ArrayList<>();
        this.residenceTypes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getDescr() {
        return descr;
    }
    public void addResidenceType(ResidenceType residenceType){
        this.residenceTypes.add(residenceType);
    }
}
