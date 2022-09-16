
public class BankAccount {

	private String accountId;
	private String accountHolderName;
	private double openingBalance, currentBalance;
	private static double totalBalance;
	private AccountType accountType;
	

	public BankAccount(String accountId, String accountHolderName, double openingBalance, AccountType accountType) {
		super();
		int minBalance;
		if(accountType == AccountType.SAVINGS) {
			minBalance = 500;
		}
		else {
			minBalance = 1000;
		}
		if(openingBalance >= minBalance) {
			
			System.out.println("|Congratulations "+accountHolderName+"! Account created successfully!!");
			
			this.accountId = accountId;
			this.accountHolderName = accountHolderName;
			this.openingBalance = openingBalance;
			this.currentBalance = openingBalance;
			this.accountType = accountType;
			totalBalance += openingBalance;
			
			this.getAccountInfo();
		}
		else {
			System.out.println("|Dear "+ accountHolderName + ", Account cannot be created! Opening balance should be greater than "+minBalance+".");	
			System.out.println("|==========================================================================================|");
		}
	
	}
	
	public void getAccountInfo() {
		System.out.println("|Account holder name: "+ accountHolderName);
		System.out.println("|Account ID: "+accountId);
		System.out.println("|Account type: "+accountType);
		System.out.println("|Account balance: "+currentBalance);
		System.out.println("|Total balance in the Bank: "+totalBalance);
		
		System.out.println("|==========================================================================================|");
	}

	public void depositAmount(double amount) {
		currentBalance += amount;
		totalBalance += amount;
		System.out.println("|"+amount+" deposited to your account!");
	}
	
	public void withdrawAmount(double amount) {
		if(currentBalance - amount < openingBalance)
			System.out.println("|Low Balance! Cannot withdraw from Account."); 
		else {
			currentBalance -= amount;
			totalBalance -= amount;
			System.out.println("|"+amount+" withdrawn from your account!");
		}
	}
	
	public String getAccountId() {
		return accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public static double getTotalBalance() {
		return totalBalance;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

}
