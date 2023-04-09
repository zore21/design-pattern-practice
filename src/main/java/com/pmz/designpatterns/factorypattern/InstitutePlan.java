package com.pmz.designpatterns.factorypattern;

public class InstitutePlan extends ElectricityPlan{
    @Override
    void getRate() {
        bill_rate = 6.50;
    }
}
