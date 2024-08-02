/*
* Kristina Bogin
* 
* March 31, 2024
* 
* CS A170
*/

/**
 * Task 1, Lab 1, Chapter 5. 
 * This program contains 4 methods and prints 4 lines. 
 */
public class LabOneLunchbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fruit());
//		System.out.println(veggie());
//		System.out.println(chips());
		System.out.println("I hope you enjoyed your lunch, I wonder what's for dinner?");
	}
	
	/**Prints "I'm so sweet"
	*@return String
	*/
	public static String fruit() {
		System.out.println(veggie());
		return "I'm so sweet";
	}
	
	
	/**Prints "I'm so crunchy"
	*@return String
	*/
	public static String veggie() {
		System.out.println(chips());
		return "I'm so crunchy";
	}
	
	
	/**Prints "I'm so savory"
	*@return String
	*/
	public static String chips() {
		return "I'm so savory";
	}

}
