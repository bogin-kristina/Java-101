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
 * This program asks the user to input their weekly salary or -1 to terminate.
 * After totaling up all the salaries, it will calculate the average salary.
 */
public class LabThreeWeeklySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int total = 0;
		int average = 0;
		int count = 0;
		System.out.print("Enter your salaries followed by -1 to terminate: ");
		for (int i = in.nextInt();i>=0; i = in.nextInt()) {
			total += i;
			count++;
			average = total/count;
		}
		System.out.println("Your average salary is "+average);
		
			
		
		
		
		
	}

}
