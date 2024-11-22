package com.bl.selfproblems;

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principle : ");
		double principle = scan.nextDouble();
		System.out.println("Enter the rate : ");
		double rate = scan.nextDouble();
		System.out.println("Enter the time : ");
		double time = scan.nextDouble();

		double simpleIntrest = (principle * rate * time) / 100;
		
		System.out.println("simpleIntrest : "+simpleIntrest);
		scan.close();
	}

}
