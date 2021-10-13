package main;

public class Point<T extends Number> {
	T x;
	T y;
	
	public Point(T x,T y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(T x){this.x = x;}
	public void setY(T y){this.y = y;}
	public T getX(){return this.x;}
	public T getY(){return this.y;}
}
