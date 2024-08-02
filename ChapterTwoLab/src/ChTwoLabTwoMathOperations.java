/*
* Kristina Bogin
* 
* February 7, 2024
* 
* CS A170
*/

import java.util.Scanner;

/**
 * Task 1 from Lab 2 in Chapter 2. 
 * Math Operations with Test Cases
 */
public class ChTwoLabTwoMathOperations {

	public static void main(String[] args) {
		// Creating an instance of the Scanner class
        
		Scanner newObj = new Scanner(System.in);
        
        
        // Declaring input variables for the Scanner
		
        int input1, input2;
        
        //requesting input from user
        System.out.print("Enter the first integer: ");//prompt
        input1 = newObj.nextInt();
        
        System.out.print("Enter the second integer: ");//prompt
        input2 = newObj.nextInt();
        
        //doing math
        int sum = input1 + input2;
        int prod = input1 * input2;
        int div  = input1 / input2;
        int rem  = input1 % input2;
        
        
        
        //printing math
        System.out.println(input1+ " + " + input2 + " = "+ sum );
        System.out.println(input1+ " * " + input2 + " = "+ prod );
        System.out.println(input1+ " / " + input2 + " = "+ div );
        System.out.println(input1+ " % " + input2 + " = "+ rem );

        
	}

}


















