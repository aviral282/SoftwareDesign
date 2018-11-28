
abstract class  Base{
    abstract public void f1();
           //     {    System.out.println("f1 base");    	}	
    public void f2()
                {System.out.println("f2 base");}
}

class Derv1 extends Base{  	
       public void f1()
                   {System.out.println("f1 derv1");}	
       public void f2()
                   {System.out.println("f2 derv1");}
}
class Derv2 extends Base{  	
       public void f1()
                   {System.out.println("f1 derv2");}	
       public void f2()
                   {System.out.println("f2 derv2");}
}
class Derv3 extends Base{  	
       public void f1()
                   {System.out.println("f1 derv3");}	
       public void f2()
                   {System.out.println("f2 derv3");}
}
public class Ex2{

public static void main(String[] args){
		Base[] b=new Base[3];

		//b[0]=new Base();
		b[0]=new Derv1();
		b[1]=new Derv2();
        b[2]=new Derv3();
		for(int i=0;i<3;i++)
		            b[i].f1();
	     }
}