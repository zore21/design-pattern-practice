package com.pmz.designpatterns.factorypattern2;

public abstract class ScholarShipScheme {

    double concession;

    abstract double getConcession();

    public void calculateTotalFees(double fees){

        double feesToBePaid = fees - (fees * (concession/100));
        System.out.println("Total fees to be paid = "+feesToBePaid);;

    }
}
