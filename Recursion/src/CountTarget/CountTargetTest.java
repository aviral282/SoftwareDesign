package CountTarget;


public class CountTargetTest {

    public static int countTarget(int value,int t){
    	
    	if(value< 10) {
    	
    		if(value==t) {
    			return 1;
    		}
    		else
    			return 0;
    	}
    	else {
    	int last = value%10;
    	int res = value/10;
    	if(last == t) {
    		return 1+countTarget(res, t);
    		}
    	else {
    		return 0 +countTarget(res, t);
    	}
    	}
  //  return 0;
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ countTarget(number,target));
    }
}

