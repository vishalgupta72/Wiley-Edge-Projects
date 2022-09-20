
public class BankAccount {
	private String accountId, accHolderName;
	private AccountType accountType;
	
	public BankAccount(String accountId, String accHolderName, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accHolderName = accHolderName;
		this.accountType = accountType;
	}
	
	public double calTotalInterest(double amt, int yrs) throws DepositAmountException {
		if(amt <= 0)
			throw new DepositAmountException();
		
		if(accountType == AccountType.CURRENT)
			System.out.println("Sorry! current account does not provide any interest.");
		return (amt*yrs*accountType.getInterest())/100;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}
	
}
