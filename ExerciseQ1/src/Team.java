
public class Team {

	
	private Counter games_played;
	private Counter points;
	private String team_name;
	
	Team(String n,int gp ,int pt){
		team_name = n;
		games_played = new Counter(gp);
		points = new Counter(pt);
		
	}

	public int readPlayed() {
		// TODO Auto-generated method stub
		
		return games_played.read_value();
	}

	public int readPoints() {
		// TODO Auto-generated method stub
		
		return points.read_value();
	}

	public void win() {
		// TODO Auto-generated method stub
		points.increment();
		points.increment();
		points.increment();
		games_played.increment();
		
	}

	public void draw() {
		// TODO Auto-generated method stub
		points.increment();
		points.increment();
		games_played.increment();
	}

	public void loss() {
		// TODO Auto-generated method stub
		games_played.increment();
	}

	public void print_details() {
		// TODO Auto-generated method stub
		this.toString();
		
	}

	public void reset() {
		this.games_played = new Counter();
		this.points = new Counter();
		// TODO Auto-generated method stub+
		
		
		
	}
}
