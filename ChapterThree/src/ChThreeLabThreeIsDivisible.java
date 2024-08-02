/*
 * Kristina Bogin
 * 
 * February 29, 2024
 * 
 * CS A170
 */
import java.util.Scanner;
/**
 * Task 3, Lab 3, Chapter 3.
 * This program reads two integers from the user and determines if one is divisible by the other. 
 */
public class ChThreeLabThreeIsDivisible {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two integers, I'll check if one is divisible by the other: ");

		int num1 = 0;   
		int num2 = 0;
		
		
		if (in.hasNextInt())
		{
			num1 = in.nextInt();   
			if (in.hasNextInt()) {
				num2 = in.nextInt(); 
				
				if (num1 % num2 != 0) {
					if (num2 % num1 != 0) {
					System.out.println(num1+ " and "+ num2+" are not divisible");
				}
					else {
						System.out.println(num2+ " is dvisible by  "+ num1);
					}
				}
				else {
					System.out.println(num1+ " is dvisible by  "+ num2);
				}
			}
			else
			{
			   System.out.println("Error: Not an integer.");
			}
		}
		else
		{
		   System.out.println("Error: Not an integer.");
		}
		
		
	}

}





















