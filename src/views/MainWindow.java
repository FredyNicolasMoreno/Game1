package views;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import controller.Control;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private GameGraphics gameGraphics;
	
	public MainWindow(Control control, Rectangle enemy, Rectangle player, Rectangle gun) {
		setTitle("Game 1");
		setIconImage(new ImageIcon("src/img/gamepad.png").getImage());
		addKeyListener(control);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		
		gameGraphics = new GameGraphics(control, enemy, player, gun);
		add(gameGraphics);
		
		
		setVisible(true);
	}
	
	public void rePaint() {
		gameGraphics.repaint();
	}

	public void setEnemyPosition(Rectangle enemy) {
		gameGraphics.setEnemyPOsition(enemy);
	}
	
	public void catched() {
		gameGraphics.gameOver();
	}
	
	public void bullets(ArrayList<Rectangle> bullets) {
		gameGraphics.setBullets(bullets);
	}
	
}
