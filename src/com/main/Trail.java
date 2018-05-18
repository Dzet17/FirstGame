package com.main;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Trail extends GameObject
{
public Trail(int x, int y, ID id) {
	super(x, y, id);
	
}
public void tick()
{
	
}

public void render()
{
	
}
@Override
public void render(Graphics g)
{
	
}

private AlphaComposite makeTransparent(float alpha) 
{
	int type = AlphaComposite.SRC_OVER;
	return(AlphaComposite.getInstance(type, alpha));
}
@Override
public Rectangle getBounds()
{
	return null;	
}
}
