
public class Die {
public int value;
public Die(int d) {
	value =d;
}
public void roll() {
	double res = Math.random();
	value = (int) (1+(res*1000)%6);
}

public int getValue() {
	return value;
}
}
