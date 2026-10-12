package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("-- Enter account data --");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc1 = new Account(number, holder, initialBalance, withdrawLimit);
			System.out.println("\n" + acc1);
			
			System.out.print("\nEnter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc1.withdraw(amount);
			System.out.println("\n" + acc1);
		}
		catch (WithdrawException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid input!");
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		finally{
			System.out.println("Operation done!");
		}
		
		sc.close();
	}

}
