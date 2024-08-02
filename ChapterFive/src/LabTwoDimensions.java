/*
* Kristina Bogin
* 
* April 2, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 1, Lab 2, Chapter 5. 
 * This program asks the user to input the length, width, and height dimensions,
 * and outputs the volume for the with an appropriate message
 */
public class LabTwoDimensions {

	/**
	 * Calculates volume of a cube
	 * 
	 * @param a is a side of a cube
	 */
	public static void cubeVolume(int a) {
		double cVolume = Math.pow(a,  3);
		System.out.println("The volume of the cube is: "+ cVolume);
	}
	
	
	/**
	 * Calculates volume of a rectangularPrism
	 * @param a is length
	 * @param h is width
	 * @param L is height
	 */
	public static void rectangularPrismVolume(int w, int h, int l) {
		double recPrismVolume = w*h*l;;
		System.out.println("The volume of the rectangular prism is:  "+ recPrismVolume);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length, width and height dimentions: ");
		
		int length=0;
		if(in.hasNextInt()) {
			length = in.nextInt();
		}
		
		int width=0;
		if(in.hasNextInt()) {
			width = in.nextInt();
		}
		
		int height=0;
		if(in.hasNextInt()) {
			height = in.nextInt();
		}
		
		cubeVolume(length);
		cubeVolume(width);
		rectangularPrismVolume(length, width, height);

	}

}
