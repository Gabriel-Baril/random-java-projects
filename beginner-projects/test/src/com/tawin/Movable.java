package com.tawin;

public interface Movable {
	public void translateX(int x);
	public void translateY(int y);
	public void move(int x,int y);
	public void goTo(int x,int y);
}
