/*
 * Kristina Bogin
 * 
 * February 29, 2024
 * 
 * CS A170
 */
import java.util.Scanner;
/**
 * Task 2, Lab 3, Chapter 3.
 * This program query whether an employee qualifies for a loan or not 
 * based on their annual salary and how many years they have worked at this company.
 */
public class ChThreeLabThreeTraceCode {

	public static void main(String[] args) {


		double fuelgauge = 0;
		
		System.out.println("enter the fuel gause reading");
		
		Scanner input = new Scanner(System.in);
		
		fuelgauge = input.nextDouble();
		
		System.out.println("first with braces");
		
		if (fuelgauge < 0.75) {
			if (fuelgauge < 0.25) 
				System.out.println("fuel is very low caution!");
			}
		else
		{		
			System.out.println("fuel ovr 3/4. Don't stop now!");
		}

		
		
		System.out.println("now without braces");
		
		if (fuelgauge < 0.75) 
			if (fuelgauge < 0.25)
				System.out.println("fuel is very low caution!");
			else
				System.out.println("fuel ovr 3/4. Don't stop now!");
		

	}

}

















