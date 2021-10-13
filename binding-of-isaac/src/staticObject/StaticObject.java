package staticObject;

import java.awt.Color;
import java.awt.Graphics2D;

import math.Vector2;

public abstract class StaticObject {
	Vector2 pos;
	int width;
	int height;
	Color color;
	
	public StaticObject(double x,double y,int width,int height,Color color){
		pos = new Vector2(x,y);
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void render(Graphics2D g2d){
		g2d.setColor(color);
		g2d.fillRect((int)pos.x,(int)pos.y, width, height);
	}
	
	public boolean collidePlayer(){
		return false;
	}
}
