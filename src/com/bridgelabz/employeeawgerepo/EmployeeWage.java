package com.bridgelabz.employeeawgerepo;

import java.util.Random;

public class EmployeeWage {
   
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
      
	private final String company ;
	private final int empRatePerHour ;
	private final int numOfWorkingDays ;
	private final int maxHourPerMonth;
	private  int totalEmpWage;
	
	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {

    	this.company = company;
    	this.empRatePerHour = empRatePerHour;
    	this.numOfWorkingDays = numOfWorkingDays;
    	this.maxHourPerMonth = maxHourPerMonth;  	

	}

	public int wage() {
		
		int empHour = 0;
		int totalEmpHours = 0;
		int totalWorkingDays = 0;
		
	    while(totalEmpHours <=maxHourPerMonth  && totalWorkingDays < numOfWorkingDays ) {
	    	totalWorkingDays++;
	    	
		Random random = new Random();
		int attendance = random.nextInt(3); //0,1,2
		
		switch(attendance) { 
		case IS_FULL_TIME :
			empHour = 8;
			System.out.println(" full time");
			break;
		
		case IS_PART_TIME  :
	     	empHour = 4;
	     	System.out.println("part time");
			break;
			
	    default: 
			empHour = 0;
			System.out.println(" Absent");
		}
		totalEmpHours += empHour;
		System.out.println("Day: "+totalWorkingDays+"=>" +" Emp Hours= "+ empHour);
		}
	    int totalEmpWage = totalEmpHours *  empRatePerHour;
		system.out.println("Total working hours :" +totalEmpHours);
		System.out.println("Total Employee wage:" + totalEmpWage);
		return totalEmpWage;
	}

	@Override
	public String toString() {
		return "EmployeeWage [company=" + company + ",\n empRatePerHour=" + empRatePerHour + ", \n numOfWorkingDays="
				+ numOfWorkingDays + ", \n maxHourPerMonth=" + maxHourPerMonth + ",\n totalEmpWage=" + totalEmpWage + "]";
	}
}
