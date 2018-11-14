package q1Counter;

public class MyCounter extends Counter {
	private int upper_limit;
	public MyCounter(int v,int ul) {
		super(v);
		upper_limit = ul;
		// TODO Auto-generated constructor stub
	}

	public int readValue() {
		// TODO Auto-generated method stub
		return super.readValue();
	}

	public int readLimit() {
		// TODO Auto-generated method stub
		return upper_limit;
	}

	public boolean increment() {
		// TODO Auto-generated method st
		{if (value<upper_limit)
		{
			this.value++;
			return true;
		}
            else  return false;
		}
	
	}

	public boolean decrement() {
		// TODO Auto-generated method stub
		return super.decrement();
		//	return false;
	}

}
