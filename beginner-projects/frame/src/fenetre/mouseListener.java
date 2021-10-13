package fenetre;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseListener implements MouseListener{
	public boolean left = false;
	public boolean right = false;

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
		
	}

	public void mouseExited(MouseEvent e) {
	
		
	}

	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) left = true;
		if(e.getButton() == 3) right = true;
	}

	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == 1) left = false;
		if(e.getButton() == 3) right = false;
	
		
	}

}
