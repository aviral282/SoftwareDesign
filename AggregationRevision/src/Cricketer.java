
public class Cricketer {
private int runs;
private Name name;
private String club;
	public Cricketer(String f, String s, String c) {
		// TODO Auto-generated constructor stub
		name = new Name(f, s);
		club=c;
		runs=0;
	}

	public String readFullName() {
		// TODO Auto-generated method stub
		return name.readFirst()+name.readSurname();
	}

	public String readClub() {
		// TODO Auto-generated method stub
		return club.toString();
	}

	public int readRuns() {
		// TODO Auto-generated method stub
		return runs;
	}

	public void addRuns(int r) {
		// TODO Auto-generated method stub
		runs+=r;
		
	}

	public void updateSurname(String text) {
		// TODO Auto-generated method stub
		name.updateSurname(text);
		
	}

	public void updateFullName(String text) {
		// TODO Auto-generated method stub
		
		
	}
	public void printDetails() {
		System.out.println("Cricketer Details");
		System.out.println("------------");
		System.out.println("Name : "+readFullName());
		System.out.println("Club : "+readClub());
		System.out.println("Runs : "+readRuns());
	}

}
