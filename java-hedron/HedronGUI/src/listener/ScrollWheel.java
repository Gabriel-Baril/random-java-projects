package listener;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import main.HWindow;
import main.HWindowManager;

public class ScrollWheel implements MouseWheelListener
{
	public static final int SCROLL_UP_CODE = -1;
	public static final int SCROLL_DOWN_CODE = 1;
	private static ScrollWheel instance;
	
	private ScrollWheel() {}
	
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(e.getWheelRotation() == SCROLL_UP_CODE)
		{
			focusedWindow.setMouseWheelScrolledUp(true);
		}
		else if(e.getWheelRotation() == SCROLL_DOWN_CODE)
		{
			focusedWindow.setMouseWheelScrolledDown(true);
		}
	}
	
	public static ScrollWheel getInstance()
	{
		if(instance == null)
			instance = new ScrollWheel();
		return instance;
	}

}
