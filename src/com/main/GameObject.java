package com.main;

import java.awt.Graphics;

public abstract class GameObject
{
	protected int x, y;
	protected ID id;
	protected int volX, volY;

	public GameObject(int x, int y, ID id) {
	this.x = x;
	this.y = y;
	this.id = id;
	}
	public abstract void tick();
	public abstract void render(Graphics g);
}
