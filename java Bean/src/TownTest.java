import java.io.*;
import java.util.Scanner;

public class TownTest {

	public static void main(String[] args) {
		Town t=new Town();
		Scanner sc = new Scanner(System.in);
		
		try{
			ObjectInputStream in=new ObjectInputStream(                              
	                      new FileInputStream("test1.dat"));
			t=(Town)in.readObject();
			in.close();}
			catch(Exception e){}
			
			System.out.println("Initial Town Details");
			System.out.println("=======================");
			System.out.println("Name:      "+t.getName());
			System.out.println("Population:"+t.getPopulation());
			System.out.println();
			
			System.out.println("Enter new details");
			System.out.print("Enter Name:");
			String first=sc.next();
			
			t.setName(first);
			System.out.print("Enter Population-->");
			int pop=sc.nextInt();
			t.setPopulation(pop);
			
			System.out.println("Updated Town Details");
			System.out.println("=======================");
			System.out.println("Name:      "+t.getName());
			System.out.println("Population:"+t.getPopulation());
			System.out.println();
			
			try{
				ObjectOutputStream out=new ObjectOutputStream(
						  new FileOutputStream("test1.dat"));
				out.writeObject(t);
			    	out.close();}
				catch(Exception e){}
	}




}
/*
 * try{
		ObjectInputStream in=new ObjectInputStream(                              
                      new FileInputStream("test1.dat"));
		t=(Town)in.readObject();
		in.close();}
		catch(Exception e){}
		
		System.out.println("Initial Town Details");
		System.out.println("=======================");
		System.out.println("Name:      "+t.getName());
		System.out.println("Population:"+t.getPopulation());
		System.out.println();
		
		System.out.println("Enter new details");
		System.out.print("Enter Name:");
		String first=sc.next();
		
		t.setName(first);
		System.out.print("Enter Population-->");
		int pop=sc.nextInt();
		t.setPopulation(pop);
		
		System.out.println("Updated Town Details");
		System.out.println("=======================");
		System.out.println("Name:      "+t.getName());
		System.out.println("Population:"+t.getPopulation());
		System.out.println();
		
		try{
			ObjectOutputStream out=new ObjectOutputStream(
					  new FileOutputStream("test1.dat"));
			out.writeObject(t);
		    	out.close();}
			catch(Exception e){}
 * */
 