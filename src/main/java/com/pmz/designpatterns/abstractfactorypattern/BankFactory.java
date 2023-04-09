package com.pmz.designpatterns.abstractfactorypattern;

public class BankFactory extends AbstractFactory{

    Bank bank;
    @Override
    public Bank getBank(String bankName) {

        if(bankName == null)
            return null;
        if(bankName.equalsIgnoreCase("hdfc"))
            bank = new HDFCBank();
        if(bankName.equalsIgnoreCase("sbi"))
            bank = new SBIBank();
        if(bankName.equalsIgnoreCase("icici"))
            bank = new ICICIBank();

        return bank;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
