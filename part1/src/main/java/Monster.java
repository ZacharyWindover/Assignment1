package Game;

public class Monster {
	
	// declare variables
	private String name;
	private String type;
	private int hp;
	private int speed;
	private int attack;
	private int defense;
	private Move move1;
	private Move move2;
	private Move move3;
	private Move move4;
	
	public Monster() {
		name = "Piplip";
		type = "Water";
		hp = 250;
		speed = 45;
		attack = 50;
		defense = 50;
		move1 = new Move();
		move2 = new Move();
		move3 = new Move();
		move4 = new Move();
	}
	
	public Monster(String n, String t, int h, int s, int a, int d, Move m1, Move m2, Move m3, Move m4) {
		name = n;
		type = t;
		hp = h;
		speed = s;
		attack = a;
		defense = d;
		move1 = m1;
		move2 = m2;
		move3 = m3;
		move4 = m4;
	}
	
	public String getName() { return name; } // return monster name
	//public String getType() { return type; } // return monster type // no current use
	public int getHP() { return hp;	} // return monster hp
	public int getSpeed() { return speed; } // return monster speed
	public int getAttack() { return attack; } // return monster attack
	public int getDefense() { return defense; } // return monster defense
	
	public String getMoveName(int moveNo) {
		if (moveNo == 1) { return move1.getName(); }
		else if (moveNo == 2) { return move2.getName(); }
		else if (moveNo == 3) { return move3.getName(); }
		else { return move4.getName(); }
	}
	
	public Move getMove(int moveNo) { 
		if (moveNo == 1) { return move1; }
		else if (moveNo == 2) { return move2; }
		else if (moveNo == 3) { return move3; }
		else { return move4; }
	}
	
	public void dealDamage(int dmg) {
		hp = hp - dmg;
	}

}
