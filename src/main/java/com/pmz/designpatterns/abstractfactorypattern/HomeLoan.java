package com.pmz.designpatterns.abstractfactorypattern;

public class HomeLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
