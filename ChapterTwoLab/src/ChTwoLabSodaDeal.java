
/*
* Kristina Bogin
* 
* February 1, 2024
* 
* CS A170
*/

/**
 * Task 1 from Lab in Chapter 2. 
 * This program calculates volume of a six-pack of cans vs a two-liter bottle.
 */

public class ChTwoLabSodaDeal {

	public static void main(String[] args) {
		
		//Declaring variables and assigning values:
		
		byte cansPerPack = 6;         //amount of 12oz cans per pack
		int ozPerCan = 12;           //volume of each can in oz
		final double LTIN1OZ = 0.0296;  //number of liters in one oz
		final double BOTTLE_VOLUME = 2; // Two-liter bottle
		
	    double litersPer6Pack = cansPerPack * ozPerCan * LTIN1OZ;  //calculating volume of one six-pack in liters
	    double totalVolume = litersPer6Pack + BOTTLE_VOLUME; //calculating volume of six-pack and a bottle
	    
        //Printing volume of a six-pack
		System.out.print("A six-pack of 12-ounce cans contains "+litersPer6Pack); 
	    System.out.println(" liters.");
	    
        //Printing volume of a six-pack and a bottle
	    System.out.print("A six-pack and a two-liter bottle contain "+totalVolume);
	    System.out.println(" liters.");
		
		
	}

}
