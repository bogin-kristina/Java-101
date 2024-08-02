/*
* Kristina Bogin
* 
* April 2, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 3, Lab 2, Chapter 5. 
 * This program asks the user to input the length of a triangle,
 * and outputs the triangle.
 */
public class LabTwoRecursiveTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please the integer value: ");
		
		int side =0;
		if(in.hasNextInt()) {
			side = in.nextInt();
		}
		
		printTriangles(side);
	}
	
	/**
	 * Takes a number for the triangle side length and prints this triangle
	 * @param sideLength of a triangle 
	 */
	public static void printTriangles(int sideLength)
	{
	   if (sideLength < 1) { return; } 
	   printTriangles(sideLength - 1);
	   for (int i = 0; i < sideLength; i++)
	   {
	      System.out.print("[]");
	   }
	   System.out.println();
	}

}
