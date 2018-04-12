package com.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject 
{
	Random r = new Random();
	
	public Player (int x, int y, ID id) {
	super(x, y, id);
	

	}

	public void tick()
	{
	x += volX;
	y += volY;
	
	x = Game.clamp(x, 0, Game.WIDTH - 38);
	y = Game.clamp(y, 0, Game.HEIGHT - 55);
	}

	public void render(Graphics g)
	{
	if(id == ID.Player) g.setColor(Color.white);
	g.fillRect(x, y, 32, 32);
	}
	
	
	
}
