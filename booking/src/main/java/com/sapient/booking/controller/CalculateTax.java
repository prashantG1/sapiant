package com.sapient.booking.controller;

public class CalculateTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateTax tax=new CalculateTax();
		
		System.out.println("total tax::::::"+tax.calculateSalary(1200000));
	}
	
	
	public double calculateSalary(double sal) {
		double totalTax=0.0;
		if(sal>200000)
		{
			if(sal>500000) {
				totalTax=(300000*10)/100;
			}else {
				totalTax=((sal-200000)*10)/100;
			}
			
			
			
		}
		
		if(sal>500000) {
			totalTax=totalTax+((sal-500000)*20)/100;
		}
		
		
		
		return totalTax;
		
	}

}
