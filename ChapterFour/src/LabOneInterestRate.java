/*
* Kristina Bogin
* 
* March 13, 2024
* 
* CS A170
*/


/**
 * Task 2, Lab 1, Chapter 4. 
 * This program calculates the annual interest rate ( 7%) on a credit card balance of 10,000
 * and counts how many years will it take for the balance to reach 20,000 or more
 */
public class LabOneInterestRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RATE = 7;
		final int INITIAL_BALANCE = 10000;
		final int TARGET = INITIAL_BALANCE * 2;
		int year = 0;
		double balance = INITIAL_BALANCE;
		
		
		while (balance<TARGET) {
			double interest = balance * RATE / 100.0;
			balance += interest;
			year++;
		}
		
		System.out.println("The investment doubled after " + year + " years.");

	}

}
