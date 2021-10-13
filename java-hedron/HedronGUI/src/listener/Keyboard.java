package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.HWindow;
import main.HWindowManager;

public class Keyboard implements KeyListener
{
	private static Keyboard instance;

	private Keyboard() {}
	
	public void keyPressed(KeyEvent e)
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		focusedWindow.setKeyPressed(true);
		focusedWindow.setCurrentKeyUsed(e.getKeyChar());
	}

	public void keyReleased(KeyEvent e)
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		focusedWindow.setKeyReleased(true);
		focusedWindow.setKeyPressed(false);
		focusedWindow.setKeyTyped(false);
		focusedWindow.setCurrentKeyUsed(-1);
	}

	public void keyTyped(KeyEvent e)
	{
		HWindow focusedWindow = HWindowManager.getInstance().getFocusedWindow();
		focusedWindow.setKeyTyped(true);
		focusedWindow.setCurrentKeyUsed(e.getKeyChar());
	}
	

	public static Keyboard getInstance()
	{
		if(instance == null)
			instance = new Keyboard();
		return instance;
	}
}
