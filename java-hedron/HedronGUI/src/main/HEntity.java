package main;

public abstract class HEntity implements Printable
{
	public static final String CLASS_NAME = "HEntity";
	public static final String NORMAL_CLASS_NAME = "Entity";
	public static final String NORMAL_UPPER_CLASS_NAME = "ENTITY";
	public static final String SNAKE_UPPER_CLASS_NAME = "H_ENTITY";
	public static final String NORMAL_SNAKE_UPPER_CLASS_NAME = "ENTITY";
	
	
	public String getInfo() {return "ENTITY_INFO"; };
	public String getClassName() { return CLASS_NAME; }
	public String getNormalClassName() { return NORMAL_CLASS_NAME; }
	public String getNormalUpperClassName() { return NORMAL_UPPER_CLASS_NAME; }
	public String getSnakeUpperClassName() { return SNAKE_UPPER_CLASS_NAME; }
	public String getNormalSnakeUpperClassName() { return NORMAL_SNAKE_UPPER_CLASS_NAME; }
	
	public String getRecursiveClassName() { return CLASS_NAME; }
	public String getRecursiveNormalClassName() { return NORMAL_CLASS_NAME; }
	public String getRecursiveUpperClassName() { return NORMAL_UPPER_CLASS_NAME; }
	public String getRecursiveSnakeUpperClassName() { return SNAKE_UPPER_CLASS_NAME; }
	public String getRecursiveNormalSnakeUpperClassName() { return NORMAL_SNAKE_UPPER_CLASS_NAME; }
}
