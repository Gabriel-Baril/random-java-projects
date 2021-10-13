package fenetre;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class mouseWheelListener implements MouseWheelListener{
	int rotation = 0;

	public void mouseWheelMoved(MouseWheelEvent e) {
		if(e.getWheelRotation() == 1) rotation = 1;
		if(e.getWheelRotation() == -1) rotation = -1;
		
	}

}
