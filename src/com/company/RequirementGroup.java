package com.company;

import java.util.ArrayList;
import java.util.List;

public class RequirementGroup {
    private ResidenceType residenceType;
    private Agreement agreement;
    private List<Requirement> requirements;
    private Integer id;

    public RequirementGroup(Integer id, ResidenceType residenceType, Agreement agreement) {
        this.id =id;
        this.residenceType = residenceType;
        this.agreement = agreement;
        this.requirements = new ArrayList<>();
    }

    public ResidenceType getResidenceType() {
        return residenceType;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }


    public void addRequirement(Requirement requirement){
        this.requirements.add(requirement);
    }

    public void listRequirements (){
        for (Requirement r: requirements) {
            System.out.println(r.getName());
        }
    }

    public Integer getId() {
        return id;
    }
}
