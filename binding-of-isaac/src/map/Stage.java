package map;

import java.awt.Color;
import java.util.ArrayList;

import consummable.Coin;
import consummable.ConsummableEntity;

public class Stage {
	public ArrayList<Room> rooms = new ArrayList<Room>();
	int numberRoom;
	int level;
	private boolean current;
	private boolean finished;
	
	public Stage(int numberRoom,int level){
		this.numberRoom = numberRoom;
		this.level = level;
		this.generate();
	}
	
	private void generate(){
		this.rooms.clear();
		for(int i = 0;i < numberRoom;i++){
		}
	}
	
	public void reset(){
		this.generate();
	}

	public boolean isCurrent() {return current;}
	public void setCurrent(boolean current) {this.current = current;}
	public boolean isFinished() {return finished;}
	public void setFinished(boolean finished) {this.finished = finished;}
}
