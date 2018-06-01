package com.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject 
{
	Random r = new Random();
	Handler handler;
	
	public Player (int x, int y, ID id, Handler handler) {
	super(x, y, id);
	this.handler = handler;
	
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	public void tick()
	{
	x += volX;
	y += volY;
	
	x = Game.clamp(x, 0, Game.WIDTH - 38);
	y = Game.clamp(y, 0, Game.HEIGHT - 55);
	
	handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.05f, handler));
	
	collision();
	}
	
	private void collision()
	{
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) { //tempObject is now basic enemy
					HUD.HEALTH -= 2;
				}
			}
		}
	}
	
	public void render(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.blue);
		g2d.draw(getBounds());
		
	if(id == ID.Player) g.setColor(Color.white);
	g.fillRect(x, y, 32, 32);
	}
	
	
	
}
