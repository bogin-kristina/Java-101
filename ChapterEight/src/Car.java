/*
* Kristina Bogin
* 
* May 5, 2024
* 
* CS A170
*/
public class Car {
	
	private String make;   
	private String model;      
	private int year;       
	private int speed;    
	private String color;  
	private double price;
	private static String dealer = "Car Max";
	
	/**
	 * Default constructor
	 */
	public Car() {
		make = "";
		model = "";
		year = 0;
		speed = 0;
		color = "";
		price = 0;
	}

	/**
	 * Overloaded constructor
	 * @param make
	 * @param model
	 * @param year
	 * @param speed
	 * @param color
	 * @param price
	 */
	public Car(String make, String model, int year, int speed, String color, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.color = color;
		this.price = price;
	}

	/**
	 * get method for make 
	 * @return make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * set method for make
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * get method for model
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * set method for model
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * get method for year
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * set method for year
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * set method for speed
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * set method for speed
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * get method for color
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * set method for color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * get method for price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * set method for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * increases speed by 10
	 */
	public void accel() {
		speed+=10;
	}
	
	/**
	 * increases speed using param unless speed is becoming over a 100
	 * @param increase
	 */
	public void accel(int increase) {
		
		if(speed+increase>100) {
			System.out.println("Caution!! You may get a ticket!");
		}
		else {
			speed+=increase;
		}
	}
	
	/**
	 * decreases speed by 10
	 */
	public void brake() {
		speed-=10;
	}
	
	/**
	 * decreases speed using param unless speed is becoming a negative number
	 * @param decrease
	 */
	public void brake(int decrease) {
		if(speed-decrease<0) {
			System.out.println("\nSpeed cannot be negative.");
		}
		else {
		speed-=decrease;
		}
	}
	
	/**
	 * printing all features of an object
	 */
	public void displayFeatures() {
		System.out.printf("Make: %s%nModel: %s%nYear: %d%nSpeed: %d mph%nColor: %s%nPrice: $%.2f",
				getMake(), getModel(), getYear(), getSpeed(), getColor(), getPrice());
	}
	
	/**
	 * Prints dealer
	 */
	public static void displayDealer() {
		System.out.println("\n\nDealership: "+dealer);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
