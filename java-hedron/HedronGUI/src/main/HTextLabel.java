package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class HTextLabel extends HLabel
{
	public static final String CLASS_NAME = "HTextLabel";
	public static final String NORMAL_CLASS_NAME = "TextLabel";
	public static final String NORMAL_UPPER_CLASS_NAME = "TEXTLABEL";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_TEXT_LABEL";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "TEXT_LABEL";
	
	private String text;
	
	public HTextLabel(String text, int x, int y, int width, int height) {
		super(x, y, width, height);
		this.text = text;
	}
	
	public HTextLabel(String text, int x, int y, int width, int height, boolean isDraggable) {
		this(text, x, y, width, height);
		this.isDraggable = isDraggable;
	}
	
	public void render(Graphics2D g2d)
	{
		g2d.setColor(new Color(0,0,0)); // border color
		g2d.drawLine((int)this.componentPos.x, (int)this.componentPos.y, (int)this.componentPos.x + this.width, (int)this.componentPos.y);
		g2d.drawLine((int)this.componentPos.x, (int)this.componentPos.y, (int)this.componentPos.x, (int)this.componentPos.y + this.height);
		g2d.drawLine((int)this.componentPos.x, (int)this.componentPos.y + this.height, (int)this.componentPos.x + this.width, (int)this.componentPos.y + this.height);
		g2d.drawLine((int)this.componentPos.x + this.width, (int)this.componentPos.y, (int)this.componentPos.x + this.width, (int)this.componentPos.y + this.height);
		g2d.setColor(new Color(0,0,0)); // text color
		g2d.drawString(this.text, (int)this.componentPos.x + 2, (int)this.componentPos.y + this.height/2 + 5);
	}

	// TODO: Refactor update
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
