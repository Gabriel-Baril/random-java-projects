package fenetre;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListener implements KeyListener{
	
	public boolean up = false;
	public boolean down = false;
	public boolean left = false;
	public boolean right = false;

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 38){
			up = true;
		}
		if(e.getKeyCode() == 40){
			down = true;
		}
		if(e.getKeyCode() == 37){
			left = true;
		}
		if(e.getKeyCode() == 39){
			right = true;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == 38){
			up = false;
		}
		if(e.getKeyCode() == 40){
			down = false;
		}
		if(e.getKeyCode() == 37){
			left = false;
		}
		if(e.getKeyCode() == 39){
			right = false;
		}
		
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

}
