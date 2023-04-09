package com.pmz.designpatterns.factorypattern;

public class DomesticPlan extends ElectricityPlan{
    @Override
    void getRate() {
        bill_rate = 4.50;
    }
}
