package printShape;

public class HorzLine extends Shape {

	public HorzLine(int l) {
		super(l);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		for(int i=0;i<length;i++) {
			System.out.print("* ");
			//System.out.print();
		}
}
}
