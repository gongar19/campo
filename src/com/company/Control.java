package com.company;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private List<Agreement> agreements;
    private List<Country> countries;
    private List<RequirementGroup> requirementGroups;
    private List<Requirement> requirements;
    private Emigrant emigrant;
    private List<ResidenceType> residenceTypeList;

    public Control() {
        this.agreements = new ArrayList<>();
        this.countries = new ArrayList<>();
        this.emigrant = null;
        this.residenceTypeList = new ArrayList<>();
        this.requirements = new ArrayList<>();
        this.requirementGroups = new ArrayList<>();
    }

    public void getEmigrantRequirement(){
        for (RequirementGroup requirementGroup: this.requirementGroups) {
            if(emigrant.getOriginCountry().getAgreements().contains(requirementGroup.getAgreement())&&emigrant.getResidenceType().equals(requirementGroup.getResidenceType())){
                requirementGroup.listRequirements();
            }
        }
    }

    public void createCountry(String name, String descr, Integer id){
        Country newCountry = new Country(name, descr, id);
        this.countries.add(newCountry);
    }

    public void createRequirementGroup(Integer id, Integer residenceId, Integer agreementId){
        ResidenceType residenceToSet = null;
        Agreement agreementToSet = null;

        for (Agreement a: agreements             ) {
            if(a.getId().equals(agreementId)){
                agreementToSet=a;
            }
        }
        for (ResidenceType r: residenceTypeList             ) {
            if(r.getId().equals(residenceId)){
                residenceToSet=r;
            }
        }
        RequirementGroup r = new RequirementGroup(id,residenceToSet,agreementToSet);
        this.requirementGroups.add(r);

    }

    public void addRequirementToRG(Integer requirementId, Integer requirementGroupId){
        Requirement newRequirement = null;
        RequirementGroup newRequirementGroup = null;

        for (Requirement r: requirements) {
            if (r.getId().equals(requirementId)){
                newRequirement = r;
            }
        }

       for (RequirementGroup rg: requirementGroups) {
            if (rg.getId().equals(requirementGroupId)){
                newRequirementGroup = rg;
            }
        }
        newRequirementGroup.addRequirement(newRequirement);
    }

    public void createAgreement(String name, String descr, Integer id){
        Agreement agreement =  new Agreement(name,descr, id);
        this.agreements.add(agreement);
    }

    public void addRequirement(Integer id, String name, String descr){
        Requirement newRequirement =  new Requirement(id, name, descr);
        this.requirements.add(newRequirement);
    }

    public void addCountryToAgreement(Integer agreementId, Integer countryId){
        Agreement agreementToAdd=null;
        Country countryToAdd = null;
        for (Agreement a:  agreements             ) {
            if (a.getId().equals(agreementId)){
                agreementToAdd = a;
            }
        }
        for (Country c:  countries) {
            if (c.getId().equals(countryId)){
                countryToAdd = c;
            }
        }
        if(countryToAdd!=null&&agreementToAdd!=null){
            agreementToAdd.addCountry(countryToAdd);
            countryToAdd.addAgreement(agreementToAdd);
        }

    }

    public void createResidenceType(Integer id, String name, Integer maxStay){
        ResidenceType newResidence = new ResidenceType(id, name, maxStay);
        this.residenceTypeList.add(newResidence);
    }

    public void createEmigrant(Integer id, String name){
        Emigrant newEmigrant = new Emigrant(id, name);
        this.emigrant = newEmigrant;
    }

    public void setDestination(Integer id){
        for (Country c: countries             ) {
            if(c.getId().equals(id)){
                this.emigrant.setDestinationCountry(c);
            }
        }
    }

    public void setOrigin(Integer id){
        for (Country c: countries             ) {
            if(c.getId().equals(id)){
                this.emigrant.setOriginCountry(c);
            }
        }
    }

    public void setResidenceType(Integer id){
        for (ResidenceType rt: residenceTypeList             ) {
            if (rt.getId().equals(id)){
                this.emigrant.setResidenceType(rt);
            }
        }
    }

    public void printAll(){
        System.out.println("Nombre del migrante: "+this.emigrant.getName());
        System.out.println("Longitud de acuerdos: "+this.agreements.size());
        System.out.println("Longitud de paises: "+this.countries.size());
        System.out.println("Tipo de residencia: "+this.emigrant.getResidenceType().getName());
        System.out.println("Longitud de grupos de requisitos: "+this.requirementGroups.size());
        System.out.println("Longitud de Requisitos: "+this.requirements.size());
        System.out.println("Longirud de tipos de residencia: "+this.residenceTypeList.size());
    }

    public void printRg(){

        for (RequirementGroup rg: requirementGroups             ) {
            System.out.println(rg.getId()+"---------");
            rg.listRequirements();
        }
    }

}
