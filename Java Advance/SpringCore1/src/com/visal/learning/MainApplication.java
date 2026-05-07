package com.visal.learning;

public class MainApplication {

	
	public static void main(String[] args) {
		ZombieGame game = new ZombieGame();
//		MarioGame game = new MarioGame();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.moveUp();
		gameRunner.moveDown();
	}
}
