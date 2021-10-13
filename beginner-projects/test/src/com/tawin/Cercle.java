package com.tawin;

public class Cercle extends Forme{
	private int r;
	
	Cercle(int x,int y,int r){
		super(x,y);
		this.setR(r);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
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
	
	public void getInformation(){
		System.out.println("Cette instance vient de la classe " + this.getClass().getSimpleName() + " et sa classe mere est " + this.getClass().getSuperclass().getSimpleName());
	}
}
