package com.bridgelabz.employeeawgerepo;

public class EmployeeWageMain {
	
	public static void welcome() {
		System.out.println("Welcome to Employee wage computation program");
	}

	public static void main(String[] args) {
		   welcome();
	       EmployeeWage easybuy = new EmployeeWage("easybuy", 20, 20 ,10);
	     EmployeeWage reliance = new EmployeeWage("reliance", 18,24,12);
	       easybuy.wage();
	       System.out.println(easybuy);
	       reliance.wage();
	       System.out.println(reliance);
			

	}

}
