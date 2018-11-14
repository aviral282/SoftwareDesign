package exercise2;

public class AddEvenTest {

    public static int addEven(int value){
    	if(value<10){
    		if (value%2==0)return value;
    	else
    		return 0;}
    	else {
    		int last = value%10;
    		int res = value/10;
    		if(last%2==0) {
    			return last + addEven(res);
    		} else
    			return 0 + addEven(res);
    	}
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ addEven(number));
    }
}

