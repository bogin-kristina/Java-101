
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
 * Task 3, Lab 1, Chapter 7. This program creates a file with songs.
 */
public class LabOneArraysAndFiles {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String[] cd = new String[6];

		// getting source file
		File infile = new File("C:\\Users\\Kristina\\Downloads\\Classics-1-1.txt");

		// reading from file
		Scanner in = new Scanner(infile);

		// output file
		PrintWriter out = new PrintWriter("Songs.txt");

		int i = 0;
		while (in.hasNextLine() && i < cd.length) {// iterating through source file
			// storing two lines of text in one array element connected with " by "
			cd[i] = in.nextLine() + " by " + in.nextLine();
			i++;
		}

		System.out.println("Contents of Compact Disc\n========================");
		out.println("Contents of Compact Disc\n========================");

		for (String el : cd) {
			System.out.println(el);
			out.println(el);// printing to output file by line
		}

		in.close();
		out.close();
	}

}
