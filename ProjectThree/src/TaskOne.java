import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 5/8/2024 Kristina Bogin Project 3 Task 1
 */
public class TaskOne {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Initialize count variables
		int rows = 3;
		int cols = 3;
		int[][] array = new int[rows][cols]; // Initial size of 3x3

		// Loop to populate the 2D array:
		System.out.println("Enter 9 integers: ");

		int countRows = 0;
		int countCols = 0;
		while (countRows < rows) {
			while (countCols < cols) {
				array[countRows][countCols] = in.nextInt();
				countCols++;
			}
			countRows++;
			countCols = 0;
		}

		// Printing all methods:
		printArray(array);
		System.out.println("The total is: " + getTotal(array));
		System.out.println("The average is: " + getAverage(array, getTotal(array)));

		// Displaying all rows and columns totals:
		for (int i = 0; i < rows; i++) {
			System.out.printf("Row %d total: %d\n", i, rowTotal(array, i));
		}

		for (int i = 0; i < cols; i++) {
			System.out.printf("Column %d total: %d\n", i, columnTotal(array, i));
		}

		for (int i = 0; i < rows; i++) {
			System.out.printf("Row %d max: %d\n", i, getHighestInRow(array, i));
		}

		for (int i = 0; i < rows; i++) {
			System.out.printf("Row %d min: %d\n", i, getLowestInRow(array, i));
		}
	}

	/**
	 * prints a 2D array
	 * 
	 * @param arr array to be printed
	 */
	public static void printArray(int[][] arr) {
		// Print the populated 2D array
		System.out.println("Array is populated:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * getting total of all elements in a 2d array
	 * 
	 * @param arr array to be calculated
	 * @return total
	 */
	public static int getTotal(int[][] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		return total;
	}

	/**
	 * getting average of all elements in a 2d array
	 * 
	 * @param arr   array to be calculated
	 * @param total total of the array (pass getTotal())
	 * @return average
	 */
	public static double getAverage(int[][] arr, int total) {

		return total / (arr.length * arr[0].length);
	}

	/**
	 * getting row total in a 2d array
	 * 
	 * @param arr array to be calculated
	 * @param row to be calculated
	 * @return row total
	 */
	public static int rowTotal(int[][] arr, int row) {
		int rowTotal = 0;
		for (int i = 0; i < arr[row].length; i++) {
			rowTotal += arr[row][i];
		}
		return rowTotal;
	}

	/**
	 * getting column total in a 2d array
	 * 
	 * @param arr    array to be calculated
	 * @param column to be calculated
	 * @return column total
	 */
	public static int columnTotal(int[][] arr, int column) {
		int columnTotal = 0;
		for (int i = 0; i < arr.length; i++) {
			columnTotal += arr[i][column];
		}
		return columnTotal;
	}

	/**
	 * getting highest number in a row
	 * 
	 * @param arr array to be searched
	 * @param row to be searched
	 * @return highest number
	 */
	public static int getHighestInRow(int[][] arr, int row) {
		int max = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] > max) {
				max = arr[row][i];
			}
		}
		return max;
	}

	/**
	 * getting lowest number in a row
	 * 
	 * @param arr array to be searched
	 * @param row to be searched
	 * @return lowest number
	 */
	public static int getLowestInRow(int[][] arr, int row) {
		int min = arr[row][0];
		for (int i = 0; i < arr[row].length; i++) {
			if (arr[row][i] < min) {
				min = arr[row][i];
			}
		}
		return min;
	}

}
