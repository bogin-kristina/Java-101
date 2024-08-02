/*
* Kristina Bogin
* 
* May 5, 2024
* 
* CS A170
*/

public class Person {
	private String name;
	private int age;        // instance variables
	private String address;
	
	
	public Person() {    // default constructor
		name = "";
		age = 0;
		address = "";
	}
	
	public Person(String name, int age, String address) {
		this.name = name;     // overloaded constructor
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name) {  //setters and getters
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void printInfo() {   // prints all info of an object
		System.out.println("Name: "+name+"\nAge: "+age+"\nAddress: "+address+"\n");
	}
}
