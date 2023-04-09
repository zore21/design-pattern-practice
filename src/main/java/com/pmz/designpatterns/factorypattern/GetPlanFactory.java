package com.pmz.designpatterns.factorypattern;

public class GetPlanFactory {

    ElectricityPlan electricityPlan;
    public ElectricityPlan getBillPlan(String planType){

        if(planType == null)
            electricityPlan = null;

        if(planType.equals("domestic"))
            electricityPlan = new DomesticPlan();

        if(planType.equals("commercial"))
            electricityPlan = new CommercialPlan();

        if(planType.equals("institute"))
            electricityPlan = new InstitutePlan();

        return electricityPlan;
    }

}
