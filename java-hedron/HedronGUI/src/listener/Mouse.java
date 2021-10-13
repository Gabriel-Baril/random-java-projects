package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.HComponent;
import main.HFrame;
import main.HTextLabel;
import main.HWindow;
import main.HWindowManager;

public class Mouse implements MouseListener, MouseMotionListener
{
	private static Mouse instance;
	
	public static final int Y_MOUSE_OFFSET = 26;
	public static final int X_MOUSE_OFFSET = 5;
	
	private Mouse() {}
	
	private static int getRealX(MouseEvent e)
	{
		return e.getX() - X_MOUSE_OFFSET;
	}
	
	private static int getRealY(MouseEvent e)
	{
		return e.getY() - Y_MOUSE_OFFSET;
	}
	
	
	public void mouseDragged(MouseEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow(); 
		if(focusedWindow != null)
		{
			//focusedWindow.setCurrentMouseButtonUsed(e.getButton());
			focusedWindow.setMouseMoved(true);
			focusedWindow.setMouseDragged(true);
			focusedWindow.setCurrentMousePos(getRealX(e), getRealY(e));
			focusedWindow.setOldDragMousePos(getRealX(e), getRealY(e));
		}
		//System.out.println("Dragged");
	}

	
	public void mouseMoved(MouseEvent e) 
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			//focusedWindow.setCurrentMouseButtonUsed(e.getButton());
			focusedWindow.setMouseMoved(true);
			focusedWindow.setCurrentMousePos(getRealX(e), getRealY(e));
		}
	}

	
	public void mouseClicked(MouseEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			focusedWindow.setCurrentMouseButtonUsed(e.getButton());
			focusedWindow.setMouseClicked(true);
		}
		//System.out.println("mouseClicked");
	}

	
	public void mouseEntered(MouseEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			focusedWindow.setMouseEntered(true);
			focusedWindow.setMouseExited(false);
		}
		//System.out.println("mouseEntered");
		
	}

	
	public void mouseExited(MouseEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			focusedWindow.setMouseExited(true);
			focusedWindow.setMouseEntered(false);
		}
		//System.out.println("mouseExited");
		
	}

	
	public void mousePressed(MouseEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			focusedWindow.setCurrentMouseButtonUsed(e.getButton());
			focusedWindow.setMousePressed(true);
			focusedWindow.setMouseDragged(true);
			focusedWindow.setInitialDragMousePos(getRealX(e), getRealY(e));
		}
		//System.out.println("mousePressed");
	}

	
	public void mouseReleased(MouseEvent e) {
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		if(focusedWindow != null)
		{
			focusedWindow.setCurrentMouseButtonUsed(e.getButton());
			focusedWindow.setMouseDragged(false);
			focusedWindow.setMouseReleased(true);
			focusedWindow.setFinalDragMousePos(getRealX(e), getRealY(e));
		}
		//System.out.println("mouseReleased");
	}

	public static Mouse getInstance()
	{
		if(instance == null)
			instance = new Mouse();
		return instance;
	}
}
