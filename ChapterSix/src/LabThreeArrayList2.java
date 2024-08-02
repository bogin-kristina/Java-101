
/*
* Kristina Bogin
* 
* April 14, 2024
* 
* CS A170
*/
import java.util.ArrayList;

/**
 * Task 2, Lab 3, Chapter 6. This program modifies an ArrayList with friends.
 */
public class LabThreeArrayList2 {

	public static void main(String[] args) {
		// initializing the array list
		ArrayList<String> friends = new ArrayList<>();
		
		friends.add("Carrie");  //adding friends
		friends.add("Bob");
		friends.add("Ali");
		friends.add("Sarah");
		friends.add("Ellen");
		
		friends.add(4, "Richard"); //adding Richard at index 4
		
		friends.set(friends.size()-1, "Ellie"); //setting Ellie as last friend
		
		//printing last friend
		System.out.println("The last name in the list is: "+ friends.get(friends.size()-1));
		
		friends.remove(0); //removing first friend
		
		//printing array list size
		System.out.println("The size of your array list is: "+friends.size());
		
		System.out.println("The friends list without a loop: "+friends);
		
		System.out.print("The friends list with a loop: ");
				
		for(String name : friends) {
			System.out.print(name+" ");  //enhanced for loop
		}

	}

}
