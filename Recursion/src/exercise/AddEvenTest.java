package exercise;
public class AddEvenTest {

    public static int addEven(int value){
    	if(value<10) {
    		return value;
    	}
    	else {
    		int last = value%10;
    		int rest = value/10;
    		return last+addEven(rest);
    	}
    
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ addEven(number));
    }
}

