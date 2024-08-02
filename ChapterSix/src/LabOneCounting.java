/*
* Kristina Bogin
* 
* April 4, 2024
* 
* CS A170
*/
/**
 * Task 2, Lab 1, Chapter 6. 
 * This program counts zeros and odd numbers in the array
 */
public class LabOneCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] numbers = {4,0,7,2,11,6,0,3,0,9};
		int zero = 0;
		int odd = 0;
//		for (int i = 0; i<numbers.length; i++) {
//			if(numbers[i]==0) {
//				zero++;
//			}
//			if(numbers[i]%2!=0) {
//				odd++;
//			}
//	
//		}
		
		for (int element : numbers)
		{
			if(element==0) {
				zero++;
			}
			if(element%2!=0) {
				odd++;
			}
		}
		
		System.out.printf("The array contains %d zeros.\n"
				+ "The array contains %d odd numbers.\n" , zero, odd);
		
	}

}
