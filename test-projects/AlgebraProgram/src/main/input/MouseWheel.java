package main.input;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import main.rendering.Graph;

public class MouseWheel implements MouseWheelListener
{
	private static MouseWheel instance;
	
	public void mouseWheelMoved(MouseWheelEvent e)
	{
		if(e.getWheelRotation() == -1)
			Graph.zoom -= Graph.zoom/10;
		else if(e.getWheelRotation() == 1)
			Graph.zoom += Graph.zoom/10;
	}
	
	public static MouseWheel getInstance()
	{
		if(MouseWheel.instance == null)
			MouseWheel.instance = new MouseWheel();
		return MouseWheel.instance;
	}
}
