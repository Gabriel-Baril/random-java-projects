package window;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	Graphics2D g2d;
	
	public void paintComponent(Graphics g){
		g2d = (Graphics2D) g;
		super.paintComponent(g2d);
		DISPLAY_CONSUMMABLE(g2d);
	}
	
	public void DISPLAY_CONSUMMABLE(Graphics2D g2d){
			for(int j = 0;j < Const.game.stages.size();j++){
				if(Const.game.stages.get(j).isCurrent()){
					for(int k = 0;k < Const.game.stages.get(j).rooms.size();k++){
						if(Const.game.stages.get(j).rooms.get(k).isCurrent()){
							for(int n = 0;n < Const.game.stages.get(j).rooms.get(k).consummables.size();n++){
								Const.game.stages.get(j).rooms.get(k).consummables.get(n).render(g2d);
							}
							for(int n = 0;n < Const.game.stages.get(j).rooms.get(k).enemies.size();n++){
								Const.game.stages.get(j).rooms.get(k).enemies.get(n).render(g2d);
							}
						}
					}
				}
			}
	}
	
	public Graphics2D getG2d(){return this.g2d;}
}
