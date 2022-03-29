package AccountDemo945;
//import java.util.Scanner;
//
//
//


public class AccountDemo945 {
	public static void main(String args[]) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter account id: ");
//		int accountID945 = input.nextInt();
//		System.out.println("Please enter account banance: ");
//		double balance945 = input.nextDouble();
//		System.out.println("Please enter transantion type: ");
//		String transactionType945 = input.nextLine();
//		Account945 accountOne945 = new Account945(accountID945,balance945, transactionType945);
		Account945 accountOne945 = new Account945(1234,25000, "debit");
		System.out.println("accountID945"+accountOne945.accountID945 );
		System.out.println("balance945"+accountOne945.balance945) ;
		System.out.println("transactionType: "+accountOne945.transactionType945 );
		System.out.println("changed Balance: "+accountOne945.changeBalance945(50) );
    }
}
