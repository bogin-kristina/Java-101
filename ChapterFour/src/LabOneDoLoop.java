/*
* Kristina Bogin
* 
* March 13, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 3, Lab 1, Chapter 4. 
 * This program greets the user with "Hello" 
 * then asks the user if they want to be greeted again, 
 * if ( y or Y) then you need to greet them again, 
 * and again, until the user types (n or N).
 */
public class LabOneDoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		String input= "";
		do {
			System.out.println("Hello");
			System.out.println("Do you want another greeting?"
					+ "\nPress y for yes, n for no, and then press return: ");
			input = in.next().toLowerCase();
		}while (input.equals("y"));
		
		System.out.println("Good-Bye");
	}

}
