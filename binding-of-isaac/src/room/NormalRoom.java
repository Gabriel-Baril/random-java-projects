package room;

import java.io.File;

import consummable.ConsummableEntity;
import enemy.EnemyEntity;
import map.Door;
import staticObject.StaticObject;

public class NormalRoom extends AbstractRoom{
	private static File layout = new File();
	
	public NormalRoom(StaticObject[][] tiles, ConsummableEntity[] consummables, EnemyEntity[] enemies, Door[] doors) {
		super(tiles, consummables, enemies, doors);
	}

}
