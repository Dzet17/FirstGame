package com.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject 
{
	Random r = new Random();
	
	public Player (int x, int y, ID id) {
	super(x, y, id);
	
	volX = r.nextInt(5) + 1;
	volY = r.nextInt(5);
	}

	public void tick()
	{
	x += volX;
	y += volY;
	}

	public void render(Graphics g)
	{
	g.setColor(Color.white);
	g.fillRect(x, y, 32, 32);
	}
}
