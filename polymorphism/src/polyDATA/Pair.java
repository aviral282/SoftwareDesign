package polyDATA;

public class Pair extends Data {

	public Pair(int v1, int v2) {
		super(v1, v2);
		// TODO Auto-generated constructor stub
	}
	
	public int Add() {
		// TODO Auto-generated method stub
		return value1+value2;
	}

	public boolean All_Even() {
		// TODO Auto-generated method stub
		if((value1+value2)%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
