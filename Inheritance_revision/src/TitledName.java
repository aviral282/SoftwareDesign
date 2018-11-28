
public class TitledName extends Name{
	private String title;
	public TitledName(String t, String f, String s) {
		// TODO Auto-generated constructor stub
		super(f,s);
		title=t;
		
	}

	public String readFullName() {
		// TODO Auto-generated method stub
		return title+" "+super.readFirst()+" "+super.readSurname();
	}

	public String readTitle(String text) {
		// TODO Auto-generated method stub
		return title;
	}

	public void updateTitle(String text) {
		// TODO Auto-generated method stub
		title = text;
	}
	
	public void printFullName() {
		// TODO Auto-generated method stub
		System.out.println("Name = "+title +" "+super.readFirst()+" "+super.readSurname());
		
	}
}
