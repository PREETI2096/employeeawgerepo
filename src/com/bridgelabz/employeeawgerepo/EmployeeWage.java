package com.bridgelabz.employeeawgerepo;
import java.util.Random;
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHour = 0;
		int empWage = 0;
		Random random = new Random();
		int attendance = random.nextInt(2);
		
		if(attendance == IS_FULL_TIME)
			empHour = 8;
		
		else if(attendance == IS_PART_TIME)
			empHour = 4;
		
		else 
			empHour = 0;
		empWage = empHour * EMP_RATE_PER_HOUR;
		 
		System.out.println("Daily Employee wage:" + empWage);

	}

}
