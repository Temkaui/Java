
public class BankAccount {
	private String accountNumber;
	private double checking;
	private double saving;
	private static int accountCount=0;
	private static double totalAmount=0;
	
	protected BankAccount() {
		accountCount += 1;
		this.accountNumber = getAccountNumber();
	}
	
	public String getAccountNumber() {
		String accountNumber = "";
		for(int i=0; i<10; i++) {
			int random = (int) (Math.random()*10);
			accountNumber += random;
		}
		return accountNumber;
	}
	
	private double getCheckingBalance() {
		return this.checking;
	}
	
	private double getSavingBalance() {
		return this.saving;
	}
	
	public void getBalances() {
		System.out.println("Checking:"+ getCheckingBalance());
		System.out.println("Saving:"+ getSavingBalance());
	}
	
	protected void deposit(String accountType, double amount) {
		if(accountType == "checking") {
			this.checking += amount;
		}
		else if(accountType == "saving") {
			this.saving += amount;
		}
		else {
			System.out.println("On what account should I deposit");
		}
		totalAmount += amount;
		System.out.println("You deposit $" + amount + " to " + accountType + "account");
	}
	
	protected void withDraw(String accountType, double amount) {
		if(accountType == "checking") {
			if(this.checking > amount) {
				this.checking -= amount;
				totalAmount -= amount;
			}
			else {
				System.out.println("Insufficient checking balance");
			}
		}
		else if(accountType == "saving") {
			if(this.saving > amount) {
				this.saving -= amount;
				totalAmount -= amount;
			}
			else {
				System.out.println("Insufficient saving balance");
			}
		}
		else {
			System.out.println("how much money from which account");
		}
		System.out.println("you withdraw $" + amount + "from " + accountType);
	}
	
	
}
