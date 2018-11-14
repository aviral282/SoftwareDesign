package printShape;

public class Square extends Shape{

	public Square(int l) {
		super(l);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		for(int k=0;k<length;k++) {
			for(int i=0;i<length;i++) {
				System.out.print("*");
			}
			System.out.println();
			//System.out.print();
		}
}
}
