package com.classProject;

import java.util.Scanner;



public class Car extends Showroom implements utility {
String car_name;
String car_color;
String car_fuel_type;
int car_price;
String car_type;
String car_transmission;

@Override
public void get_detail() {
	System.out.println("NAME"+car_name);
	System.out.println("COLOR:"+car_color);
	System.out.println("FUEL TYPE"+car_fuel_type);
	System.out.println("PRICE"+car_price);
	System.out.println("CAR TYPE:"+ car_type);
	System.out.println("TRANSMISSION"+ car_transmission);
}
public void set_detail() {
	Scanner sc=new Scanner(System.in);
	System.out.println("=====================================******ENTER CAR DETAILS*****=========================================");
	System.out.println("CAR NAME");
	car_name=sc.nextLine();
	System.out.println("CAR COLOR");
	car_color=sc.nextLine();
	System.out.println("CAR FUEL TYPE");
	car_fuel_type=sc.nextLine();
	System.out.println("CAR PRICE");
    car_price=sc.nextInt();
    System.out.println("CAR TRANSMISSION");
    car_transmission=sc.nextLine();
    total_car_in_stock++;
}
	
}
