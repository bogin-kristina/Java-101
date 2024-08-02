/*
* Kristina Bogin
* 
* March 19, 2024
* 
* CS A170
*/

/**
 * Task 1, Lab 3, Chapter 4. 
 * This program asks the user to enter a group of positive numbers one at a time 
 * and when user enters -1, it finds the maximum number among these numbers. 
 */
public class LabThreeRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	
		for (int i = 1; i <= 10; i++)
	      {  

	         int dice1 = (int) (Math.random() * 6) + 1;
	         int dice2 = (int) (Math.random() * 6) + 1;
	         System.out.println(dice1 + " " + dice2);
	      }
	      System.out.println();
	}

}
