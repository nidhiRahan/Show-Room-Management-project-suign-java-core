package com.classProject;

import java.util.Scanner;

interface utility{
	 public void get_detail();
	 public void set_detail();
 }
public class MainClass {
	public static void mainMenu() {
		System.out.println("******************Welcome to ShowRoom Management System****************************");
        System.out.println();
		System.out.println("===========================*******Enter your choice*******=====================");
        System.out.println();
        System.out.println("1].ADD SHOWROOM \t\t\t 2].ADD EMPLOYEE \t\t\t 3]. ADD CAR");
	System.out.println();
	System.out.println("4].GET SHOWROOM \t\t\t 5].GET EMPLOYEE \t\t\t 6]. ADD CAR");
	System.out.println();
	System.out.println("===============================================********Enter 0 to exist***************==============================================");
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Showroom[] showroom=new Showroom[5];
		Employee[] employe=new Employee[5];
		Car[] car=new Car[5];
		int showroom_counter=0;
		int car_counter=0;
		int employee_counter=0;
		int choice=100;
		while(choice!=0) {
			mainMenu();
			choice=sc.nextInt();
			while(choice!=9 && choice !=0) {
				switch(choice) {
				case 1:
					showroom[showroom_counter]=new Showroom();
				showroom[showroom_counter].set_detail();
				showroom_counter++;
				System.out.println();
				System.out.println("1].ADD NEW SHOWROOM");
				System.out.println("9].GO BACK TO MAIN MENU");
				choice=sc.nextInt();
				break;
				
				case 2:
					employe[employee_counter]=new Employee();
					employe[employee_counter].set_detail();
					employee_counter++;
					System.out.println();
					System.out.println("2].ADD NEW EMPLOYEE");
					System.out.println("9].GO BACK TO MAIN MENU");
					choice=sc.nextInt();
					break;
					
				case 3:
					car[car_counter]=new Car();
					car[car_counter].set_detail();
					car_counter++;
					System.out.println();
					System.out.println("3].ADD NEW CAR");
					System.out.println("9]. GO BACK TO MAIN MENU");
					choice=sc.nextInt();
					break;
					
				case 4:
					for(int i=0; i<showroom_counter; i++) {
						showroom[i].get_detail();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].GO BACK TO MAIN MENU");
					System.out.println("0].EXIST");
					choice=sc.nextInt();
					break;
				case 5: 
					for(int i=0; i<employee_counter; i++) {
						employe[i].get_detail();
						System.out.println();
						System.out.println();
						break;
					}
					System.out.println();
					System.out.println("9].GO BACK TO MAIN MENU");
					System.out.println("0].Exist");
					choice=sc.nextInt();
					break;
				case 6:
					for(int i=0; i<car_counter; i++) {
						car[i].get_detail();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].GO BACK TO MAIN MENU");
					System.out.println("0]. EXIST");
					choice=sc.nextInt();
					break;
					default:
						System.out.println("ENTER VALID CHOICE");
						break;
				}}
		}
		
	}
	}


