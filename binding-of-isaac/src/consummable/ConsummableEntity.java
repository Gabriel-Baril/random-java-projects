package consummable;

import java.awt.Color;
import java.awt.Graphics2D;

import math.Vector2;

public abstract class ConsummableEntity {
	Vector2 pos;
	Vector2 vel = new Vector2(0,0);
	Vector2 acc = new Vector2(0,0);
	int width;
	int height;
	Color color;
	
	public ConsummableEntity(double x,double y,int width,int height,Color color){
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
	
	public void destroy(){
		
	}
	
	public abstract void effect();
}
