package com.pmz.designpatterns.abstractfactorypattern;

public abstract class Loan {

    double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoan(double loanAmount, int year){
        System.out.println("loanAmount = " + loanAmount);
        System.out.println("rate = " + rate);
        System.out.println("year = " + year);
    }
}
