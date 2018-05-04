package views;

import java.awt.Rectangle;

import javax.swing.JFrame;

import controller.Control;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private GameGraphics gameGraphics;
	
	public MainWindow(Control control, Rectangle enemy, Rectangle player) {
		setTitle("Game 1");
		addKeyListener(control);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		
		gameGraphics = new GameGraphics(control, enemy, player);
		add(gameGraphics);
		
		
		setVisible(true);
	}
	
	public void rePaint() {
		gameGraphics.repaint();
	}
	
}
