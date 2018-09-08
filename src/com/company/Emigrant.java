package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emigrant {
    private String name;
    private Country originCountry;
    private Country destinationCountry;
    private Checklist checklist;
    private Date birthDate;
    private String degree;
    private Boolean children;
    private Boolean criminalRecord;
    private ResidenceType residenceType;

    public Emigrant(String nanme, Country originCountry, Country destinationCountry) {
        this.name = nanme;
        this.originCountry = originCountry;
        this.destinationCountry = destinationCountry;
        this.checklist = new Checklist(null,55.0);


    }

    public void listReq(){
        ArrayList<Requirement> reqList = new ArrayList<>();
        reqList = this.checklist.getRequirements();
        for (Requirement r: reqList) {
            System.out.println(r.getName());
        }

    }
    public Country getOriginCountry(){
        return this.originCountry;
    }
    public Country getDestinationCountry(){
        return this.destinationCountry;
    }

}
