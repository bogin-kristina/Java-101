/*
 * Kristina Bogin
 * 
 * February 29, 2024
 * 
 * CS A170
 */
import java.util.Scanner;
/**
 * Task 1, Lab 3, Chapter 3.
 * This program query whether an employee qualifies for a loan or not 
 * based on their annual salary and how many years they have worked at this company.
 */
public class ChThreeLabThreeLoan {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your salary: ");
		int salary = in.nextInt();
		
		System.out.print("Enter years on the job: ");
		int years = in.nextInt();

		
		if (salary >= 40000) 
		{
			if (years >= 2)
			{
				System.out.println("You qualify for the loan.");
			}
			else 
			{
				System.out.println("Minimum years at current job not met.");
			}
		}
		else 
		{
			System.out.println("Minimum salary at current job not met.");
		}
		
	

}
}
