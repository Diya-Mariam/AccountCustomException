package com.aurionpro.model;

import com.aurionpro.exception.InsufficientFundException;

public class Account {

	private int id;
	private String name;
	private int balance;

	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}
	
	public void Deposit(int amount){
		if(amount > 0)
		{
			balance+=amount;
			System.out.println("Amount deposited successfully");
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}

	public void Withdraw(int amount) // throws InsufficientFundException						// for checked exception
	{						
		if(balance-amount > 0)
		{
			balance-=amount;
			System.out.println("Amount withdrawn successfully");

		}
		else
		{
		//	System.out.println("Insufficient balance");
			throw new InsufficientFundException("Insufficient balance"); 
		}
	}
	
	

}
