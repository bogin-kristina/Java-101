/*
* Kristina Bogin
* 
* February 7, 2024
* 
* CS A170
*/

/**
 * Task 3 from Lab in Chapter 2. 
 * Writing a program that calculates the volume of a sphere 
 * when the radius is equal to 5 using methods from the Math Class.
 */
public class ChTwoLabSphere {

	public static void main(String[] args) {
		
		double radius = 5.0;
		final double RADIUS_POWER_SPHERE_VOLUME_FORMULA = 3.0;
		final double DIVIDEND_SPHERE_VOLUME_FORMULA = 4.0; 
		final double DIVISOR_SPHERE_VOLUME_FORMULA = 3.0;
		
		double volume = DIVIDEND_SPHERE_VOLUME_FORMULA / DIVISOR_SPHERE_VOLUME_FORMULA * 
				Math.PI * Math.pow(radius, RADIUS_POWER_SPHERE_VOLUME_FORMULA);
		
		System.out.println("the volume of a sphere when the radius is equal to 5 is " + volume);
	}

}
