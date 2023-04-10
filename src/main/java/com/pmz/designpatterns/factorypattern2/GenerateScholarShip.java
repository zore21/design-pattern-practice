package com.pmz.designpatterns.factorypattern2;

import java.util.Scanner;

public class GenerateScholarShip {
    public static void main(String[] args) {

        FactoryScholarShip factoryScholarShip =
                new FactoryScholarShip();

        Scanner scanner
                = new Scanner(System.in);

        System.out.println("Enter the caste group name : ");
        String casteGroupName = scanner.nextLine();

        System.out.println("Enter the total fees to be paid");
        Double totalFees = scanner.nextDouble();

        ScholarShipScheme scholarShipScheme =
                factoryScholarShip.getScholarShipScheme(casteGroupName);

        System.out.println("scholarShipScheme = " + scholarShipScheme);

        scholarShipScheme.getConcession();
        scholarShipScheme.calculateTotalFees(totalFees);

    }
}
