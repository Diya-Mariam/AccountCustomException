package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AcoountTest {

	public static void main(String[] args) {

		Account acc = new Account(101, "Diya", 10000);
		acc.Deposit(1000);

		try
		{
			acc.Withdraw(100);
			acc.Withdraw(20000);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
