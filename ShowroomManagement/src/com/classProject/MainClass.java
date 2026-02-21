package com.classProject;

import java.util.Scanner;

interface Utility {
    void get_detail();
    void set_detail();
}

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("\n******** Welcome to Showroom Management System ********");
        System.out.println("1. Add Showroom");
        System.out.println("2. Add Employee");
        System.out.println("3. Add Car");
        System.out.println("4. Get Showroom Details");
        System.out.println("5. Get Employee Details");
        System.out.println("6. Get Car Details");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        Showroom[] showroom = new Showroom[5];
        Employee[] employee = new Employee[5];
        Car[] car = new Car[5];

        int showroomCount = 0;
        int employeeCount = 0;
        int carCount = 0;

        int choice;

        do {
            mainMenu();
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (showroomCount < showroom.length) {
                        showroom[showroomCount] = new Showroom();
                        showroom[showroomCount].set_detail();
                        showroomCount++;
                    } else {
                        System.out.println("Showroom storage full!");
                    }
                    break;

                case 2:
                    if (employeeCount < employee.length) {
                        employee[employeeCount] = new Employee();
                        employee[employeeCount].set_detail();
                        employeeCount++;
                    } else {
                        System.out.println("Employee storage full!");
                    }
                    break;

                case 3:
                    if (carCount < car.length) {
                        car[carCount] = new Car();
                        car[carCount].set_detail();
                        carCount++;
                    } else {
                        System.out.println("Car storage full!");
                    }
                    break;

                case 4:
                    for (int i = 0; i < showroomCount; i++) {
                        showroom[i].get_detail();
                        System.out.println("----------------------");
                    }
                    break;

                case 5:
                    for (int i = 0; i < employeeCount; i++) {
                        employee[i].get_detail();
                        System.out.println("----------------------");
                    }
                    break;

                case 6:
                    for (int i = 0; i < carCount; i++) {
                        car[i].get_detail();
                        System.out.println("----------------------");
                    }
                    break;

                case 0:
                    System.out.println("Exiting system... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);
    }
}


