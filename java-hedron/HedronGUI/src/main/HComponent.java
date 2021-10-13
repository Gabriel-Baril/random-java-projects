package main;

import java.awt.Graphics2D;
import java.util.ArrayList;

public abstract class HComponent extends HWidget
{
	public static final String CLASS_NAME = "HComponent";
	public static final String NORMAL_CLASS_NAME = "Component";
	public static final String NORMAL_UPPER_CLASS_NAME = "COMPONENT";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_COMPONENT";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "COMPONENT";
	
	protected HWindow sourceWindow;
	protected Vec2 componentPos;
	protected HComponent parentComponent;
	
	public HComponent(int x, int y)
	{
		componentPos = new Vec2(x, y);
	}
	
	protected abstract boolean pointCollide(double x, double y);
	
	protected final boolean mouseHover()
	{
		HWindow currentWindow = HWindowManager.getInstance().getFocusedWindow();
		Vec2 mousePos = currentWindow.getCurrentMousePos();
		return pointCollide(mousePos.x, mousePos.y);
	}
	
	public abstract void render(Graphics2D g2d);
	public abstract void update();
	
	
	public final HWindow getSourceWindow()
	{
		return this.sourceWindow;
	}
	
	public final void setSourceWindow(HWindow window)
	{
		this.sourceWindow = window;
	}
	
	public final HComponent getParentComponent()
	{
		return parentComponent;
	}
	
	public final void setParentComponent(HComponent component)
	{
		this.parentComponent = component;
	}

	public String getInfo() {return "COMPONENT_INFO"; }
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
