package fenetre;

import javax.swing.JFrame;

public class Frame extends JFrame{
	 static Panel panel = new Panel();
	 static int x = 0;
	 static int y = 0;
	 static int width = 815;
	 static int height = 800;
	 static keyListener klistener = new keyListener();
	 static mouseListener mlistener = new mouseListener();
	 static mouseWheelListener mwlistener = new mouseWheelListener();
	 
	 public Frame(){
	 this.setVisible(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setSize(width, height);
	 this.setLocationRelativeTo(null);
	 this.addKeyListener(klistener);
	 this.addMouseListener(mlistener);
	 this.addMouseWheelListener(mwlistener);
	 //Sauvegarde.read();
		
	 this.setContentPane(panel);
	 Trame();
	 }
	 
	 public static void Trame(){
			while(true){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("ERREUR");
				}
				if(mwlistener.rotation == 1){
					mwlistener.rotation = 0;
				}
				if(klistener.up) y--;
				if(klistener.down) y++;
				if(klistener.right) x++;
				if(klistener.left) x--;
				
			
				
				
				panel.repaint(); 
				
				Sauvegarde.write();
			}
	 }
	 public static void collision(){
		 
	 }
	 

}
