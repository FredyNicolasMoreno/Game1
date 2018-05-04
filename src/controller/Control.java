package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import dao.Game;
import views.GameGraphics;
import views.MainWindow;

public class Control implements KeyListener{

	private MainWindow mainWindow;
	private GameGraphics gameGraphics;
	private Game game;
	
	public Control() {
		game = new Game();
		mainWindow = new MainWindow(this, game.getEnemy(), game.getPlayer());
//		setEntities();
	}

//	private void setEntities() {
//		gameGraphics.setPlayerRect(game.getPlayer());
//		gameGraphics.setEnemyRect(game.getEnemy());
//	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			moveUp();
			break;
		case KeyEvent.VK_DOWN:
			moveDown();
			break;
		case KeyEvent.VK_LEFT:
			moveLeft();
			break;
		case KeyEvent.VK_RIGHT:
			moveRight();
			break;
			
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void moveUp() {
		game.moveUp();
		mainWindow.rePaint();
	}
	
	public void moveDown() {
		game.moveDown();
		mainWindow.rePaint();
	}

	public void moveRight() {
		game.moveRight();
		mainWindow.rePaint();
	}

	public void moveLeft() {
		game.moveLeft();
		mainWindow.rePaint();
	}
}
