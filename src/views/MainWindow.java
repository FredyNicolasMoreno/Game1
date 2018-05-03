package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private GameGraphics gameGraphics;
	
	public MainWindow() {
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gameGraphics = new GameGraphics();
		add(gameGraphics);
		
		
		setVisible(true);
	}
	
}
