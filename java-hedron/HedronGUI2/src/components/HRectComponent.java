package components;

import components.style.PaddingData;

public abstract class HRectComponent extends HComponent
{
	private double width;
	private double height;
	PaddingData paddingLeft;
	PaddingData paddingTop;
	PaddingData paddingRight;
	PaddingData paddingBottom;
	
	public HRectComponent()
	{
		super(0, 0);
		this.setW(0);
		this.setH(0);
	}
	
	public HRectComponent(double x, double y, double width, double height) {
		super(x, y);
		this.setW(width);
		this.setH(height);
	}
	
	public void setW(double width) {
		this.width = width;
	}
	
	public double getW() {
		return width;
	}
	
	public int getWi() {
		return (int)getW();
	}
	
	public void setH(double height) {
		this.height = height;
	}
	
	public double getH() {
		return height;
	}
	
	public int getHi() {
		return (int)getH();
	}
}
