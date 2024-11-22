package com.bl.selfproblems;

import java.util.Scanner;

public class ConvertKilometerstoMiles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter distance in kilometers : ");
		double kilometers = scan.nextDouble();
		
		double miles = kilometers * 0.621371;
		
		System.out.println("Miles : " + miles );
		scan.close();

	}

}
