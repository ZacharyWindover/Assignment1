package Game;

import java.util.Random;

public class CPUPlayer extends Player {

	// default constructor
	public CPUPlayer() { monster = new Monster(); }
	
	// constructor
	public CPUPlayer (Monster m) { monster = m; }
	
	// cpu chooses move
	public Move chooseMove() {
		Random randMove = new Random();
		int selectedMove = randMove.nextInt(4);
		
		Move move;
		
		if (selectedMove == 1) { move = monster.getMove(1); }
		else if (selectedMove == 2) { move = monster.getMove(2); }
		else if (selectedMove == 3) { move = monster.getMove(3); }
		else { move = monster.getMove(4); }
		
		return move;
	}
	
	// cpu attack sequence
	public void attack(HumanPlayer human, Move enemyMove) {
		if (doesHit(enemyMove)) {
			int damage = getDamage(human.getMonster().getDefense(), enemyMove.getPower(), super.getMonster().getAttack());
			human.getMonster().dealDamage(damage);
			
			System.out.printf("%s used %s!\n", monster.getName(), enemyMove.getName());
			System.out.printf("%s did %s damage to %s!\n", monster.getName(), damage, human.getMonster().getName());
		}
		
		else { 
			System.out.printf("%s used %s!\n", monster.getName(), enemyMove.getName());
			System.out.printf("%s missed!\n\n", monster.getName()); 
			}
	}

}
