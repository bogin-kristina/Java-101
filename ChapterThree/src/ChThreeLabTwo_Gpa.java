/*
 * Kristina Bogin
 * 
 * February 24, 2024
 * 
 * CS A170
 */
import java.util.Scanner;
/**
 * Task 3, Lab 2, Chapter 3.
 * This program calculates the GPA of the letter grade input by the user.
 */
public class ChThreeLabTwo_Gpa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("What is your letter grade: ");
		String grade = in.next();
		String gpa = "";
		
		// PART ONE BELOW
		
//		if  (grade.equalsIgnoreCase("a")){
//			gpa = "Your GPA is: 4.0";
//		}
//		else if (grade.equalsIgnoreCase("b")){
//			gpa = "Your GPA is: 3.0";
//		}
//		else if (grade.equalsIgnoreCase("c")){
//			gpa = "Your GPA is: 2.0";
//		}
//		else if (grade.equalsIgnoreCase("d")){
//			gpa = "Your GPA is: 1.0";
//		}
//		else if (grade.equalsIgnoreCase("f")){
//			gpa = "Your GPA is: 0";
//		}
//		else {
//			gpa = "invalid entry";
//		}
		
		
		// PART TWO BELOW
		
		switch (grade.toLowerCase()) {
		
		case "a":
			gpa = "Your GPA is: 4.0";
			break;
		case "b":
			gpa = "Your GPA is: 3.0";
			break;
		case "c":
			gpa = "Your GPA is: 2.0";
			break;
		case "d":
			gpa = "Your GPA is: 1.0";
			break;
		case "f":
			gpa = "Your GPA is: 0";
			break;
		default:
			gpa = "invalid entry";
			break;
		}
		
		System.out.print(gpa);
		
	}

}
