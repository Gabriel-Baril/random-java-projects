package map;

public class Door {
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	int direction;
	boolean closed;
	boolean broken;
	boolean breakable;
	
	public boolean collidePlayer(){
		return false;
	}
}
