/**
 * 5/15/2024
 * Kristina Bogin 
 * Project 4
 * This class contains helpful methods for financial calculations
 */
public class Financial {
	
	/**
	 * Calculates given percent from a given amount
	 * @param interestRate percent
	 * @param balance to calculate
	 * @return calculated percent in $
	 */
	public static double percentOf(double interestRate, double balance) {
		return balance*interestRate;
	}
}
