package main;

import java.awt.Graphics2D;

public abstract class HLabel extends HBoxComponent
{
	public static final String CLASS_NAME = "HLabel";
	public static final String NORMAL_CLASS_NAME = "Label";
	public static final String NORMAL_UPPER_CLASS_NAME = "LABEL";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_LABEL";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "LABEL";
	
	
	public HLabel(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	

	public abstract void render(Graphics2D g2d);
	public void update()
	{
		super.update();
	}
	
	public String getInfo() {return "BOX_COMPONENT_INFO"; }
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

}
