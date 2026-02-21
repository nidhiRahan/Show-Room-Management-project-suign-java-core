package com.classProject;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements utility{
String emp_id;
String emp_name;
String emp_age;
String emp_department;
@Override
	public void get_detail() {
	System.out.println("ID:"+emp_id);
	System.out.println("EMPLOYEE NAME:"+emp_name);
	System.out.println("EMPLOYEE AGE:"+emp_age);
	System.out.println("EMPLOYEE DEPARTMENT:"+emp_department);
	System.out.println("SHOWROOM NAME"+showroom_name);
	
}
public void set_detail() {
	Scanner sc=new Scanner(System.in);
	UUID uuid=UUID.randomUUID();
	emp_id=String.valueOf(uuid);
	System.out.println("===============================***********Enter Employees Details********===============================================");
	System.out.println("EMPLOYEE NAME");
	emp_name=sc.nextLine();
	System.out.println("EMPLOYEE AGE");
	emp_age=sc.nextLine();
	System.out.println("EMPLOYEE DEPARTMENT");
	emp_department=sc.nextLine();
	System.out.println("SHOEROOM NAME");
	showroom_name=sc.nextLine();
}
}

