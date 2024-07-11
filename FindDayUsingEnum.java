package javaAssignmentBasic;

import java.util.Scanner;

/**
 * 4. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.
 */

public class FindDayUsingEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int dayNumber = sc.nextInt();

		Day day = getDay(dayNumber);
		if (day != null) {
			System.out.println( dayNumber + " is " + day);
		} else {
			System.out.println("Invalid number. Please enter a number between 1 and 7.");
		}
	}

	public static Day getDay(int dayNumber) {
		switch ((dayNumber)%7) {
		case 1:
			return Day.SUNDAY;
		case 2:
			return Day.MONDAY;
		case 3:
			return Day.TUESDAY;
		case 4:
			return Day.WEDNESDAY;
		case 5:
			return Day.THURSDAY;
		case 6:
			return Day.FRIDAY;
		case 7:
			return Day.SATURDAY;
		default:
			return null;
		}
	}

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
}
