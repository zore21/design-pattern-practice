package com.pmz.designpatterns.abstractfactorypattern;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
