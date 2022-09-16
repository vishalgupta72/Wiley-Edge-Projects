
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("|==========================================================================================|");
		
		BankAccount bankAccount1 = new BankAccount("SBI101", "Vishal", 400, AccountType.SAVINGS);
		if(bankAccount1.getAccountId() != null) {
			bankAccount1.depositAmount(200);
			bankAccount1.withdrawAmount(10);
			bankAccount1.getAccountInfo();
		}
		BankAccount bankAccount2 = new BankAccount("SBI102", "Praveen", 600, AccountType.SAVINGS);
		if(bankAccount2.getAccountId() != null) {
			bankAccount2.depositAmount(200);
			bankAccount2.withdrawAmount(10);
			bankAccount2.getAccountInfo();
		}
		BankAccount bankAccount3 = new BankAccount("SBI103", "Deepak", 100, AccountType.CURRENT);
		if(bankAccount3.getAccountId() != null) {
			bankAccount3.depositAmount(200);
			bankAccount3.withdrawAmount(10);
			bankAccount3.getAccountInfo();
		}
		BankAccount bankAccount4 = new BankAccount("SBI104", "Sid", 1400, AccountType.CURRENT);
		if(bankAccount4.getAccountId() != null) {
			bankAccount4.depositAmount(200);
			bankAccount4.withdrawAmount(10);
			bankAccount4.withdrawAmount(2000);
			bankAccount4.getAccountInfo();
		}
	}

}
