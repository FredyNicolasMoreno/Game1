package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Control;

public class GameGraphics extends JPanel{

	private static final long serialVersionUID = 1L;

	private Rectangle enemyRect, playerRect, gunRect, bulletRect;
	private ArrayList<Rectangle> bullets;
	
	public GameGraphics(Control control, Rectangle enemy, Rectangle player, Rectangle gun) {
		this.enemyRect = enemy;
		this.playerRect = player;
		this.gunRect = gun;
		this.bulletRect = bulletRect;
		this.addKeyListener(control);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		paintPlayer(g);
		paintEnemy(g);
		paintBullet(g);
	}
	
	public void paintPlayer(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(playerRect.x, playerRect.y, playerRect.width, playerRect.height);
		g.setColor(Color.GRAY);
		g.fillRect(gunRect.x, gunRect.y, gunRect.width, gunRect.height);
	}
	
	public void paintEnemy(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(enemyRect.x, enemyRect.y, enemyRect.width, enemyRect.height);
	}
	
	public void paintBullet(Graphics g) {
		for (int i = 0; i < bullets.size(); i++) {
			g.setColor(Color.BLACK);
			g.fillRect(bullets.get(i).x, bullets.get(i).y, bullets.get(i).width, bullets.get(i).height);
		}
	}
	
	protected void gameOver() {
		if(playerRect.intersects(enemyRect)) {
			JOptionPane.showMessageDialog(this, "FIN DEL JUEGO");
			System.exit(0);
		}
	}

	public void setEnemyPOsition(Rectangle enemy) {
		enemyRect.setLocation(enemy.x, enemy.y);
	}
	
	public void setBulletPosition(Rectangle bullet) {
		bulletRect.setLocation(bullet.x, bullet.y);
	}
	
	public void setBullets(ArrayList<Rectangle> bullets) {
		this.bullets = bullets;
	}
	
}
