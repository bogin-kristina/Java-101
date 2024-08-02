
/*
* Kristina Bogin
* 
* April 23, 2024
* 
* CS A170
*/
import java.util.Arrays;
import java.util.Scanner;
//import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Task 1, Lab 1, Chapter 7. This program moves integers from one file to
 * another.
 */
public class LabOneFilesException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		int[] arr = new int[25];

		File inputFile = new File("data.txt");// getting source file

		Scanner in = new Scanner(inputFile);// reading from file

		PrintWriter out = new PrintWriter("output.txt");// output file

		out.println("Enter 25 numbers: ");

		int total = 0;

		for (int i = 0; i < arr.length; i++) {// iterating through source file
			arr[i] = in.nextInt();
			total += arr[i];// calculating total
		}

		for (int num : arr) {
			out.println(num);// printing to output file
		}

		out.println(Arrays.toString(arr));
		out.println("Total is " + total);
		out.println("The average is " + total / arr.length);

		in.close();// closing scanner
		out.close();// closing printwriter

	}

}
