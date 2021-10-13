package room;

import java.util.ArrayList;
import java.util.Arrays;

import consummable.ConsummableEntity;
import enemy.EnemyEntity;
import map.Door;
import staticObject.StaticObject;

public abstract class AbstractRoom {
	public StaticObject[][] tiles = new StaticObject[13][7];
	public ArrayList<ConsummableEntity> consummables = new ArrayList<ConsummableEntity>();
	public ArrayList<EnemyEntity> enemies = new ArrayList<EnemyEntity>();
	Door[] doors;
	private boolean current;
	
	public AbstractRoom(StaticObject[][] tiles,ConsummableEntity[] consummables,EnemyEntity[] enemies,Door[] doors){
		this.tiles = tiles;
		this.consummables.addAll(Arrays.asList(consummables));
		this.enemies.addAll(Arrays.asList(enemies));
		this.doors = doors;
	}
	
	public void destroyAll(){
		consummables.clear();
		enemies.clear();
	}
	
	public void killEnemies(){
		enemies.clear();
	}
	
	public void destroyConsummable(){
		consummables.clear();
	}

	public boolean isCurrent() {return current;}
	public void setCurrent(boolean current) {this.current = current;}
}
