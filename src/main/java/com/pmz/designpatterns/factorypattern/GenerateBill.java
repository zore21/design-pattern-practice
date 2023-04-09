package com.pmz.designpatterns.factorypattern;

import java.util.Scanner;

public class GenerateBill {

    public static void main(String[] args) {

        GetPlanFactory getPlanFactory =
                new GetPlanFactory();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of plan : ");
        String planType = scanner.nextLine();
        System.out.println("Enter the unit : ");
        Integer units = scanner.nextInt();

        ElectricityPlan billPlan = getPlanFactory.getBillPlan(planType);
        System.out.println("billPlan = " + billPlan);
        billPlan.getRate();
        billPlan.calculateBill(units);

    }
}
