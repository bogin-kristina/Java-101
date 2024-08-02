
/*
* Kristina Bogin
* 
* April 14, 2024
* 
* CS A170
*/
import java.util.ArrayList;

/**
 * Task 3, Lab 3, Chapter 6. This program prints an ArrayList with friends in
 * reverse.
 */
public class LabThreeArrayList3 {

	public static ArrayList<String> reverse(ArrayList<String> names) {
		ArrayList<String> newFriends = new ArrayList<>();

		for (int i = names.size() - 1; i >= 0; i--) {
			newFriends.add(names.get(i));
		}
		return newFriends;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> friends = new ArrayList<>();

		friends.add("Allen"); // adding friends
		friends.add("Cindy");
		friends.add("Tran");
		friends.add("Jose");

		System.out.println("original array: " + friends);
		System.out.println("reversed array: " + reverse(friends));
	}

}
