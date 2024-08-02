import java.util.*;
/**
 * 5/8/2024
 * Kristina Bogin
 * Task 2 
 * Project 3
 * This program imitates OCC menu and contains several methods that interact with a user
 */
public class TaskTwo {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayLists to hold names and grades
		ArrayList<String> studentNames = new ArrayList<>(); 
		ArrayList<Integer> studentGrades = new ArrayList<>();

		//Printing menu and entering a loop where user makes selections 
		//until chooses to exits the program
		printMenu();

		boolean exit = false;
		while (!exit) {
			int selection = in.nextInt();

			switch (selection) {
			case 1:
				addNameAndGrade(studentNames, studentGrades);
				break;
			case 2:
				removeStudent(studentNames, studentGrades);
				break;
			case 3:
				printStudents(studentNames, studentGrades);
				break;
			case 4:
				printDean(studentNames, studentGrades);
				break;
			case 5:
				System.out.println("\nExiting the program. Goodbye!");
				exit = true;
				continue;
			}
			printMenu();
			//System.out.print("\n\n");
		}

	}

	/**
	 * Prints OCC Menu
	 */
	public static void printMenu() {
		System.out.print("Orange Coast College Student Directory\r\n" + "--------------------------------------\r\n"
				+ "1. Add Student and Grade\r\n" + "2. Remove Student\r\n" + "3. List Students\r\n"
				+ "4. Dean's List\r\n" + "5. Exit\r\n" + "Select an option: ");
	}

	/**
	 * Prompts user to add new student's name and grade
	 * @param names ArrayList of Strings to store name
	 * @param grades ArrayList of Integers to store grade
	 */
	public static void addNameAndGrade(ArrayList<String> names, ArrayList<Integer> grades) {
		System.out.print("\nEnter the student's name: ");
		String name = in.next();
		names.add(name);
		System.out.print("Enter the student's grade: ");
		int grade = in.nextInt();
		grades.add(grade);
		System.out.println(name + " with grade " + grade + " added to the list.\n");
	}

	/**
	 * Prompts user to enter student's name to remove
	 * @param names ArrayList of Strings to remove name from
	 * @param grades ArrayList of Integers to remove grade from
	 */
	public static void removeStudent(ArrayList<String> names, ArrayList<Integer> grades) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the student's name to remove: ");
		String name = in.next();
		
		//looking for student's name:
		boolean found = false;
		for (String e : names) {   
			if (e.equals(name)) {
				found = true;
			}
		}

		//if student is found, removing students name and grade:
		if (found) {  
			int index = names.indexOf(name);
			names.remove(index);
			grades.remove(index);
			System.out.println("\n"+name + " has beed removed from the list.\n");
		} else {
			System.out.println(name + " was not found in the list.\n");
		}
	}

	/**
	 * Prints all students and their grades
	 * @param names ArrayList of Strings to be printed
	 * @param grades ArrayList of Integers to be printed
	 */
	public static void printStudents(ArrayList<String> names, ArrayList<Integer> grades) {
		System.out.println("\nStudent List: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + " - Grade: " + grades.get(i));
		}
		System.out.println();
	}

	/**
	 * Prints Dean's list students and their grades
	 * @param names ArrayList of Strings to be printed
	 * @param grades ArrayList of Integers to be printed
	 */
	public static void printDean(ArrayList<String> names, ArrayList<Integer> grades) {
		System.out.println("\nDean's List: ");
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) >= 90) {
				System.out.println(names.get(i) + " - Grade: " + grades.get(i));
			}
		}
		System.out.println();
	}

}
