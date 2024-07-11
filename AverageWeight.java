package javaAssignmentBasic;

import java.util.Scanner;

/**
 5. Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.
*/

public class AverageWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the weight of 10 people in line by line");
		double averageWeight=0.0;
		
		for(byte i=0;i<10;i++)
		{
			averageWeight+=scanner.nextDouble();
		}
		
		System.out.println(averageWeight/10);
	}

}
