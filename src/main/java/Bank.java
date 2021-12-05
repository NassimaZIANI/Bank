import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	private Map<Integer, Double> userAccount;
	
	public Bank() {
		userAccount = new HashMap<Integer, Double>();
		userAccount.put(123, 2000.0);
		userAccount.put(234, 10.0);
		userAccount.put(356, 1000.0);
		userAccount.put(843, 500.0);
		userAccount.put(2135, 0.0);
	}

	public void depositOf(int id, double amount) {
		if(userAccount.containsKey(id)) {
			double balance = userAccount.get(id);
			balance += amount;
			userAccount.replace(id, balance);
		} else {
			userAccount.put(id, amount);
		}
			
	}
	
	public boolean withdrawalOf(int id, double amount) {
		if(userAccount.containsKey(id)) { 
			double balance = userAccount.get(id);
			if (balance >= amount) {
				balance-=amount;
				userAccount.replace(id, balance);
				return true;
			}
		}
		return false;
	}
	
	public double balanceValue(int id) {
		if(userAccount.containsKey(id)) { 
			return userAccount.get(id);
		}
		return -1;
	}
	
}
