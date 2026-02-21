package com.classProject;

import java.util.Scanner;

public class Showroom implements Utility {
	String showroom_name;
	String showroom_address;
	int total_employee;
	int total_car_in_stock=0;
	String manager_name;
	
   @Override
	public void get_detail() {
		System.out.println("showroom Name:"+showroom_name);
		System.out.println("showroom Address:"+showroom_address);
		System.out.println("Manager Name:"+manager_name);
		System.out.println("Total Employees:"+total_employee);
		System.out.println("Total car in stock"+total_car_in_stock);
		
		}

	@Override
	public void set_detail() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===================================***Enter ShowRoom detail*****========================================");
		System.out.println();
		System.out.println("SHOWROOM NAME:");
		showroom_name=sc.nextLine();
		System.out.println("SHOWROOM ADDRESS:");
		showroom_address=sc.nextLine();
		System.out.println("MANAGER NAME :");
		manager_name=sc.nextLine();
		System.out.println("Total no of Employee:");
		total_employee=sc.nextInt();
		System.out.println("TOTAL CAR IN STOCK");
		total_car_in_stock=sc.nextInt();
	}

}
