package dao;

import java.awt.Rectangle;
import java.util.ArrayList;

import model.GameThread;


public class Game extends GameThread{

	private Rectangle enemy;
	private Rectangle player;
	private Rectangle gun;
	private ArrayList<Rectangle> bullets;
	
	public Game(int sleep) {
		super(sleep);
		player = new Rectangle(150, 150, 50, 50);
		enemy = new Rectangle(500, 500, 150, 150);
		gun = new Rectangle(player.x + 25, player.y + 25, 10, 10);
		bullets = new ArrayList<Rectangle>();
		start();
	}

	
	
	@Override
	public void executeTask() {
//		chasePlayer();
		moveShoot();
	}
	
	
	public void moveLeft() {
		player.setLocation(player.x - 80, player.y);
		gun.setLocation(player.x - 10, player.y);
	}
	public void moveRight() {
		player.setLocation(player.x + 80, player.y);
		gun.setLocation(player.x + 50, player.y);
	}
	public void moveUp() {
		player.setLocation(player.x, player.y - 60);
		gun.setLocation(player.x, player.y - 10);
	}
	public void moveDown() {
		player.setLocation(player.x, player.y + 60);
		gun.setLocation(player.x, player.y + 50);
	}

	public Rectangle getEnemy() {
		return enemy;
	}

	public Rectangle getPlayer() {
		return player;
	}

	public Rectangle getGun() {
		return gun;
	}


	public ArrayList<Rectangle> getBullets() {
		return bullets;
	}

	public void chasePlayer() {
		if(enemy.x < player.x) {
			enemy.setLocation(enemy.x + 80, enemy.y);
		}
		if(enemy.x > player.x) {
			enemy.setLocation(enemy.x - 80, enemy.y);
		}
		if(enemy.y < player.y) {
			enemy.setLocation(enemy.x, enemy.y + 80);
		}
		if(enemy.y > player.y) {
			enemy.setLocation(enemy.x, enemy.y - 80);
		}
	}

	public void moveShoot() {
		for (Rectangle rectangle : bullets) {
			rectangle.setLocation(rectangle.x + 15, rectangle.y);
		}
	}
	
	public void addBullet() {
		bullets.add(new Rectangle(gun.x, gun.y, gun.width, gun.height));
	}
	
	public void setBullets(ArrayList<Rectangle> bullets) {
		this.bullets = bullets;
	}
	
}
