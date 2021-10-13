package map;

import java.util.ArrayList;

public class Game {
	public ArrayList<Stage> stages = new ArrayList<Stage>();
	int nbStage;
	boolean finished = false;
	
	public Game(int nbStage){
		this.nbStage = nbStage;
		this.generate();
	}
	
	public void generate(){
		for(int i = 0;i < nbStage - 1;i++){
			stages.add(new Stage(5,i + 1));
		}
	}
}
