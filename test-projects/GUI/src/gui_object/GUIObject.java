package gui_object;

public abstract class GUIObject {
	private float absoluteX, absoluteY, w, h;
	
	public GUIObject(float absoluteX,float absoluteY,float w,float h)
	{
		this.absoluteX = absoluteX;
		this.absoluteY = absoluteY;
		this.w = w;
		this.h = h;
	}
	
	public abstract void render();
	public abstract void update();
	
	public boolean collide(float x,float y)
	{	
		return x > this.absoluteX && x < this.absoluteX + this.w && y > this.absoluteY && y < this.absoluteY + this.h;
	}
	
	public float getAbsoluteX() { return this.absoluteX; }
	public float getAbsoluteY() { return this.absoluteY; }
	public float getWidth() { return this.w; }
	public float getHeight() { return this.h; }
}
