package com.bridgelabz.employeeawgerepo;

public class EmployeeWageMain {
	
	public static void welcome() {
		System.out.println("Welcome to Employee wage computation program");
	}

	public static void main(String[] args) {
		   welcome();
	       EmployeeWage employeewage = new EmployeeWage();
			System.out.println("------------------------");
			System.out.println("easybuy company");
			System.out.println("------------------------");
			employeewage.wage("easybuy ", 20, 23, 110);
		
			System.out.println("------------------------");
			System.out.println(" Amazon company");
			System.out.println("------------------------");
			employeewage.wage("Amazon", 36, 28, 130);
		
			System.out.println("------------------------");
			System.out.println(" boat company");
			System.out.println("------------------------");
			employeewage.wage("boat", 30, 26, 127);

	}

}
