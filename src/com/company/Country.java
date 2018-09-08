package com.company;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String descr;
    private ArrayList<Agreement> agreements;
    private List<ResidenceType> residenceTypes;
    private Integer id;

    public Country(String name, String descr, Integer id) {
        this.name = name;
        this.descr = descr;
        this.agreements = new ArrayList<>();
        this.residenceTypes = new ArrayList<>();
        this.id = id;
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

    public ArrayList<Agreement> getAgreements() {
        return agreements;
    }
    public void addAgreement(Agreement country){
        this.agreements.add(country);
    }

    public Integer getId() {
        return id;
    }
}
