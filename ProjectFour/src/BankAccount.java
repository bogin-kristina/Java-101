/**
 * 5/15/2024
 * Kristina Bogin 
 * Project 4
 * This program creates Bank Accounts 
 * and contains several methods that interact with them
 */
public class BankAccount {
	private double balance;
	private String accName;
	private int accNum;
	private char accType;
	private double interestRate = 0.03;
	private static int lastAccNum  = 0;
	
	/**
	 * default constructor
	 */
	public BankAccount() {
		balance = 0;
		accName = "";
		accNum = lastAccNum+1;
		accType = ' ';
		interestRate = 0.03;
		lastAccNum++;
	}
	
	/**
	 * Overloaded constructor
	 * @param balance of an account
	 * @param accName name of account holder
	 * @param accType checking or savings 
	 */
	public BankAccount(double balance, String accName, char accType) {
		this.balance = balance;
		this.accName = accName;
		accNum = lastAccNum+1;
		this.accType = accType;
		interestRate = 0.03;
		lastAccNum++;
	}

	/**
	 * gets balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * sets balance
	 * @param balance of an account
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * gets account name
	 * @return accName
	 */
	public String getAccName() {
		return accName;
	}

	/**
	 * sets account name
	 * @param accName name of account holder
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}

	/**
	 * gets account type
	 * @return accType checking or savings 
	 */
	public char getAccType() {
		return accType;
	}

	/**
	 * sets account type
	 * @param accType checking or savings 
	 */
	public void setAccType(char accType) {
		this.accType = accType;
	}

	/**
	 * gets interest rate
	 * @return Interest Rate %
	 */
	public double getInterestRate() {
		return interestRate*100;
	}

	/**
	 * sets interest rate
	 * @param interestRate %/100
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	/**
	 * withdraws money from an account if balance is greater than amount 
	 * @param amount to withdraw
	 */
	public void withdraw(double amount) {
		if(amount>balance) {
			throw new IllegalArgumentException("Amount exceeds balance.");
		}
		balance-=amount;
	}
	
	/**
	 * deposits money to an account
	 * @param amount to deposit
	 */
	public void deposit(double amount) {
		balance+=amount;
	}
	
	/**
	 * transfers money from one account to another, 
	 * if the first account has enough balance
	 * @param amount to transfer
	 * @param receiver account to transfer to
	 */
	public void trasfer(double amount, BankAccount receiver) {
		if(amount>balance) {
			throw new IllegalArgumentException("Amount exceeds balance.");
		}
		receiver.deposit(amount);
		balance-=amount;
	}
	
	/**
	 * displays account info
	 * @return string with acc info
	 */
	public String displayAccountInfo () {
		String info = "\nAccount name: "+ getAccName()+
				"\nBalance: $"+getBalance()+
				"\nAccount type: "+getAccType()+
				"\nInterest rate: %"+getInterestRate()+
				"\nAccount number: "+accNum;
		return info;
	}
	
	/*
	 * adds interest to an account 
	 */
	public void addInterest() {
		
		if(Character.toLowerCase(accType)=='s') {
			balance+=Financial.percentOf(interestRate, balance);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
