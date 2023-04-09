package com.pmz.designpatterns.factorypattern;

public abstract class ElectricityPlan {

    double bill_rate;
    abstract void getRate();

    public void calculateBill(int unit){
        System.out.println("total bill = " + unit*bill_rate);
    }

}
