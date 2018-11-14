package account2;

import counter.TooHighException;

class Account{
	
	public int balance=0;
      public Account(int b)
      {balance = b;}
	public void deposit(int amt) {
		this.balance += amt;
	}
	public int  withdraw (int amt)throws MyException,MyException2{
		int resultCode=0;
		if (amt>100)             { throw new MyException("Maximum Withdraw limit is 100");  }
		else if (amt> balance)   { throw new MyException2("Insufficient Funds");  }
		     else                { balance -= amt;}
		return resultCode;
	}
	public int read_balance(){
		return this.balance;
	}
}

//=====================================
/*  public class TestAccount2{
public static void main(String [] args) throws MyException, MyException2{
        Account a = new Account(150);
        int amt[]={70, 20,85};
        for(int i=0;i<3;i++){
           int resultCode = a.withdraw(amt[i]);
           if (resultCode==0)System.out.println("Success");
           if (resultCode==1)System.out.println("Max withdrawl100");   
           if (resultCode==2)System.out.println("Insuff Funds");
        }
	}}
*/
//============================================

public class TestAccount2{
public static void main(String [] args){
        Account a = new Account(150);
        int amt[]={70, 120,85};
        for(int i=0;i<3;i++){
           try{
               a.withdraw(amt[i]);
               System.out.println("Success");}
           catch(MyException e1)
               {System.out.println("Max withdrawl100");}   
           catch(MyException2 e2)
               {System.out.println("Insuff Funds");}
        }
	}

}
