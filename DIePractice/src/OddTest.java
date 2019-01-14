import java.util.Scanner;

public class OddTest {
	
	public int n;
    public static void addOdd(int value){
    	int res,num;
    	res = value %10;
    	if(value % 2 ==1)
    	{
    		num = +res;
    		addOdd(value);
    	}
    	else
    	{
    		System.out.println("Ok");
    	}
    }
    public static void main(String[] args) {
	  int number;
	  Scanner sc = new Scanner(System.in);
	  number = sc.nextInt();
      addOdd(number);
    }
}
