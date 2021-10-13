package main;

import java.awt.Graphics2D;
import behaviors.HDraggable;

public abstract class HBoxComponent extends HComponent implements HDraggable
{
	public static final String CLASS_NAME = "HBoxComponent";
	public static final String NORMAL_CLASS_NAME = "BoxComponent";
	public static final String NORMAL_UPPER_CLASS_NAME = "BOXCOMPONENT";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_BOX_COMPONENT";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "BOX_COMPONENT";
	protected int width;
	protected int height;
	protected Vec2 posBeforeDrag;
	protected boolean isDragged;
	protected boolean isDraggable;
	
	public HBoxComponent(int x, int y, int width, int height)
	{
		super(x, y);
		this.width = width;
		this.height = height;
		this.posBeforeDrag = new Vec2(0, 0);
		this.isDragged = false;
		this.isDraggable = false;
	}
	
	public HBoxComponent(int x, int y, int width, int height, boolean isDraggable)
	{
		this(x, y, width, height);
		this.isDraggable = isDraggable;
	}
	

	protected boolean pointCollide(double x, double y) 
	{
		return 	x >= componentPos.x &&        
				x <= componentPos.x + width &&  
				y >= componentPos.y &&        
				y <= componentPos.y + height;
	}
	
	public boolean dragCondition()
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			return focusedWindow.isMouseDragged() && ( focusedWindow.getCurrentDraggedComponent() == null || focusedWindow.getCurrentDraggedComponent() == this ) && mouseHover();
		}
		return false;
	}
	
	public void onDrag()
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		focusedWindow.setDraggingGUIComponent(true);
		if(focusedWindow.getCurrentDraggedComponent() == null)
		{
			focusedWindow.setCurrentDraggedComponent(this);
		}
		if(isDragged)
		{
			this.componentPos.x = focusedWindow.getCurrentMousePos().x - (focusedWindow.getInitialDragMousePos().x - this.posBeforeDrag.x);
			this.componentPos.y = focusedWindow.getCurrentMousePos().y - (focusedWindow.getInitialDragMousePos().y - this.posBeforeDrag.y);
		}
		else
		{
			this.posBeforeDrag.x = this.componentPos.x;
			this.posBeforeDrag.y = this.componentPos.y;
			isDragged = true;
		}
	}
	
	public abstract void render(Graphics2D g2d);
	public void update()
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(isDraggable)
		{
			if(dragCondition())
			{
				this.onDrag();
			}
			else if(focusedWindow != null && !focusedWindow.isMouseDragged())
			{
				isDragged = false;
				focusedWindow.setDraggingGUIComponent(false);
				focusedWindow.setCurrentDraggedComponent(null);
			}
		}
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
