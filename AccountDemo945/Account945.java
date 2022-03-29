package AccountDemo945;

public class Account945 {
	public int accountID945;
	public double balance945;
	public String transactionType945;
	
	public Account945(){
		accountID945= 0;
		balance945= -1.0;
		transactionType945 = null;
	}
	
	public Account945(int accountId, double banance, String transactionType) {
		accountID945= accountId;
		balance945= banance;
		transactionType945 = transactionType;
	}
	
	public double changeBalance945(double x) {
		if(transactionType945 == "debit") {
			balance945 = balance945-x;
			return balance945;
		}else if(transactionType945 == "credit") {
			balance945 = balance945+x;
			return balance945;
		}else {
			return balance945;
		}
	}
	
}
