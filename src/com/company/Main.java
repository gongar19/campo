package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Control control = new Control();
        control.createCountry("Argentina","Sin rusia",0);
        control.createCountry("Venezuela","Pisco",1);
        control.createAgreement("Mercosur", "A todo o nada",0);
        control.addCountryToAgreement(0,0);
        control.addCountryToAgreement(0,1);
        control.addRequirement(0,"traer dni","");
        control.addRequirement(1,"traer antecedentes","");
        control.addRequirement(2,"traer titulo","");
        control.createResidenceType(0,"Permanente",90);
        control.createResidenceType(1,"Temporal",90);
        control.createRequirementGroup(0,0,0);
        control.createRequirementGroup(1,0,0);
        control.createEmigrant(0,"rodolfo");
        control.setDestination(0);
        control.setOrigin(1);
        control.setResidenceType(0);
        control.addRequirementToRG(0,0);
        control.getEmigrantRequirement();


        //control.printAll();
        //control.printRg();
    }
}
