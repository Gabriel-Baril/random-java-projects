package listener;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import main.HWindow;
import main.HWindowManager;
import main.ThreadManager;

public class Window implements WindowListener
{
	private static Window instance;

	private Window() {}
	
	
	public void windowActivated(WindowEvent e) {
		//System.out.println("ACTIVATED");
		HWindowManager.getInstance().setFocusedWindow((HWindow)e.getSource());
		HWindowManager.getInstance().getFocusedWindow().setWindowActivated(true);
	}

	
	public void windowClosed(WindowEvent e) {
		//System.out.println("CLOSED");
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		focusedWindow.setWindowOpened(false);
	}

	@SuppressWarnings("deprecation")
	
	public void windowClosing(WindowEvent e) {
		//System.out.println("CLOSING");
		//System.out.println(((HWindow)e.getSource()).getWindowName() + " CLOSED");
		HWindowManager.getInstance().getFocusedWindow().setWindowClosing(true);
		((HWindow)e.getSource()).getThread().stop();
		ThreadManager.getInstance().removeThread((Thread)((HWindow)e.getSource()).getThread());
		HWindowManager.getInstance().removeHWindow((HWindow)e.getSource());
		//System.out.println(HWindowManager.getInstance().getHWindowList().size());
	}

	
	public void windowDeactivated(WindowEvent e) {
		//System.out.println("DEACTIVATED");
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow(); 
		focusedWindow.setWindowActivated(false);
	}

	
	public void windowDeiconified(WindowEvent e) {
		//System.out.println("DEICONIFIED");
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow(); 
		focusedWindow.setWindowIconified(false);
		
	}

	
	public void windowIconified(WindowEvent e) {
		//System.out.println("ICONIFIED");
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow(); 
		focusedWindow.setWindowIconified(true);
		
	}

	
	public void windowOpened(WindowEvent e) {
		//System.out.println("OPENED");
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow(); 
		focusedWindow.setWindowOpened(true);
		
	}

	public static Window getInstance()
	{
		if(instance == null)
			instance = new Window();
		return instance;
	}
}
