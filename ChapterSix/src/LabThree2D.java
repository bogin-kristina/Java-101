
/*
* Kristina Bogin
* 
* April 14, 2024
* 
* CS A170
*/

/**
 * Task 1, Lab 3, Chapter 6. This program will display all the medals(gold,
 * silver, bronze) won by the 7 seven countries.
 */

public class LabThree2D {
	/**
	 * Calculates total medals for a country
	 * 
	 * @param nums 2D array with medals
	 * @param row  row to calculate
	 * @return sum of numbers in a row
	 */
	public static int totalMedals(int[][] nums, int row) {
		int sum = 0;
		for (int i = 0; i < nums[row].length; i++) {
			sum += nums[row][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] countries = { "Canada", "China", "Germany", "Korea", "Japan", "Russia", "United States" };

		int[][] medals = { { 1, 0, 1 }, { 1, 1, 0 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 }, { 1, 1, 0 } };

		System.out.println("        Country    Gold  Silver  Bronze   Total");

		// printing countries and medals
		for (int i = 0; i < countries.length; i++) {
			System.out.printf("%15s", countries[i]);
			int total = 0;
			
			for (int j = 0; j < medals[0].length; j++) {
				System.out.printf("%8d", medals[i][j]);
				total = totalMedals(medals, i);

			}
			System.out.printf("%8d%n", total);
		}

	}

}
