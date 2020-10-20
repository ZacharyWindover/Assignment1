package Game;

public class Move {
	
	// declare variables
	private String name;
	private String type;
	private int power;
	private float accuracy;
	
	// default constructor
	public Move() {
		name = "Bulbasaur";
		type = "Grass";
		power = 45;
		accuracy = 1.0f;
	}
	
	// constructor
	public Move(String n, String t, int p, float a) {
		name = n;
		type = t;
		power = p;
		accuracy = a;
	}
	
	public String getName() { return name; } // return move name
	//public String getType() { return type; } // return move type // not currently needed
	public int getPower() { return power; } // return move power
	public float getAccuracy() { return accuracy; } // return move accuracy

}
