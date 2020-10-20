package Game;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	// default constructor
	HumanPlayer() { monster = new Monster(); }
	
	// constructor
	HumanPlayer(Monster m) { monster = m; }
	
	public void printMoves() {
		System.out.printf("   > 1. %s\n", monster.getMoveName(1));
		System.out.printf("   > 2. %s\n", monster.getMoveName(2));
		System.out.printf("   > 3. %s\n", monster.getMoveName(3));
		System.out.printf("   > 4. %s\n", monster.getMoveName(4));
	}
	
	public Move chooseMove() {
		
		Scanner moveInput = new Scanner(System.in);
		int selectedMove;
		
		System.out.printf("Choose a move for %s to use!\n", monster.getName());
		printMoves();
		
		selectedMove = moveInput.nextInt();
		
		while ((selectedMove < 1) || (selectedMove > 4)) {
			System.out.println("Please input a valid move (1-4).");
			printMoves();
			selectedMove = moveInput.nextInt();
		}
		
		Move move = new Move();
		
		if (selectedMove == 1) { move = monster.getMove(1); }
		else if (selectedMove == 2) { move = monster.getMove(2); }
		else if (selectedMove == 3) { move = monster.getMove(3); }
		else { move = monster.getMove(4); }
		
		return move;
		
	}	   
	
	public void attack(CPUPlayer enemy, Move playerMove) {
		if (doesHit(playerMove)) {
			int damage = getDamage(enemy.getMonster().getDefense(), playerMove.getPower(), super.getMonster().getAttack());
			enemy.getMonster().dealDamage(damage);
			
			System.out.printf("%s used %s!\n", monster.getName(), playerMove.getName());
			System.out.printf("%s did %s damage to %s!\n\n", monster.getName(), damage, enemy.getMonster().getName());
		}
		
		// prints if move misses
		else { 
			System.out.printf("%s used %s!\n", monster.getName(), playerMove.getName());
			System.out.printf("%s missed!\n\n", monster.getName()); 
			} 
	}

	
}
