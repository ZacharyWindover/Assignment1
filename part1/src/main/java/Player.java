package Game;

import java.util.Random;

public class Player {
	
	// declare variables
	public Monster monster;
	
	public Monster getMonster() { return monster; }
	
	// checks if player has lost
	public boolean hasLost() {
		if (monster.getHP() <= 0) { return true; } // returns true if player monster health is less than or equal to 0
		else { return false; } // returns false otherwise
	}
	
	// checks if human player monster is faster than cpu player monster
	public boolean isFasterThan(CPUPlayer enemy) {
		if (getMonster().getSpeed() >= enemy.getMonster().getSpeed()) { return true; } // returns true if human monster is faster than or same speed as cpu monster
		else { return false; } // returns false otherwise
	}
	
	public boolean doesHit(Move move) {
		Random randFloat = new Random();
		float critHit = randFloat.nextFloat();
		
		if (move.getAccuracy() >= critHit) { return true; }
		else { return false; }
	}
	
	public int getDamage(int defense, int power, int attack) {
		int damage = power + attack - defense;
		return damage;
	}

}
