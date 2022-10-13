package com.bridgelabz.employeeawgerepo;
import java.util.Random;
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		
		int IS_FULL_TIME = 1;
		Random random = new Random();
		int attendance = random.nextInt(2);
		
		if(attendance == IS_FULL_TIME)
			System.out.println("Employee is present");
		else 
			System.out.println("Employee is absent");

	}

}
