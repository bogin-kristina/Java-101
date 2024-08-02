/*
* Kristina Bogin
* 
* April 4, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 3, Lab 1, Chapter 6. 
 * This program counts zeros and odd numbers in the array
 */
public class LabOneSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] symbols = new char[10];
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter up to 10 characters and end with a period: ");
		
		char ch = in.next().charAt(0);
		int count = 0;
		while (ch!='.' && count<symbols.length) {
			symbols[count]=ch;
			count++;
			ch = in.next().charAt(0);
		}
		
		
		if(count ==0) {
			System.out.print("The array is empty.");
		}
		else {
		System.out.print("Characters in reverse order: ");
		
		for (int i = count-1; i>=0; i--) {
			
		System.out.print(symbols[i]+" ");
		}
	}
	}

}
