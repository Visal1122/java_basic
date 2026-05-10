package com.visal.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	
	public static void main(String[] args) {
//		ZombieGame game = new ZombieGame();
//		MarioGame game = new MarioGame();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		GameRunner gameRunner = context.getBean(GameRunner.class);
//		GameRunner gameRunner = new GameRunner(game);
		
		gameRunner.moveUp();
		gameRunner.moveDown();
	}
}
