package printShape;
        class Shape{
            protected int length;
            public Shape(int l){length=l;}
            public void draw(){}
        }	


            

public class DrawTest {
	public static void main(String[] args)
	{
	     Shape []s=new Shape [5];
         s[0]=new VertLine(5);
         s[1]=new HorzLine(6);  
         s[2]=new DiagonalLine(6); 
         s[3]=new Rectangle(12,4); 
         s[4]=new Square(4); 
 
         for(int j=0;j<5;j++)
         {
                System.out.println("\n\n");
                s[j].draw();
           }
}    }
