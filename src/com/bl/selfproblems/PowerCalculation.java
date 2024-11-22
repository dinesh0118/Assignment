package com.bl.selfproblems;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for base : ");
		double base = scan.nextInt();
		System.out.println("Enter the number for exponent : ");
		int exponent = scan.nextInt();
		
		double result = powerCalculation(base, exponent);
		System.out.println(result);
		scan.close();
		

	}

	public static double powerCalculation(double base, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		
		return  base * powerCalculation(base, exponent -1);
	}

}
