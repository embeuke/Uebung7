package h3;

public class Mensch {
	

	public String name = "Emma";
	public int gebJahr = 2006;
	public int alter = 19;
	
	public void setName (String newName) {
		name = newName;
	}
	
	public void setGebJahr (int newGebJahr) {
		gebJahr = newGebJahr;
	}
	
	public void setAlter () {
		alter = 2025 - gebJahr;
	}
	
	public String getName () {
		return name;	
	}
	
	public int getGebJahr () {
		return gebJahr;
		
	}
	
	public int getAlter () {
		return alter;
		
	}
	
}
