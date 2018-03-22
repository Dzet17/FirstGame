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
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX(int x) {
		return x;
	}
	public int getY(int y) {
		return y;
	}
	public void setId(ID id) {
		this.id = id;
	}
	public void setVolX(int volX) {
		this.volX = volX;
	}
	public void setVolY(int volY) {
		this.volY = volY;
	}
	public int getVolX() {
		return volX;
	}
	public int getVolY() {
		return volY;
	}
}