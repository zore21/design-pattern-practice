package com.pmz.designpatterns.factorypattern;

public class CommercialPlan extends ElectricityPlan{
    @Override
    void getRate() {
        bill_rate = 8.50;
    }
}
