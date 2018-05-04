package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Control;

public class GameGraphics extends JPanel{

	private static final long serialVersionUID = 1L;

	private Rectangle enemyRect, playerRect;
	
	public GameGraphics(Control control, Rectangle enemy, Rectangle player) {
		this.enemyRect = enemy;
		this.playerRect = player;
		this.addKeyListener(control);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		paintPlayer(g);
		paintEnemy(g);
	}
	
	public void paintPlayer(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(playerRect.x, playerRect.y, playerRect.width, playerRect.height);
	}
	
	public void paintEnemy(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(enemyRect.x, enemyRect.y, enemyRect.width, enemyRect.height);
	}
	
	protected void gameOver() {
		if(playerRect.intersects(enemyRect)) {
			JOptionPane.showMessageDialog(this, "FIN DEL JUEGO");
			System.exit(0);
		}
	}
	
//	public void setPlayerRect(Rectangle player) {
//		this.playerRect = player;
//	}
//	
//	public void setEnemyRect(Rectangle enemy) {
//		this.enemyRect = enemy;
//	}
	
}
