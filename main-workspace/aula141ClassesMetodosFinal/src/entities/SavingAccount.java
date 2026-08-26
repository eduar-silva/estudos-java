package entities;

//não é possível criar uma subclasse a partir de SavingAccount
public final class SavingAccount extends Account{
	
	private Double interestRate;
	
	public SavingAccount() {
		super();
	}
	
	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//método não pode mais ser sobreposto a partir dessa classe
	@Override
	public final void withdraw(Double amount) {
		balance -= amount;
	}
}
