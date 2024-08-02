
public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Part 1:
		System.out.println("TASK 1:\n");
		Car adamCar = new Car();  //Creating first object with default constructor 
		
		adamCar.setMake("Toyota"); //populating object
		adamCar.setModel("Solara");
		adamCar.setYear(2005);
		adamCar.setSpeed(35);
		adamCar.setColor("White");
		adamCar.setPrice(4000);
		
		// creating second object with overloaded constructor
		Car sarahCar = new Car("Kia", "Niro", 2018, 45, "Blue", 22000);
		
		//printing colors of both objects
		System.out.println("Color of Adam's car: "+adamCar.getColor());
		System.out.println("Color of Sarah's car: "+sarahCar.getColor());
		
		//printing both objects
		System.out.println("\nAdam's car:\n");
		adamCar.displayFeatures();
		
		System.out.println("\n\nSarah's car:\n");
		sarahCar.displayFeatures();
		
		//increasing speed by 10
		adamCar.accel();
		System.out.println("\n\nAdam's current speed1: "+adamCar.getSpeed());
		
		//increasing speed by 10
		adamCar.accel();
		System.out.println("Adam's current speed2: "+adamCar.getSpeed());
		
		//attempting to increase speed by 100
		adamCar.accel(100);
		System.out.println("Adam's current speed3: "+adamCar.getSpeed());
		
		//reducing speed by 20
		adamCar.brake(20);
		System.out.println("Adam's current speed4: "+adamCar.getSpeed());
		
		//Part 2:
		System.out.println("\nTASK 2:");
		Car myCar = adamCar;
		
		//printing colors of both objects
		System.out.println("\nColor of Adam's car: "+adamCar.getColor());
		System.out.println("Color of my car: "+myCar.getColor());
		
		//Printing both objects
		System.out.println("\nAdam's car:\n");
		adamCar.displayFeatures();
		
		System.out.println("\n\nMy car:\n");
		myCar.displayFeatures();
		
		//Printing dealer
		Car.displayDealer();
		
		
	}

}


































