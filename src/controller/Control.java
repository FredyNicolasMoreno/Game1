package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import dao.Game;
import views.GameGraphics;
import views.MainWindow;

public class Control implements KeyListener{

	private MainWindow mainWindow;
	private GameGraphics gameGraphics;
	private Game game;
	
	public Control() {
		game = new Game(550);
		mainWindow = new MainWindow(this, game.getEnemy(), game.getPlayer(), game.getGun());
		mainWindow.bullets(game.getBullets());
		Timer timer = new Timer(5, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainWindow.setEnemyPosition(game.getEnemy());
				mainWindow.rePaint();
				mainWindow.catched();
			}
		});
		timer.start();
	}

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
		case KeyEvent.VK_SPACE:
			shoot();
			break;
		default:
			break;
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	private void shoot() {
		game.addBullet();
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
