
public class Name {
	String s1,s2;
	public Name(String string, String string2) {
		// TODO Auto-generated constructor stub
		s1 =string;
		s2 = string2;
	}

	public String readFirst() {
		// TODO Auto-generated method stub
		return s1;
	}

	public String readSurname() {
		// TODO Auto-generated method stub
		return s2;
	}

	public void updateFirst(String text) {
		// TODO Auto-generated method stub
		s1 = text;
		
	}

	public void updateSurname(String text) {
		// TODO Auto-generated method stub
		s2 = text;
		
	}

	public void printFullName() {
		// TODO Auto-generated method stub
		System.out.println(s1+" "+s2);
	}

	public void updateFullName(String text) {
		// TODO Auto-generated method stub
		//s1 = text.substring(name.indexof(",")+2);
		//s2 = text.substring(0,name.indexof(","));
		int index = text.indexOf(' ');
		s1 = text.substring(0, index);
		s2 = text.substring(index+1);
	}

}
