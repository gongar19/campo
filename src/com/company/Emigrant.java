package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emigrant {
    Integer id;
    private String name;
    private Country originCountry;
    private Country destinationCountry;
    private Checklist checklist;
    private Date birthDate;
    private String degree;
    private Boolean children;
    private Boolean criminalRecord;
    private ResidenceType residenceType;

    public Emigrant(Integer id, String nanme) {
        this.id = id;
        this.name = nanme;
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

    public void getRequiremnts(){

    }

    public ResidenceType getResidenceType() {
        return residenceType;
    }

    public void setOriginCountry(Country originCountry) {
        this.originCountry = originCountry;
    }

    public void setDestinationCountry(Country destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public void setResidenceType(ResidenceType residenceType) {
        this.residenceType = residenceType;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getDegree() {
        return degree;
    }

    public Boolean getChildren() {
        return children;
    }

    public Boolean getCriminalRecord() {
        return criminalRecord;
    }
}
