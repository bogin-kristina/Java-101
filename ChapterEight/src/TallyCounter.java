/*
* Kristina Bogin
* 
* May 5, 2024
* 
* CS A170
*/
public class TallyCounter {

	private int counter = 0;  // instance variables
	private String color;
	
	public void increaseCounter() {  //increases counter by 1
		counter++;
	}
	
	public void displayCounter() {  //prints counter
		System.out.println(counter);
	}
	
	public void displayColor() {   //prints color
		System.out.println(color);
	}
	
	public void setColor(String color) {    //setters and getters
		this.color = color;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getCounter() {
		return counter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
