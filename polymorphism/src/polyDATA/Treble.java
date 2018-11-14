package polyDATA;

public class Treble extends Data {
	int value3;
	public Treble(int v1, int v2,int v3) {
		super(v1, v2);
		value3=v3;
		// TODO Auto-generated constructor stub
	}
	
	public int Add() {
		// TODO Auto-generated method stub
		
		return value1+value2+value3;
	}

	public boolean All_Even() {
		// TODO Auto-generated method stub
		
		if((value1+value2+value3)%2==0) {
		return true;
	}
	else {
		return false;
	}
	}

}
