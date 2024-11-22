package com.bl.selfproblems;

import java.util.Scanner;

public class PerimeterofaRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length : ");
		double length = scan.nextDouble();
		System.out.println("Enter the width : ");
		double width = scan.nextDouble();
		
		double perimeter = 2 * (length + width);
		
		System.out.println("perimeter : "+ perimeter);
		scan.close();
		

	}

}
