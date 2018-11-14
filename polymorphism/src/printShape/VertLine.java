package printShape;

public class VertLine extends Shape {

	public VertLine(int l) {
		super(l);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		for(int i=0;i<length;i++) {
			System.out.println("* ");
			
		}
}
}
