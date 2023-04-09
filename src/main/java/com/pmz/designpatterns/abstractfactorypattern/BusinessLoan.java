package com.pmz.designpatterns.abstractfactorypattern;

public class BusinessLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
