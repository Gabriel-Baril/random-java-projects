package com.tawin;

public class Carre {
	private int x;
	private int y;
	private int w;
	private int h;
	
	public Carre(int x,int y,int w,int h) throws IllegalDimensionException{
			if(w < 0 || h < 0)
				throw new IllegalDimensionException();
			else
			{
				this.setX(x);
				this.setY(y);
				this.setW(w);
				this.setH(h);
			}
	
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getW() {
		return w;
	}
	
	public void setW(int w) {
		this.w = w;
	}
	
	public int getH() {
		return h;
	}
	
	public void setH(int h) {
		this.h = h;
	}
}
