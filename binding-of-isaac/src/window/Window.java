package window;

import javax.swing.JFrame;

import map.Game;

public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	private int fps = 0;
	private static Window instance;
	
	private Window(){
		build();
		setup();
		gameLoop();
	}
	
	public void build(){
		setTitle("TBOI");
		setSize(Const.WIDTH,Const.HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setResizable(false);
		setContentPane(Const.panel);
	}
	
	public void setup(){
		Const.game = new Game(10);
		Const.game.stages.get(0).setCurrent(true);
		Const.game.stages.get(0).rooms.get(0).setCurrent(true);
	}
	
	public void gameLoop(){
		while(true){
			updateGame();
		}
	}
	
	public void updateGame(){
		long beforeTime = System.nanoTime(); 
		int frames = 0;
		while(Const.running){
			try{
				Thread.sleep(Const.updateTime);
			}catch(InterruptedException e){e.printStackTrace();}
			
			contentGame();
			System.out.println(fps);
			
			frames++;
			if(System.nanoTime() - beforeTime >= 1000000000L) {
				fps = frames;
				frames = 0;
				beforeTime = System.nanoTime();
			}
		}
	}
	
	public void contentGame(){
		Const.panel.repaint();
	}
	
	public int getFPS(){return fps;}
	
	public static Window getInstance(){
		if(instance == null){
			instance = new Window();
		}
		return instance;
	}
}
