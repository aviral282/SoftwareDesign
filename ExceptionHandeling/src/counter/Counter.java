//package ch1;
package counter;

public class Counter {
	private int value;
	private int limit;
    
	public Counter(int lim){value=0;limit=lim;}

	public void increment() throws TooHighException{
		if (value < limit) {
			this.value++; 
			}
		else { 
			throw new TooHighException("very high number intered");
			}
	}
	public void decrement() throws TooLowException{
		if (value > 0) {
			this.value--; 
			}
		else {
		throw new TooLowException("low number intered");
			}
	}

	public int read_value(){
		return this.value;
	}
}
