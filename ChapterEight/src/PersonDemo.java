
public class PersonDemo {
	public static void main(String[] args) {
		Person per1 = new Person();   //creating objects of the Person class
		
		per1.setName("Nathan");//initializing with setters
		per1.setAge(30);
		per1.setAddress("Irvine");
		
		//using overloaded constructors for these objects
		Person per2 = new Person("Kristina", 23, "Costa Mesa");
		Person per3 = new Person("Anna", 48, "Chatsworth");
		
		System.out.println("Person 1: ");
		per1.printInfo();         // printing all objects
		
		System.out.println("Person 2: ");
		per2.printInfo();
		
		System.out.println("Person 3: ");
		per3.printInfo();
		
		per1.setName("Arsen"); //changing name of 1st object
		
		System.out.println("Person 1: ");  //printing it again
		per1.printInfo();
		
		
	}
}
