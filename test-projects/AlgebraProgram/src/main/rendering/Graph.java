package main.rendering;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import function.Function;
import function.FunctionPlot;
import main.input.Mouse;
import main.window.Window;
import utilities.math.Vec2;

public class Graph
{
	private static Graph instance;
	public static double zoom = 1;
	public static Vec2 center = new Vec2(Window.WIDTH/2,Window.HEIGHT/2);
	
	
	public static int getTransformedData(double number,double center)
	{
		return (int)(number/zoom) + (int)center;
	}
	
	public void renderCursor(int thickness,boolean drawCoord,Font font,Color color)
	{
		if(Mouse.getInstance().isDragging)
		{	
			Graphics2D g2d = Panneau.getInstance().getG2D();
			g2d.drawLine((int)Mouse.current_pos.x - 3, 0, (int)Mouse.current_pos.x - 3, Window.HEIGHT);
			g2d.drawLine(0, (int)Mouse.current_pos.y - 27, Window.WIDTH, (int)Mouse.current_pos.y - 27);
		}
	}
	
	public void renderLine(double x1,double y1,double x2,double y2,int thickness,boolean drawCoord,Font font,Color color)
	{
		int tx1 = getTransformedData(x1,center.x);
		int ty1 = getTransformedData(y1,center.y);
		int tx2 = getTransformedData(x2,center.x);
		int ty2 = getTransformedData(y2,center.y);
		
		if(tx1 < Window.WIDTH + thickness/2 && tx1 > -thickness/2 && ty1 < Window.HEIGHT + thickness/2 && ty1 > -thickness/2 &&
		   tx2 < Window.WIDTH + thickness/2 && tx2 > -thickness/2 && ty2 < Window.HEIGHT + thickness/2 && ty2 > -thickness/2 )
		{
			Graphics2D g2d = Panneau.getInstance().getG2D();
			g2d.setColor(color);
			g2d.setFont(font);
			g2d.drawLine(tx1, ty1, tx2, ty2);
		}
	}
	
	public void renderPoint(double x,double y,int thickness,boolean drawCoord,Font font,Color color)
	{
		int tx = getTransformedData(x,center.x);
		int ty = getTransformedData(-y,center.y);
		if(tx < Window.WIDTH + thickness/2 && tx > -thickness/2 && ty < Window.HEIGHT + thickness/2 && ty > -thickness/2)
		{
			Graphics2D g2d = Panneau.getInstance().getG2D();
			g2d.setColor(color);
			g2d.setFont(font);
			g2d.fillOval(tx, ty, thickness, thickness);
			if(drawCoord) g2d.drawString("(" + (int)x + "," + (int)y + ")", tx + 5, ty + 4);
		}
	}
	
	public void graphFunction(FunctionPlot function)
	{
		Graphics2D g2d = Panneau.getInstance().getG2D();
		Vec2 current = new Vec2(0,0);
		Vec2 previous = new Vec2(0,0);
		for(double i = -Window.WIDTH/2 - center.x;i < Window.WIDTH - center.x;i++)
		{
			current.x = i + center.x;
			current.y = -function.y(i*zoom)/zoom + center.y;
			//if(current.y <= Window.HEIGHT/2 && current.y >= -Window.HEIGHT/2)
			g2d.fillOval((int)current.x, (int)current.y, 1, 1);
			if(i != -Window.WIDTH/2)
			{
				g2d.drawLine((int)previous.x, (int)previous.y,(int)current.x, (int)current.y);
			}
			
			previous.x = current.x;
			previous.y = current.y;
		}
	}
	
	public void renderUnity(int spacing)
	{
		Graphics2D g2d = Panneau.getInstance().getG2D();
		Font font = new Font("Arial",10,9);
		g2d.setFont(font);
		for(int i = 0;i < Window.WIDTH/spacing;i++)
		{
			g2d.drawLine(i*spacing, (int)center.y,i*spacing, (int)center.y + 4);
			g2d.drawString(String.format("%.1f",(i*spacing - center.x) * zoom), i*spacing - 5, (int)center.y + 12);
		}
		for(int i = 0;i < Window.HEIGHT/spacing;i++)
		{
			g2d.drawLine((int)center.x,i*spacing,(int)center.x - 4,i*spacing);
			g2d.drawString(String.format("%.1f",( (center.y - i*spacing) * zoom)), (int)center.x - 25, i*spacing + 4);
		}
	}

	public void renderAxis()
	{
		center.y -= (Mouse.getCurrentPos().y - Mouse.getPreviousPos().y);
		center.x -= (Mouse.getCurrentPos().x - Mouse.getPreviousPos().x);
		Panneau.getInstance().getG2D().drawLine(0, (int)center.y, Window.WIDTH, (int)center.y);
		Panneau.getInstance().getG2D().drawLine((int)center.x, 0, (int)center.x, Window.HEIGHT);
	}
	
	public static Graph getInstance()
	{
		if(Graph.instance == null)
			Graph.instance = new Graph();
		return Graph.instance;
	}
}
