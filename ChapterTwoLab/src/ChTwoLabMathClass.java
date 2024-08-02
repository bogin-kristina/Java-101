/*
* Kristina Bogin
* 
* February 1, 2024
* 
* CS A170
*/

/**
 * Task 2 from Lab in Chapter 2. 
 * Writing code representing the calculation of 6 mathematical equations using methods from the Math Class.
 */

public class ChTwoLabMathClass {

	public static void main(String[] args) {
		// Equation 1. Method "pow".
      short a = 8;
      double b = 2;
      double c = 5;
      double result = Math.pow(b, c) / a;
      
      System.out.println("the result of equaiton 1 is: " + result);
      
      
      
   // Equation 2. Method "abs".
      byte d = -85;
      int e = 199;
      
      int result2 = Math.abs(d) * e;
      
      System.out.println("the result of equaiton 2 is: " + result2);
      
      
      
   // Equation 3. Method "sqrt".
      double f = 16.685;
      long g = 200000;
      
      double result3 = Math.sqrt(f) % g;
      
      System.out.println("the result of equaiton 3 is: " + result3);
      
      
      
   // Equation 4. Method "min".
      float h = 985.3f;
      float i = 99.99f;
      
      float result4 = Math.min(h, i) + i;
      
      System.out.println("the result of equaiton 4 is: " + result4);
      
      
      
      // Equation 5. Method "max".
      long j = 854545;
      long k = 17545646;
      char l = 4;
      
      long result5 = Math.min(j, k) - l;
      
      System.out.println("the result of equaiton 5 is: " + result5);
      
      
      
      // Equation 6. Method "round".
      double m = 11.666;
      short n = 9999;
 
      double result6 = Math.round(m) * n;
      
      System.out.println("the result of equaiton 6 is: " + result6);
      
	}

}
