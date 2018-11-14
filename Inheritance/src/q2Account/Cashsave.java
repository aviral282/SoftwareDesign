package q2Account;

public class Cashsave extends Account {
	int max;
	public Cashsave(int n,int b,int m){
		super(n,b);
		max = m;
		
	}
	
	public int read_balance() {
		// TODO Auto-generated method stub
		return super.read_balance();
	}

	public boolean deposit(int amt) {
		// TODO Auto-generated method stub
	    	if((amt+balance)>max)
	             return false;
	    	
	    	else {
	    		balance+=amt;
	    	return true;
	             }
	 
	}

	public boolean withdraw(int amt) {
		// TODO Auto-generated method stub
		return super.withdraw(amt);
	}

}
