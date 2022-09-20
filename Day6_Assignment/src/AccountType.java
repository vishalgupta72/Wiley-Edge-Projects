
public enum AccountType {
	SAVINGS(2.5), CURRENT(0);
	
	private double interest;
	
	private AccountType(double interest) {
		this.interest = interest;
	}
	
	public double getInterest() {
		return this.interest;
	}
}
