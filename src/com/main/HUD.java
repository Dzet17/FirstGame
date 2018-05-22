package com.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD{
	
	public static int HEALTH = 100;
	
	private int greenValue = 255;
	
	public void tick()
	{	
		HEALTH = Game.clamp(HEALTH, 0, 100);
		
	}
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(15, 15, 200, 32);
		g.setColor(Color.white);
		g.fillRect(15, 15, HEALTH * 2, 32);
		g.setColor(Color.green);
		g.fillRect(15, 15, HEALTH * 2, 32);
	}
	
}
