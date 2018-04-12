package com.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	
	public KeyInput(Handler handler)
	{
		this.handler = handler;
	}
	public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
	
	for(int i = 0; i < handler.object.size(); i++) {
		GameObject tempObject = handler.object.get(i);
		
		if(tempObject.getId() == ID.Player) {
			//key events for player 1
			
			if(key == KeyEvent.VK_W) tempObject.setVolY(-5);
			if(key == KeyEvent.VK_S) tempObject.setVolY(5);
			if(key == KeyEvent.VK_D) tempObject.setVolX(5);
			if(key == KeyEvent.VK_A) tempObject.setVolX(-5);
		}
	}
}

public void keyReleased(KeyEvent e) {
	int key = e.getKeyCode();
	for(int i = 0; i < handler.object.size(); i++) {
		GameObject tempObject = handler.object.get(i);
		
		if(tempObject.getId() == ID.Player) {
			//key events for player 1
			
			if(key == KeyEvent.VK_W) tempObject.setVolY(0);
			if(key == KeyEvent.VK_S) tempObject.setVolY(0);
			if(key == KeyEvent.VK_D) tempObject.setVolX(0);
			if(key == KeyEvent.VK_A) tempObject.setVolX(0);
		}
	}
	
	if(key == KeyEvent.VK_ESCAPE) System.exit(1);
	
	}
}
