package searchTarget;


public class SearchTargetTest {

    public static boolean searchTarget(int value,int t){
    	if(value< 10) {
        	
    		if(value==t) {
    			return true;
    		}
    		else
    			return false;
    	}
    	else {
        	int last = value%10;
        	int res = value/10;
        	if(last == t) {
        		return true;
        		}
        	else {
        		return searchTarget(res, t);
        	}
        	}
    	//return false;
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ searchTarget(number,target));
    }
}

