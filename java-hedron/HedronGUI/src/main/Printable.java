package main;

public interface Printable
{
	public static final String RECURSIVE_SEPARATOR = ".";
	
	public abstract String getInfo();
	
	public abstract String getClassName();
	public abstract String getNormalClassName();
	public abstract String getNormalUpperClassName();
	public abstract String getSnakeUpperClassName();
	public abstract String getNormalSnakeUpperClassName();
	
	public abstract String getRecursiveClassName();
	public abstract String getRecursiveNormalClassName();
	public abstract String getRecursiveUpperClassName();
	public abstract String getRecursiveSnakeUpperClassName();
	public abstract String getRecursiveNormalSnakeUpperClassName();
	
	public default void printInfo() { Logger.log(getInfo()); }
	
	public default void printClassName() { Logger.log(getClassName()); }
	public default void printNormalClassName() { Logger.log(getNormalClassName()); }
	public default void printNormalUpperClassName() { Logger.log(getNormalUpperClassName()); }
	public default void printSnakeUpperClassName() { Logger.log(getSnakeUpperClassName()); }
	public default void printNormalSnakeUpperClassName() { Logger.log(getNormalSnakeUpperClassName()); }

	public default void printRecursiveClassName() { Logger.log(getRecursiveClassName()); }
	public default void printRecursiveNormalClassName() { Logger.log(getRecursiveNormalClassName()); }
	public default void printRecursiveNormalUpperClassName() { Logger.log(getRecursiveUpperClassName()); }
	public default void printRecursiveSnakeUpperClassName() { Logger.log(getRecursiveSnakeUpperClassName()); }
	public default void printRecursiveNormalSnakeUpperClassName() { Logger.log(getRecursiveNormalSnakeUpperClassName()); }
}
