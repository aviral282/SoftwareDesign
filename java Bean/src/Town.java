import java.io.Serializable;

public class Town implements Serializable {
	String name;
	int population;
	
	public Town() {
		name=null;
		population=0;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getPopulation() {
		// TODO Auto-generated method stub
		return ""+ population;
	}

	public void setName(String first) {
		// TODO Auto-generated method stub
		name = first;
	}

	public void setPopulation(int pop) {
		// TODO Auto-generated method stub
		population=pop;
	}
	


}
