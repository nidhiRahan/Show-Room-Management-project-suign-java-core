package com.classProject;

import java.util.Scanner;

public class Car implements Utility {

    private String carName;
    private String carColor;
    private String carFuelType;
    private int carPrice;
    private String carType;
    private String carTransmission;

    @Override
    public void set_detail() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n========== ENTER CAR DETAILS ==========");

        System.out.print("Car Name: ");
        carName = sc.nextLine();

        System.out.print("Car Color: ");
        carColor = sc.nextLine();

        System.out.print("Fuel Type: ");
        carFuelType = sc.nextLine();

        System.out.print("Car Type (SUV/Sedan/etc): ");
        carType = sc.nextLine();

        System.out.print("Car Price: ");
        carPrice = sc.nextInt();
        sc.nextLine();  // Fix for nextLine issue

        System.out.print("Transmission (Manual/Automatic): ");
        carTransmission = sc.nextLine();
    }

    @Override
    public void get_detail() {

        System.out.println("\n--------- CAR DETAILS ---------");
        System.out.println("Name        : " + carName);
        System.out.println("Color       : " + carColor);
        System.out.println("Fuel Type   : " + carFuelType);
        System.out.println("Type        : " + carType);
        System.out.println("Price       : " + carPrice);
        System.out.println("Transmission: " + carTransmission);
    }
}

