/* Tony Ramirez, Kristina Bogin
*
* Mayada Alani
*
* this program allows a user to make choices in a menu
* creates a pizza ordered to the specifications that the user desires. 
* It walks the user through ordering, giving the user choices, 
* which the program then uses to decide how to make the pizza 
* and how much the cost of the pizza will be. 
*
* 4/3/2024
*/

import java.util.Scanner;

public class PizzaOrder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// presents the user then ask's the user for their name
		System.out.print("Welcome to Kris and Tony’s Pizzeria\nEnter your first name: ");
		// initialiizes the name variable
		String name = in.next();

		// Prints available pizza sizes
		System.out.println("\nPizza Size(inches)     Cost\n" + "\t10            $10.99\n" + "\t12            $12.99\n"
				+ "\t14            $14.99\n" + "\t16            $16.99\n");

		// TASK TWO
		double price = 0;
		boolean discount = false;
		if (name.equalsIgnoreCase("Kris") || name.equalsIgnoreCase("Tony")) {
			discount = true;
		}

		if (discount) {
			System.out.println("\nYou're eligible for a $2.00 discount. \n");
			price = price - 2;

		}

		// END TASK TWO

		// promts the user to choose a pizza size
		System.out.print("What size pizza would you like?\n" + "10, 12, 14, or 16 (enter the number only): ");

		// TASK THREE

		// iniates the variable size
		int size = 0;
		size = in.nextInt();

		// calculating base price if pizza

		if (size == 10) {
			price += 10.99;
		} else if (size == 12) {
			price += 12.99;
		} else if (size == 14) {
			price += 14.99;
		} else if (size == 16) {
			price += 16.99;
		} else {
			size = 12;
			price += 12.99;
			System.out.println("Your input was not one of the choices, so a 12 inch pizza will be made.");
		}
		// END TASK THREE

		// TASK FOUR

		// ask user for the type of crust they want
		System.out.print("\nWhat type of crust do you want?\n"
				+ "(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");

		// initializes the variable crust
		String crust = in.next();

		// turns the character into the type of crust
		switch (crust.toUpperCase()) {
		case "H":
			crust = "Hand-tossed ";
			break;
		case "T":
			crust = "Thin-";
			break;
		case "D":
			crust = "Deep-dish ";
			break;
		default:
			crust = "Hand-tossed ";
			System.out.println("Your input was not one of the choices, so a Hand-tossed crust will be made. ");
			break;
		}

		// END TASK FOUR

		// asks the user for the what type of topping's they would like
		System.out.print("\nAll pizzas come with cheese.\n" + "Additional toppings are $1.25 each, choose from:\n"
				+ "Pepperoni, Sausage, Onion, Mushroom\n" + "\nDo you want Pepperoni? (Y/N): ");

		String pepperoni = in.next();

		System.out.print("Do you want Sausage? (Y/N): ");

		String sausage = in.next();

		System.out.print("Do you want Onion? (Y/N): ");

		String onion = in.next();

		System.out.print("Do you want Mushroom? (Y/N): ");

		String mushroom = in.next();

		// Printing the order
		System.out.println("\nYour order is as follows: ");
		System.out.println(size + "-inch pizza");
		System.out.println(crust + "crust");
		System.out.print("Cheese");

		// printing toppings and calculating the price with toppings
		double toppingPrice = 1.25;

		// TASK FIVE

		if (pepperoni.equalsIgnoreCase("Y")) {
			System.out.print(", Pepperoni");
			price += toppingPrice;
		}
		if (sausage.equalsIgnoreCase("Y")) {
			System.out.print(", Sausage");
			price += toppingPrice;
		}
		if (onion.equalsIgnoreCase("Y")) {
			System.out.print(", Onion");
			price += toppingPrice;
		}
		if (mushroom.equalsIgnoreCase("Y")) {
			System.out.print(", Mushroom");
			price += toppingPrice;
		}

		// END TASK FIVE

		double taxRate = 0.0795;

		System.out.printf("\nThe cost of your order is: $%.2f", price);
		double tax = price * taxRate;
		System.out.printf("\nThe tax is: $%.2f", tax);

		System.out.printf("\nThe total due is: $%.2f", price + tax);
		System.out.println("\nYour order will be ready for pickup in 30 minutes.");

	}

}
