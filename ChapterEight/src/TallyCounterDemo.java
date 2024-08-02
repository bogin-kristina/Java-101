
public class TallyCounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TallyCounter concert = new TallyCounter();  //creating objects of the TallyCounter class
		TallyCounter bus = new TallyCounter();
		
		concert.setColor("Green");  //setting colors
		bus.setColor("Blue");
		
		System.out.println("Displaying concert: ");  //displaying objects using getters
		System.out.println(concert.getColor());
		System.out.println(concert.getCounter());
		
		System.out.println("\nDisplaying bus: ");
		System.out.println(bus.getColor());
		System.out.println(bus.getCounter());
		
		concert.setCounter(5);   // changing counter of concert 
		
		System.out.println("\nDisplaying new concert counter: ");
		System.out.println(concert.getCounter());  //displaying counter again
	}

}
