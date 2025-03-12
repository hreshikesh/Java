public class BalanceRunner{
	public static void main(String args[]){
		int acno=1021;
		double balance=Balance.balance(acno);
		System.out.println("Account no"+acno+" Balance"+balance);
		
		acno=1017;
		balance=Balance.balance(acno);
		System.out.println("Account no"+acno+" Balance"+balance);
	}
}