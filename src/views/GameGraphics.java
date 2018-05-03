package views;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

import model.Enemy;

public class GameGraphics extends JPanel{

	private static final long serialVersionUID = 1L;

	private Rectangle rect;
	private Enemy enemy;
	
	public GameGraphics() {
		rect = new Rectangle(150, 150, 80, 80);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(rect.x,rect.y,rect.width,rect.height);
	}
	
	public void moveRight(Graphics g) {
		rect.setLocation(enemy.getX() + 80, enemy.getY());
	}

	public void moveLeft(Graphics g) {
		rect.setLocation(enemy.getX() - 80, enemy.getY());
	}
	
	public void moveUp(Graphics g) {
		rect.setLocation(enemy.getX(), enemy.getY() - 80);
	}
	
	public void moveDown(Graphics g) {
		rect.setLocation(enemy.getX() + 80, enemy.getY() + 80);
	}
	
}
