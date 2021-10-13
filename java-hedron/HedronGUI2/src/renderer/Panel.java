package renderer;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import components.HWindow;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private Graphics2D g2d;
	private HWindow sourceWindow;
	
	public Panel(HWindow sourceWindow)
	{
		this.sourceWindow = sourceWindow;
	}
	
	public void paintComponent(Graphics g)
	{
		g2d = (Graphics2D)g;
		super.paintComponent(g2d);
		sourceWindow.render();
	}
	
	public Graphics2D getGraphics()
	{
		return g2d;
	}
}
