
public class Account {
	
	public String name;
	public Money balance;
	public int number;
	public int transactions=0;

	public Account(String n, int no  ) {
		// TODO Auto-generated constructor stub
		name = n;
		number = no;
		transactions = 0;
		balance= new Money(0,0);
		
	}

	public String read_bal() {
		// TODO Auto-generated method stub
		return balance.read_value() ;
	}

	public void deposit(int e1, int c1) {
		// TODO Auto-generated method stub
		balance.add(e1, c1);
	}

	public int read_transactions() {
		// TODO Auto-generated method stub
		//transactions=transactions+1;
		return transactions++;
	}

	public boolean withdraw(int e, int c) {
		// TODO Auto-generated method stub
		boolean res = balance.sub(e, c);
		return res;
	}
	
	public String read_name() {
		// TODO Auto-generated method stub
		return name ;
	}

}
