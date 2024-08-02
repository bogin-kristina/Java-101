
public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Box 1:
		System.out.println("Box 1: ");
		Rectangle box1 = new Rectangle();
		
		box1.setLength(10);
		box1.setWidth(20);
		
		int area1 = box1.getLength()*box1.getWidth();
		
		int area2 = box1.getArea();
		
		box1.printDimentions();
		System.out.println("Area1 is: "+area1+" sq. ft.");
		System.out.println("Area2 is: "+area2+" sq. ft.");
		System.out.println("Perimeter: "+box1.getPerimeter()+" ft.");
		
		//Box 2:
		System.out.println("\nBox 2: ");
		Rectangle box2 = new Rectangle(4, 5);
		
		int area3 = box2.getLength()*box2.getWidth();
		
		int area4 = box2.getArea();
		
		box2.printDimentions();
		System.out.println("Area1 is: "+area3+" sq. ft.");
		System.out.println("Area2 is: "+area4+" sq. ft.");
		System.out.println("Perimeter: "+box2.getPerimeter()+" ft.");
		
		//Box 3:
		
		System.out.println("\nBox 3: ");
		
		Rectangle box3 = new Rectangle(50, 40);
		
		int area5 = box3.getLength()*box3.getWidth();
		
		int area6 = box3.getArea();
		
		box3.printDimentions();
		System.out.println("Area1 is: "+area5+" sq. ft.");
		System.out.println("Area2 is: "+area6+" sq. ft.");
		System.out.println("Perimeter: "+box3.getPerimeter()+" ft.");
	}

}





































