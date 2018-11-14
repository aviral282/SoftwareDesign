package printShape;

public class DiagonalLine extends Shape {

	public DiagonalLine(int l) {
		super(l);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		for(int i=0;i<length;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");}
			
				System.out.println("*");
			}
		}
	}


