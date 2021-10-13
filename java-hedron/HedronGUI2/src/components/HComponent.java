package components;

import math.Vec2;

public abstract class HComponent implements Drawable, Updatable
{
	private HWindow sourceWindow;
	private HComponent parentComponent;
	private Vec2 position;
	
	public HComponent(double x, double y)
	{
		this.position = new Vec2(x, y);
	}
	

	public void setX(double x)
	{
		this.position.setX(x);
	}
	
	public double getX() {
		return this.position.getX();
	}
	
	public int getXi() {
		return (int)this.position.getX();
	}

	public void setY(double y)
	{
		this.position.setY(y);
	}
	
	public double getY() {
		return this.position.getY();
	}
	
	public int getYi() {
		return (int)this.position.getY();
	}
	
	public void setSourceWindow(HWindow sourceWindow) {
		this.sourceWindow = sourceWindow;
	}

	public HWindow getSourceWindow() {
		return sourceWindow;
	}
	
	public void setParentComponent(HComponent parentComponent) {
		this.parentComponent = parentComponent;
	}

	public HComponent getParentComponent() {
		return parentComponent;
	}	
}
