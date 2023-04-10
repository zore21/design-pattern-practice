package com.pmz.designpatterns.factorypattern2;

public class FactoryScholarShip {

    ScholarShipScheme scholarShipScheme;

    public ScholarShipScheme getScholarShipScheme(String castGroupName){
        if(castGroupName == null)
            scholarShipScheme = null;
        if(castGroupName.equalsIgnoreCase("general"))
            scholarShipScheme = new GeneralCasteScholarShip();
        if(castGroupName.equalsIgnoreCase("obc"))
            scholarShipScheme = new OBJCasteScholarShip();
        if(castGroupName.equalsIgnoreCase("vjnt"))
            scholarShipScheme = new VJNTCasteScholarShip();

        return scholarShipScheme;

    }

}
