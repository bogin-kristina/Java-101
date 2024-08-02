/*
* Kristina Bogin
* 
* March 19, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 1, Lab 3, Chapter 4. 
 * This program asks the user to enter a group of positive numbers one at a time 
 * and when user enters -1, it finds the maximum number among these numbers. 
 */
public class LabThreeGroupOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double max = 0;
		boolean done = false;
		double value = 0.0;
		double sum =1;

		
		
		
		//   Part A
		
//		do {
//			System.out.print("Enter a positive number, -1 to finish: ");
//			value = in.nextDouble();
//			if (value <0)
//			   {
//			      done = true;
//			   }
//			   else
//			   {
//				   if(value>max){
//						max = value;
//					}
//			   }
//		}
//		while (!done);
//		System.out.println("The maximum number is: "+(int)max);
		
		
		
		  
		//Part B


	
		System.out.print("Enter any number (positive or negative), Q to quit: ");
		while(in.hasNextDouble()||in.hasNextInt()) {
			System.out.print("Enter any number (positive or negative), Q to quit: ");
			value = in.nextDouble();
		    sum *= value;
		}

		System.out.printf("The product numbers is: %.2f",sum);
		
		
		
		
		
	
}}













