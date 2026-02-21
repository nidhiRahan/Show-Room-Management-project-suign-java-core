package com.classProject;

import java.util.Scanner;
import java.util.UUID;

public class Employee implements Utility {

    private String empId;
    private String empName;
    private int empAge;
    private String empDepartment;
    private String showroomName;

    @Override
    public void set_detail() {

        Scanner sc = new Scanner(System.in);

        empId = UUID.randomUUID().toString();

        System.out.println("\n========== ENTER EMPLOYEE DETAILS ==========");

        System.out.print("Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Employee Age: ");
        empAge = sc.nextInt();
        sc.nextLine();  // Fix nextLine issue

        System.out.print("Department: ");
        empDepartment = sc.nextLine();

        System.out.print("Showroom Name: ");
        showroomName = sc.nextLine();
    }

    @Override
    public void get_detail() {

        System.out.println("\n--------- EMPLOYEE DETAILS ---------");
        System.out.println("ID         : " + empId);
        System.out.println("Name       : " + empName);
        System.out.println("Age        : " + empAge);
        System.out.println("Department : " + empDepartment);
        System.out.println("Showroom   : " + showroomName);
    }
}
