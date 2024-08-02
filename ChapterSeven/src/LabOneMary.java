
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
 * Task 2, Lab 1, Chapter 7. This program reads lines from a file named Mary.txt
 * and outputs them to another file called lineOutput.txt.
 */
public class LabOneMary {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File inputFile = new File("Sleep.txt");// getting source file

		Scanner in = new Scanner(inputFile);// reading from file

		PrintWriter out = new PrintWriter("lineOutput.txt");// output file

		while (in.hasNextLine()) {// reading a whole line of text
			String line = in.nextLine();// iterating through source file
			out.println(line);// printing to output file by line
		}

		in.close();// closing scanner
		out.close();// closing printwriter

		// next File:

		Scanner in1 = new Scanner(inputFile);

		PrintWriter out1 = new PrintWriter("wordOutput.txt");

		while (in1.hasNext()) {// reading only next word
			String line = in1.next();
			out1.println(line);// printing to output file by word
		}

		in1.close();
		out1.close();
	}

}
