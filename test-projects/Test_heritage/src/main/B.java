package main;

public class B {
	private int x,y;
	
	public B(int x,int y){
		this.x = x;
		this.y = y;
	}

	public void parler(){
		System.out.println("Generic process : (x: " + x + ",y: " + y + ")");
	}
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
}
