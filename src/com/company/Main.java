package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //CREO LOS PAISES
        Country argentina = new Country("Argentina","O mais grande du mundo");
        Country venezuela =  new Country("Venezuela","El pais de la fulop");
        Country usa = new Country("USA","no love");
        //CREO LISTA DE PAISES DE ACUERDO
        ArrayList<Country> agreementCountriesMercosur = new ArrayList<>();
        ArrayList<Country> agreementCountriesNone = new ArrayList<>();
        //CREO LA LISTA DE ACUERDOS
        ArrayList<Agreement> agreements = new ArrayList<>();
        //CREO TIPO DE RESIDENCIA Y LA AGREGO A ARGENTINA
        ResidenceType residence = new ResidenceType("Permanente","vida");
        argentina.addResidenceType(residence);
        //CREO LOS REQUISITOS
        Requirement requirement1 = new Requirement("Documentacion 1","traer los docuemtnos");
        Requirement requirement2 = new Requirement("Documentacion 2","traer los docuemtnos");
        Requirement requirement3 = new Requirement("Documentacion 3","traer los docuemtnos");
       // CREO LA LISTA DE REQUISITOS
        ArrayList<Requirement> reqList = new ArrayList<>();
        reqList.add(requirement1);
        reqList.add(requirement2);
        reqList.add(requirement3);
        //CREO LOS ACUERDOS
        Agreement mercosur =  new Agreement("Mercosur","Amigos son los amigos",agreementCountriesMercosur);
        Agreement ninguno = new Agreement("Ninguno","nada de nadie", agreementCountriesNone);
        //CREO GRUPOS DE REQUIERIMIENTOS
        RequirementGroup requirementGroupMercosur = new RequirementGroup(residence,mercosur,reqList);
        argentina.addResidenceType(residence);
        //CREO EMIGRANTE
        Emigrant emigrant =  new Emigrant("pepe",venezuela,usa);
        //AÑADO LOS ACUERDOS A LA LISTA
        agreements.add(ninguno);
        agreements.add(mercosur);
        //AÑADO PAISES AL MERCOSUR
        mercosur.addCountry(argentina);
        mercosur.addCountry(venezuela);
        //BUSCO ACUERDO PARA EMIGRANTE
        Agreement lookedUpAgreement = findAgreement(emigrant.getOriginCountry(),emigrant.getDestinationCountry(),agreements);
        System.out.println(lookedUpAgreement.getName());
        getRequirementsFromGroup(residence,requirementGroupMercosur,mercosur);
    }

    public static void getRequirementsFromGroup(ResidenceType residenceType, RequirementGroup requirementGroup, Agreement agreement){
        /*TERMINAR DE DEFINIR

        ACA

         */
        requirementGroup.listRequirements();
    }


    public static Agreement findAgreement(Country originCountry, Country destinationCountry, ArrayList<Agreement> agreements ){
        for (Agreement a: agreements) {
            if(a.getCountries().contains(originCountry) && a.getCountries().contains(destinationCountry)){
                return a;
            }
        }
        return agreements.get(0);
    }
}
