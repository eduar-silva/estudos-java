package entities;

import exception.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws WithdrawException{
		validateWithdraw(amount);
		balance -= amount;
	}
	
	public void validateWithdraw(Double amount) throws WithdrawException{
		if (getBalance() <= 0) {
			throw new WithdrawException("No balance!");
		}
		if (amount > getWithdrawLimit()) {
			throw new WithdrawException("The amount exceeds withdraw limit!");
		}
	}
	
	@Override
	public String toString() {
		return "Holder: " + getHolder() 
		+ "\nBalance: " + getBalance();
	}
}
