package main.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{
	private static Keyboard instance;
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public static Keyboard getInstance()
	{
		if(Keyboard.instance == null)
			Keyboard.instance = new Keyboard();
		return Keyboard.instance;
	}

}
