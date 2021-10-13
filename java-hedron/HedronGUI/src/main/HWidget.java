package main;

public abstract class HWidget extends HEntity
{
	public static final String CLASS_NAME = "HWidget";
	public static final String NORMAL_CLASS_NAME = "Widget";
	public static final String NORMAL_UPPER_CLASS_NAME = "WIDGET";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_WIDGET";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "WIDGET";
	
	
	public String getInfo() {return "WIDGET_INFO"; }
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
