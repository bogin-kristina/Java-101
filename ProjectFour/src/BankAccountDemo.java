/**
 * 5/15/2024
 * Kristina Bogin 
 * Project 4
 * This program creates Bank Accounts 
 */
public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ADAM
		BankAccount adamsAcc = new BankAccount();
		
		//testing all 4 setters:
		adamsAcc.setAccType('C'); 
		adamsAcc.setAccName("Adam S");
		adamsAcc.setBalance(3000);
		
		System.out.println("Adam's initial info: "+adamsAcc.displayAccountInfo());
		
		//trying to add interest to checking acc
		adamsAcc.addInterest();
		System.out.println("\nAdam's Acc Info after trying to add interest: "+adamsAcc.displayAccountInfo());
		
		//SAM
		BankAccount samsAcc = new BankAccount(2500, "Sam H", 'S');
		
		System.out.println("\nSam's initial balance: $"+samsAcc.getBalance());
		
		//setting higher interest rate for Sam
		samsAcc.setInterestRate(0.13);
		
		//and adding interest
		samsAcc.addInterest();
		
		//displaying acc info
		System.out.println("Sam's Acc Info after adding interest: "+samsAcc.displayAccountInfo());
		
		//LEILA
		BankAccount leilasAcc = new BankAccount(2500, "Leila M", 'S');
		
		System.out.println("\nLeila's initial balance: $"+leilasAcc.getBalance());
		
		//adding interest (rate is 0.03)
		leilasAcc.addInterest();
		
		//displaying acc info
		System.out.println("Leila's Acc Info after adding interest: "+leilasAcc.displayAccountInfo());
		
		//transferring $500 from adam to leila:
		adamsAcc.trasfer(500, leilasAcc);
		System.out.println("\nAdam's balance after $500 transfer to Leila: $"+adamsAcc.getBalance());
		System.out.println("Leila's balance after receiving transfer: $"+leilasAcc.getBalance());
		
		//Withdrawing $175 from Leila and depositing to Sam:
		leilasAcc.withdraw(175);
		System.out.println("\nLeila's balance after withdrawing $175: $"+leilasAcc.getBalance());
		samsAcc.deposit(175);
		System.out.println("Sam's balance after depositing $175: $"+samsAcc.getBalance());
		
		//testing illegal argument exception 
		leilasAcc.withdraw(17500);
		
		//adamsAcc.trasfer(5000, leilasAcc);
	}

}
