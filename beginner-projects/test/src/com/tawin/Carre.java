package com.tawin;

public class Carre extends Forme{
	private int w;
	private int h;
	
	public Carre(int x,int y,int w,int h){
		super(x,y);
		this.setW(w);
		this.setH(h);
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void move(int x,int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
	}

	public void translateX(int x) {
		this.setX(this.getX() + x);
	}

	public void translateY(int y) {
		this.setY(this.getY() + y);
	}

	public void goTo(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void getInformation() {
		System.out.println("Cette instance vient de la classe " + this.getClass().getSimpleName() + " et sa classe mere est " + this.getClass().getSuperclass().getSimpleName());
	}
}
