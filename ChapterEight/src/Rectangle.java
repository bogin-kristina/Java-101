/*
* Kristina Bogin
* 
* May 5, 2024
* 
* CS A170
*/
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public void printDimentions() {
		System.out.println("The length is: "+getLength()+" ft.");
		System.out.println("The width is: "+getWidth()+" ft.");
		
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getArea() {
		return length*width;
	}
	
	public int getPerimeter() {
		return (length+width)*2;
	}
}
