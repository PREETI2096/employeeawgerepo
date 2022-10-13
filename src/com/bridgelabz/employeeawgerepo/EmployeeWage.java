package com.bridgelabz.employeeawgerepo;
import java.util.Random;
public class EmployeeWage {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		
		int empHour = 0;
		int empWage = 0;
		Random random = new Random();
		int attendance = random.nextInt(2);
		
		switch(attendance) { 
		case IS_PART_TIME  :
		     	empHour = 4;
			break;
		
		case IS_FULL_TIME :
			empHour = 8;
			break;
			
	    default: 
			empHour = 0;
		}
		empWage = empHour * EMP_RATE_PER_HOUR;
		 
		System.out.println("Daily Employee wage:" + empWage);
	}
}
