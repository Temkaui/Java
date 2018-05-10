
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit("checking", 100);
		account.deposit("saving", 1000);
		account.withDraw("checking", 25);
		account.getBalances();

	}

}