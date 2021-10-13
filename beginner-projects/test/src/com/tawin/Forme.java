package com.tawin;

public abstract class Forme implements Movable{
	private int x;
	private int y;
	
	public abstract void getInformation();
	
	public Forme(int x,int y){
		this.setX(x);
		this.setY(y);
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
	
}
