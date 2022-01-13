package assignment1HCL;

public class exceptionsAssignment1 {
	
	int amount;
	int balance;
	
	public void withdraw(int amount) throws Exception {
		if (amount <= balance) {
			balance -= amount;
		}
		else {
			throw new Exception("Insufficient Funds!");
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
