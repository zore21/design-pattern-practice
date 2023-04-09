package com.pmz.designpatterns.abstractfactorypattern;

public class HDFCBank implements Bank{

    private final String bankName ;

    public HDFCBank() {
        this.bankName = "HDFC Bank";
    }

    @Override
    public String getBankName() {
        return null;
    }
}
