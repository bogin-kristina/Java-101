/*
* Kristina Bogin
* 
* April 2, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 2, Lab 2, Chapter 5. 
 * This program asks the user to input two integers,
 * and outputs the the sum, difference, product, and quotient.
 */
public class LabTwoSimpleCalculator {

	
	/**
	 * Calculates sum of num1 and num2, calls subtraction method
	 * @param int num1
	 * @param int num2
	 * @return sum of num1 and num2
	 */
	public static double addition(int num1, int num2) {
		double addResult = num1 + num2;
		System.out.printf("%nThe difference of %.1f and %.1f is %.1f", (double)num1, (double)num2, subtraction(num1, num2));
		return addResult;
	}
	
	/**
	 * Calculates the difference between num1 and num2
	 * @param int num1
	 * @param int num2
	 * @return difference between num1 and num2
	 */
    public static double subtraction(int num1, int num2) {
    	double subResult=0;
    	if(num1>num2) {
    		subResult = num1 - num2;
    	}
    	else {
    		subResult = num2 - num1;
    	}
		return subResult;
	}
    
    
    /**
	 * Calculates the product of num1 and num2, calls division method
	 * @param int num1
	 * @param int num2
	 * @return product of num1 and num2
	 */
    public static double multiplication(int num1, int num2) {
		double multResult = num1 * num2;
		System.out.printf("%nThe quotient of %.1f and %.1f is %.1f", (double)num1, (double)num2, division(num1, num2));
		return multResult;
	}

    /**
	 * Calculates the quotient of num1 and num2
	 * @param int num1
	 * @param int num2
	 * @return quotient of num1 and num2
	 */
    public static double division(int num1, int num2) {
    	double divResult = 0;
    	
    		if(num1>num2&&num1>0) {
    		divResult = (num1*1.0) / num2;
    		}
    	else {
    		if(num2>0) {
    		divResult = (num2*1.0) / num1;
    	      }
    	    }
    	
		return divResult;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		
		int int1 =0;
		if(in.hasNextInt()) {
			int1 = in.nextInt();
		}
		
		int int2=0;
		if(in.hasNextInt()) {
			int2 = in.nextInt();
		}
		
		System.out.printf("%nThe sum of %.1f and %.1f is %.1f", (double)int1, (double)int2, addition(int1, int2));
		//System.out.printf("%nThe difference of %.1f and %.1f is %.1f", (double)int1, (double)int2, subtraction(int1, int2));
		System.out.printf("%nThe product of %.1f and %.1f is %.1f", (double)int1, (double)int2, multiplication(int1, int2));
		//System.out.printf("%nThe quotient of %.1f and %.1f is %f", (double)int1, (double)int2, division(int1, int2));
	}

}
