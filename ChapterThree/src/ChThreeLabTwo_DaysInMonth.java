/*
 * Kristina Bogin
 * 
 * February 24, 2024
 * 
 * CS A170
 * 
 */
import java.util.Scanner;
/**
 * Task 1, Lab 2, Chapter 3.
 * This program asks the user to enter a month 
 * (1 for January, 2 for February, and so on) 
 * and then prints the number of days in the month. 
 */
public class ChThreeLabTwo_DaysInMonth {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a month (1-12) "
				+ "and I will print the number of the days in that month: ");
		int num = in.nextInt();
		String days="";
		
		switch (num) {
		case 1, 3, 5, 7, 8, 10, 12:
			days = "This month has 31 days";
			break;
		case 2:
			days = "This month has 28 or 29 days";
			break;
		case 4,6, 9, 11:
			days = "This month has 30 days";
			break;
		default:
			days = "invalid entry";
			break;
		}
	
		System.out.print(days);

	}

}
