package printShape;

public class Rectangle extends Shape {
int height;
	public Rectangle(int l,int h) {
		super(l);
		height = h;
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		for(int k=0;k<height;k++) {
			for(int i=0;i<length;i++) {
				System.out.print("*");
			}
			System.out.println();
			//System.out.print();
		}
}
}
