/*
* Kristina Bogin
* 
* April 4, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 1, Lab 2, Chapter 6. 
 * 
 */
public class LabTwoArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[8];
		
		populateArray(numbers);
		System.out.print("The array elements are: ");
		printArray(numbers);
		System.out.println("\nThe total of the array elements is: "+summing(numbers));
	    doubling(numbers);
	    System.out.print("The array elements doubled are: ");
	    printArray(numbers);
	    System.out.print("\nThe elements of the even indices are: ");
	    printArray(even(numbers));
	    

	
	}

	
	/**
    Asks user to populate the array
    @param arr is initiated array in main
    */
	public static void populateArray(int[] arr) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 8 numbers: ");
		for (int i = 0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
			
	}
	
	
	/**
    Prints the array
    @param arr is initiated array in main
    */
	public static void printArray(int[] arr) {
		for (int num : arr)
		{
			System.out.print(num+" ");
		}
	}
	
	
	/**
    Calculates total sum of all integers in the array
    @param arr is initiated array from main
    @return the total sum
    */
	public static int summing(int[] arr) {
		int sum = 0;
		for(int num:arr) {
			sum+=num;
		}
		return sum;
	}
	
	
	/**
    Doubles each integer in the array
    @param arr is initiated array from main
    */
	public static void doubling(int[] arr) {
		int i = 0;
		while(i <arr.length) {
			arr[i]=arr[i]*2;
			i++;
		}
	}
	
	
	/**
    Finds all even indices in the array
    @param arr is initiated array from main
    @return array evenElements with integers stored under even indices in arr
    */
	public static int[] even(int[] arr) {
		int[] evenElements = new int[4];
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0) {
				evenElements[index]=arr[i];
				index++;
			}
		}
		return evenElements;
	}
}





















































