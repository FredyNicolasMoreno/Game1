package dao;

import java.awt.Rectangle;


public class Game {

	private Rectangle enemy;
	private Rectangle player;
	
	public Game() {
		player = new Rectangle(150, 150, 50, 50);
		enemy = new Rectangle(500, 500, 150, 150);
	}
	
	public void moveLeft() {
		player.setLocation(player.x - 80, player.y);
	}
	public void moveRight() {
		player.setLocation(player.x + 80, player.y);
	}
	public void moveUp() {
		player.setLocation(player.x, player.y - 80);
	}
	public void moveDown() {
		player.setLocation(player.x, player.y + 80);
	}

	public Rectangle getEnemy() {
		return enemy;
	}

	public Rectangle getPlayer() {
		return player;
	}

	
	
}
