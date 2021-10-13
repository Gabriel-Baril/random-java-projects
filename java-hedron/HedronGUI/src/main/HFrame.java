package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class HFrame extends HBoxComponent
{
	public static final String CLASS_NAME = "HFrame";
	public static final String NORMAL_CLASS_NAME = "Frame";
	public static final String NORMAL_UPPER_CLASS_NAME = "FRAME";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_FRAME";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "FRAME";
	private ArrayList<HComponent> subComponents;
	private Color color;
	
	public HFrame(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		this.subComponents = new ArrayList<HComponent>();
		this.setColor(new Color(0, 0, 0));
	}
	
	public HFrame(int x, int y, int width, int height, boolean isDraggable)
	{
		super(x, y, width, height, isDraggable);
		this.subComponents = new ArrayList<HComponent>();
		this.setColor(new Color(0, 0, 0));
	}
	

	public HFrame(int x, int y, int width, int height, ArrayList<HComponent> subComponents)
	{
		super(x, y, width, height);
		this.subComponents = subComponents;
		this.setColor(new Color(0, 0, 0));
	}
	
	
	
	public void render(Graphics2D g2d) {
		g2d.setColor(this.color);
		g2d.fillRect((int)this.componentPos.x, (int)this.componentPos.y, width, height);
		for(HComponent currentSubComponent : this.subComponents)
		{
			currentSubComponent.render(g2d);
		}
	}

	public void update()
	{
		super.update();
		for(HComponent currentSubComponent : this.subComponents)
		{
			currentSubComponent.update();
		}
	}
	
	public boolean addSubComponent(HComponent component)
	{
		return this.subComponents.add(component);
	}
	
	public boolean removeSubComponent(HComponent component)
	{
		return this.subComponents.remove(component);
	}
	
	public String getInfo()
	{
		return getClassName() + this.componentPos;
	}

	public String getClassName() { return CLASS_NAME; }
	public String getNormalClassName() { return NORMAL_CLASS_NAME; }
	public String getNormalUpperClassName() { return NORMAL_UPPER_CLASS_NAME; }
	public String getSnakeUpperClassName() { return SNAKE_UPPER_CLASS_NAME; }
	public String getNormalSnakeUpperClassName() { return NORMAL_SNAKE_UPPER_CLASS_NAME; }
	public String getRecursiveClassName() { return super.getRecursiveClassName() + Printable.RECURSIVE_SEPARATOR + CLASS_NAME; }
	public String getRecursiveNormalClassName() { return super.getRecursiveNormalClassName() + Printable.RECURSIVE_SEPARATOR + NORMAL_CLASS_NAME; }
	public String getRecursiveUpperClassName() { return super.getRecursiveUpperClassName() + Printable.RECURSIVE_SEPARATOR + NORMAL_UPPER_CLASS_NAME; }
	public String getRecursiveSnakeUpperClassName() { return super.getRecursiveSnakeUpperClassName() + Printable.RECURSIVE_SEPARATOR + SNAKE_UPPER_CLASS_NAME; }
	public String getRecursiveNormalSnakeUpperClassName() { return super.getRecursiveNormalSnakeUpperClassName() + Printable.RECURSIVE_SEPARATOR + NORMAL_SNAKE_UPPER_CLASS_NAME; }


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
}
