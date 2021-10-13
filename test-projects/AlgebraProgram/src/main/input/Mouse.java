package main.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.event.MouseInputListener;

import utilities.math.Vec2;

public class Mouse implements MouseListener, MouseMotionListener{
	private static Mouse instance;
	public static Vec2 current_pos;
	public static Vec2 prev_pos;
	public boolean isDragging;
	public boolean isMoving;
	
	private Mouse()
	{
		Mouse.current_pos = new Vec2(0,0);
		Mouse.prev_pos = new Vec2(0,0);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("WTF");
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		if(this.isDragging) this.isDragging = false;
		Mouse.prev_pos.x = Mouse.current_pos.x;
		Mouse.prev_pos.y = Mouse.current_pos.y;
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		if(!this.isDragging) this.isDragging = true;
		current_pos.x = e.getX();
		current_pos.y = e.getY();
		
		if(Math.sqrt( (Mouse.prev_pos.x - Mouse.current_pos.x)*(Mouse.prev_pos.x - Mouse.current_pos.x) + (Mouse.prev_pos.y - Mouse.current_pos.y)*(Mouse.prev_pos.y - Mouse.current_pos.y) ) > 10)
		{
			Mouse.prev_pos.x = Mouse.current_pos.x;
			Mouse.prev_pos.y = Mouse.current_pos.y;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		this.isMoving = true;
	}
	
	public static Vec2 getCurrentPos()
	{
		return Mouse.current_pos;
	}
	
	public static Vec2 getPreviousPos()
	{
		return Mouse.prev_pos;
	}
	
	public static Mouse getInstance()
	{
		if(Mouse.instance == null) 
			Mouse.instance = new Mouse();
		return Mouse.instance;
	}
}
