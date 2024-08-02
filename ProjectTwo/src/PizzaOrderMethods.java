import java.util.Scanner;

/**
 * Kristina Bogin
 *
 * Mayada Alani
 *
 * This program allows a user to make choices in a menu creates a pizza ordered
 * to the specifications that the user desires. It walks the user through
 * ordering, giving the user choices, which the program then uses to decide how
 * to make the pizza and how much the cost of the pizza will be.
 *
 * 4/9/2024
 */
public class PizzaOrderMethods {

	public static Scanner in = new Scanner(System.in);

	/**
	 * Greets the customer, and takes customer's name.
	 * 
	 * @return name of the customer.
	 */
	public static String getName() {
		System.out.print("Welcome to Mumu and Peppa’s Pizzeria\nEnter your first name: ");
		String name = in.next();
		return name;
	}

	/**
	 * Checks if the customer's name matching owner's name.
	 * 
	 * @param name is customer's name.
	 * @return true if the name is matching.
	 */
	public static boolean nameCheck(String name) {

		boolean discount = false;
		if (name.equalsIgnoreCase("Mumu") || name.equalsIgnoreCase("Peppa")) {
			discount = true;
		}
		if (discount) {
			System.out.println("\nYou're eligible for a $2.00 discount. \n");
		}
		return discount;
	}

	/**
	 * Prints pizza sizes and prices. Asks customer to choose size.
	 * 
	 * @return selected size.
	 */
	public static int getSize() {
		System.out.println("\nPizza Size(inches)     Cost\n" + "\t10            $10.99\n" + "\t12            $12.99\n"
				+ "\t14            $14.99\n" + "\t16            $16.99\n");

		System.out.print("What size pizza would you like?\n" + "10, 12, 14, or 16 (enter the number only): ");
		int size = in.nextInt();

		return size;
	}

	/**
	 * Takes selected pizza size and translates it to a String.
	 * 
	 * @param size customers selection from getSize() method.
	 * @return String with a selected pizza size.
	 */
	public static String sizeName(int size) {

		String pizzaSize = "12-inch Pizza";
		if (size == 10) {
			pizzaSize = "10-inch Pizza";
		} else if (size == 12) {
			pizzaSize = "12-inch Pizza";
		} else if (size == 14) {
			pizzaSize = "14-inch Pizza";
		} else if (size == 16) {
			pizzaSize = "16-inch Pizza";
		} else {
			System.out.println("Your input was not one of the choices, so a 12 inch pizza will be made.");
		}

		return pizzaSize;
	}

	/**
	 * Calculates pizza's base price based on selected size.
	 * 
	 * @param pizzaSize customers selection from sizeName() method.
	 * @return double base price for selected size.
	 */
	public static double sizePrice(String pizzaSize) {
		double price = 0;

		if (pizzaSize.contains("10")) {
			price = 10.99;
		} else if (pizzaSize.contains("12")) {
			price = 12.99;
		} else if (pizzaSize.contains("14")) {
			price = 14.99;
		} else if (pizzaSize.contains("16")) {
			price = 16.99;
		}

		return price;
	}

	/**
	 * Prints crust options. Asks customer to choose crust.
	 * 
	 * @return customers input.
	 */
	public static String getCrust() {
		System.out.print("\nWhat type of crust do you want?\n"
				+ "(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
		String crust = in.next();

		return crust;
	}

	/**
	 * Takes customers selection and translates it to a string with selected crust.
	 * 
	 * @param crust customers selection from getCrust() method.
	 * @return full crust name.
	 */
	public static String crustName(String crust) {

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

		return crust + "crust";
	}

	/**
	 * Prints topping options, asks user about pepperoni.
	 * 
	 * @return users answer.
	 */
	public static String getPepperoni() {
		System.out.println("\nAll pizzas come with cheese.\n" + "Additional toppings are $1.25 each, choose from:\n"
				+ "Pepperoni, Sausage, Onion, Mushroom\n");
		System.out.print("Do you want Pepperoni? (Y/N): ");
		String pepperoni = in.next();
		return pepperoni;
	}

	/**
	 * Prints topping options, asks user about sausage.
	 * 
	 * @return users answer.
	 */
	public static String getSausage() {
		System.out.print("Do you want Sausage? (Y/N): ");
		String sausage = in.next();
		return sausage;
	}

	/**
	 * Prints topping options, asks user about onion.
	 * 
	 * @return users answer.
	 */
	public static String getOnion() {
		System.out.print("Do you want Onion? (Y/N): ");
		String onion = in.next();
		return onion;
	}

	/**
	 * Prints topping options, asks user about mushroom.
	 * 
	 * @return users answer.
	 */
	public static String getMushroom() {
		System.out.print("Do you want Mushroom? (Y/N): ");
		String mushroom = in.next();
		return mushroom;
	}

	/**
	 * Combines selected toppings in one readable String.
	 * 
	 * @param pepperoni customers selection from getPepperoni() method.
	 * @param sausage   customers selection from getSausage() method.
	 * @param onion     customers selection from getOnion() method.
	 * @param mushroom  customers selection from getMushroom() method.
	 * @return all selected toppings.
	 */
	public static String toppingsName(String pepperoni, String sausage, String onion, String mushroom) {

		String toppings = "Cheese";

		if (pepperoni.equalsIgnoreCase("Y")) {
			toppings += ", Pepperoni";
		}
		if (sausage.equalsIgnoreCase("Y")) {
			toppings += ", Sausage";
		}
		if (onion.equalsIgnoreCase("Y")) {
			toppings += ", Onion";
		}
		if (mushroom.equalsIgnoreCase("Y")) {
			toppings += ", Mushroom";
		}
		return toppings;
	}

	/**
	 * Calculates toppings price based on number of toppings.
	 * 
	 * @param toppings String with selected toppings' names.
	 * @return total price for selected toppings.
	 */
	public static double toppingsPrice(String toppings) {
		int toppingCounter = 0;
		double singleToppingPrice = 1.25;
		if (toppings.contains("Pepperoni")) {
			toppingCounter += 1;
		}
		if (toppings.contains("Sausage")) {
			toppingCounter += 1;
		}
		if (toppings.contains("Onion")) {
			toppingCounter += 1;
		}
		if (toppings.contains("Mushroom")) {
			toppingCounter += 1;
		}

		return toppingCounter * singleToppingPrice;
	}

	/**
	 * Calls methods above to initiate the order.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double taxRate = 0.0795;
		double total = 0;
		if (nameCheck(getName())) { // Calls nameCheck() method and gets boolean value
			total -= 2; // Calculates discount
		}

		String pizzaSize = sizeName(getSize()); // Calls sizeName() method and stores returned size name
		total += sizePrice(pizzaSize); // Adds base price to the total
		String crust = crustName(getCrust()); // Calls crustName() method and stores returned crust name
		
		// Calls toppings() method and stores returned toppings' names
		String toppings = toppingsName(getPepperoni(), getSausage(), getOnion(), getMushroom()); 
		total += toppingsPrice(toppings); // Adds toppings' price to the total
		double tax = total * taxRate; // Calculates tax for current order

		System.out.println("\nYour order is as follows: ");
		System.out.println(pizzaSize);
		System.out.println(crust);
		System.out.println(toppings);
		System.out.printf("The cost of your order is: $%.2f", total);
		System.out.printf("\nThe tax is: $%.2f", tax);
		System.out.printf("\nThe total due is: $%.2f", total + tax);
		System.out.println("\nYour order will be ready for pickup in 30 minutes.");
	}

}
