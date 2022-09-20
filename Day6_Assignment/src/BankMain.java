
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b1 = new BankAccount("UCO101", "Siddhartha", AccountType.SAVINGS);
		BankAccount b2 = new BankAccount("BOB101", "Vishal", AccountType.CURRENT);
		
		try {
			System.out.println("Total Interest for b1: "+b1.calTotalInterest(5000, 6));
		} catch (DepositAmountException e) {
			System.out.println(e);
		}
		try {
			System.out.println("Total Interest for b2: "+b2.calTotalInterest(4000, 5));
		} catch (DepositAmountException e) {
			System.out.println(e);
		}
		try {
			System.out.println("Total Interest for b1: "+b1.calTotalInterest(0, 6));
		} catch (DepositAmountException e) {
			System.out.println(e);
		}

	}

}
