package com.company;

import java.util.ArrayList;
import java.util.List;

public class RequirementGroup {
    private ResidenceType residenceType;
    private Agreement agreement;
    private List<Requirement> requirements;
    private Integer duration;

    public RequirementGroup(ResidenceType residenceType, Agreement agreement, List<Requirement> requirements) {
        this.residenceType = residenceType;
        this.agreement = agreement;
        this.requirements = new ArrayList<>();
        this.requirements = requirements;
    }

    public void addRequirement(Requirement requirement){
        this.requirements.add(requirement);
    }

    public void listRequirements (){
        for (Requirement r: requirements) {
            System.out.println(r.getName());
        }
    }
}
