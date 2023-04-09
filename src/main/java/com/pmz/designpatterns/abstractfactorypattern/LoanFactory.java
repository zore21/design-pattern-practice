package com.pmz.designpatterns.abstractfactorypattern;

public class LoanFactory extends AbstractFactory{

    Loan loan;

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {

        if(loanName == null)
            return null;
        if(loanName.equalsIgnoreCase("home"))
            loan = new HomeLoan();
        if(loanName.equalsIgnoreCase("buisness"))
            loan = new BusinessLoan();
        if(loanName.equalsIgnoreCase("education"))
            loan = new EducationLoan();

        return loan;

    }
}
