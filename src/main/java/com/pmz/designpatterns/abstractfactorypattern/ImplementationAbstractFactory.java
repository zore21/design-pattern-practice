package com.pmz.designpatterns.abstractfactorypattern;

import java.util.Scanner;

public class ImplementationAbstractFactory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of bank : ");
        String bankName = scanner.nextLine();

        System.out.println("Enter the type of loan : ");
        String loanName = scanner.nextLine();

        System.out.println("Enter the rate of interest :  ");
        Double rate = scanner.nextDouble();

        System.out.println("Enter the loan amount :  ");
        Double loanAmount = scanner.nextDouble();

        System.out.println("Enter the number of year :  ");
        Integer year = scanner.nextInt();

        AbstractFactory abstractFactory =
                FactoryCreator.getFactory("loan");
        Loan loan = abstractFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoan(loanAmount, year);

    }

}