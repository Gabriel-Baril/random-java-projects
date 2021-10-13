package main;

import java.util.ArrayList;

import javax.swing.JFrame;

import listener.Keyboard;
import listener.Mouse;
import listener.ScrollWheel;
import listener.Window;
import renderer.Panel;

public class HWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	private int windowWidth;
	private int windowHeight;
	private String windowName;
	
	private boolean isResizable;
	private boolean isRunning;
	private boolean isVisible;
	
	private long preferedFps;
	private long delay;
	private float currentFps;
	private long timeLastFrame;
	
	private int currentMouseButtonUsed;
	private int currentKeyUsed;
	
	private boolean isMouseDragged;
	private boolean isMouseMoved;
	private boolean isMouseReleased;
	private boolean isMousePressed;
	private boolean isMouseClicked;
	private boolean isMouseEntered;
	private boolean isMouseExited;
	
	private boolean isMouseWheelScrolledUp;
	private boolean isMouseWheelScrolledDown;
	
	private boolean isWindowIconified;
	private boolean isWindowActivated;
	private boolean isWindowOpened;
	private boolean isWindowClosing;
	
	private boolean isKeyPressed;
	private boolean isKeyReleased;
	private boolean isKeyTyped;
	
	private boolean isAsleepWhenNotFocused;
	
	private Vec2 initialDragMousePos;
	private Vec2 finalDragMousePos;
	private Vec2 oldDragMousePos;
	private Vec2 currentMousePos;

	private boolean isDraggingGUIComponent;
	private ArrayList<HComponent> GUIcomponents;
	private HComponent currentDraggedComponent;
	private Thread thread;
	private Panel panel;
	
	
	public HWindow(String windowName, int windowWidth, int windowHeight, long preferedFps)
	{
		HWindowManager.getInstance().addHWindow(this);
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		this.setWindowName(windowName);
		
		this.isResizable = false;
		this.isRunning = true;
		this.isVisible = true;
		
		this.preferedFps = preferedFps;
		this.delay = 1000/preferedFps;
		this.currentFps = 0;
		this.timeLastFrame = 0;
		
		this.setCurrentMouseButtonUsed(-1);
		this.setCurrentKeyUsed(-1);
		
		this.setMouseDragged(false);
		this.setMouseMoved(false);
		this.setMouseClicked(false);
		this.setMouseEntered(false);
		this.setMouseExited(false);
		this.setMousePressed(false);
		this.setMouseReleased(true);
		
		this.setMouseWheelScrolledUp(false);
		this.setMouseWheelScrolledDown(false);
		
		this.setWindowIconified(false);
		this.setWindowActivated(true);
		this.setWindowOpened(true);
		this.setWindowClosing(false);
		
		this.setKeyPressed(false);
		this.setKeyReleased(false);
		this.setKeyTyped(false);
		
		this.isAsleepWhenNotFocused = true;
		
		this.oldDragMousePos = new Vec2(0, 0);
		this.initialDragMousePos = new Vec2(0, 0);
		this.finalDragMousePos = new Vec2(0, 0);
		this.currentMousePos = new Vec2(0, 0);

		this.setDraggingGUIComponent(false);
		this.GUIcomponents = new ArrayList<HComponent>();
		this.panel = new Panel(this);
		
		
		HWindow me = this;
		build();
		this.thread = new Thread() 
		{
			public void run()
			{
				me.mainLoop();
			}
		};
		ThreadManager.getInstance().addThread(this.thread);
		this.thread.start();
	}


	private void build() {
		this.addKeyListener(Keyboard.getInstance());
		this.addMouseListener(Mouse.getInstance());
		this.addMouseMotionListener(Mouse.getInstance());
		this.addMouseWheelListener(ScrollWheel.getInstance());
		this.addWindowListener(Window.getInstance());
		this.setTitle(this.windowName);
		this.setSize(this.windowWidth, this.windowHeight);
		this.setVisible(isVisible);
		this.setLocationRelativeTo(null);
		this.setResizable(isResizable);
		this.setContentPane(this.panel);
	}
	
	public synchronized void addGUIComponent(HComponent component)
	{
		boolean added = GUIcomponents.add(component);
		if(added)
		{
			if (component.getSourceWindow() != null)
			{
				component.getSourceWindow().removeGUIComponent(component);
			}
			component.setSourceWindow(this);
			component.setParentComponent(null);
		}
	}
	
	public synchronized void removeGUIComponent(HComponent component)
	{
		this.GUIcomponents.remove(component);
	}
	
	public void mainLoop()
	{
		while(true)
		{
			run();
		}
	}
	
	public void run()
	{
		while(isRunning)
		{
			try
			{
				long before = System.currentTimeMillis();
				Thread.sleep(this.delay);
				if(isAsleepWhenNotFocused && HWindowManager.getInstance().getFocusedWindow() == this)
				{
					update();
				}
				long timeElapsed = System.currentTimeMillis() - before;
				this.timeLastFrame = timeElapsed;
				this.currentFps = (float)1000/timeElapsed;
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	
	private void update()
	{
		/*
		System.out.println("CLICKED : " + this.isMouseClicked);
		System.out.println("DRAGGED : " + this.isMouseDragged);
		System.out.println("ENTERED : " + this.isMouseEntered);
		System.out.println("EXITED : " + this.isMouseExited);
		System.out.println("MOVED : " + this.isMouseMoved);
		System.out.println("PRESSED : " + this.isMousePressed);
		System.out.println("RELEASED : " + this.isMouseReleased);
		System.out.println("-------------------------------------");
		*/

		/*
		System.out.println("ACTIVATED[" + getWindowName() + "] : " + this.isWindowActivated);
		System.out.println("ICONIFIED : " + this.isWindowIconified);
		System.out.println("OPENED : " + this.isWindowOpened);
		System.out.println("CLOSING : " + this.isWindowClosing);
		System.out.println("-------------------------------------");
		*/
		
		//System.out.println(this.currentKeyUsed);
		
		for(HComponent component : this.GUIcomponents)
		{
			component.update();
		}
		
		setMouseClicked(false);
		setMousePressed(false);
		setMouseReleased(false);
		setMouseMoved(false);
		setMouseWheelScrolledUp(false);
		setMouseWheelScrolledDown(false);
		setKeyReleased(false);
		if(!isMouseDragged)
		{
			setCurrentMouseButtonUsed(-1);
		}
		this.panel.repaint();
	}
	
	public void render()
	{
		this.panel.getG2D().drawString(String.format("%.2f", this.currentFps) + " FPS", 2, 15);
		for(int i = 0;i < GUIcomponents.size();i++)
		{
			GUIcomponents.get(i).render(this.panel.getG2D());
		} 
	}
	
	public ArrayList<HComponent> getGUIComponents()
	{
		return this.GUIcomponents;
	}
	
	public Panel getPanel()
	{
		return panel;
	}
	
	public Thread getThread()
	{
		return this.thread;
	}

	public String getWindowName() {
		return windowName;
	}


	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}

	public Vec2 getOldDragMousePos() {
		return oldDragMousePos;
	}

	public void setOldDragMousePos(double x, double y) {
		this.oldDragMousePos.x = x;
		this.oldDragMousePos.y = y;
	}
	

	public Vec2 getInitialDragMousePos() {
		return initialDragMousePos;
	}

	public void setInitialDragMousePos(double x, double y) {
		this.initialDragMousePos.x = x;
		this.initialDragMousePos.y = y;
	}

	public Vec2 getFinalDragMousePos() {
		return finalDragMousePos;
	}

	public void setFinalDragMousePos(double x, double y) {
		this.finalDragMousePos.x = x;
		this.finalDragMousePos.y = y;
	}

	public Vec2 getCurrentMousePos() {
		return currentMousePos;
	}

	public void setCurrentMousePos(double x, double y) {
		this.currentMousePos.x = x;
		this.currentMousePos.y = y;
	}

	public boolean isDraggingGUIComponent() {
		return isDraggingGUIComponent;
	}

	public void setDraggingGUIComponent(boolean isDraggingGUIComponent) {
		this.isDraggingGUIComponent = isDraggingGUIComponent;
	}

	public HComponent getCurrentDraggedComponent() {
		return currentDraggedComponent;
	}

	public void setCurrentDraggedComponent(HComponent currentDraggedComponent) {
		this.currentDraggedComponent = currentDraggedComponent;
	}

	public boolean isMouseDragged() { return isMouseDragged; }
	public boolean isMouseMoved() { return isMouseMoved; }
	public boolean isMouseReleased() { return isMouseReleased; }
	public boolean isMousePressed() { return isMousePressed; }
	public boolean isMouseClicked() { return isMouseClicked; }
	public boolean isMouseEntered() { return isMouseEntered; }
	public boolean isMouseExited() { return isMouseExited; }
	public boolean isMouseWheelScrolledDown() { return isMouseWheelScrolledDown; } 
	public boolean isMouseWheelScrolledUp() { return isMouseWheelScrolledUp; } 
	public boolean isWindowIconified() { return isWindowIconified; } 
	public boolean isWindowActivated() { return isWindowActivated; } 
	public boolean isWindowOpened() { return isWindowOpened; }  
	public boolean isWindowClosing() { return isWindowClosing; } 
	public boolean isKeyPressed() { return isKeyPressed; } 
	public boolean isKeyReleased() { return isKeyReleased; } 
	public boolean isKeyTyped() { return isKeyTyped; } 
	public int getCurrentMouseButtonUsed() { return currentMouseButtonUsed; } 
	public int getCurrentKeyUsed() { return currentKeyUsed; }
	public void setMouseDragged(boolean isMouseDragged) { this.isMouseDragged = isMouseDragged; }
	public void setMouseMoved(boolean isMouseMoved) { this.isMouseMoved = isMouseMoved; }
	public void setMouseReleased(boolean isMouseReleased) { this.isMouseReleased = isMouseReleased; }
	public void setMousePressed(boolean isMousePressed) { this.isMousePressed = isMousePressed; }
	public void setMouseClicked(boolean isMouseClicked) { this.isMouseClicked = isMouseClicked; }
	public void setMouseEntered(boolean isMouseEntered) { this.isMouseEntered = isMouseEntered; }
	public void setMouseExited(boolean isMouseExited) { this.isMouseExited = isMouseExited; } 
	public void setMouseWheelScrolledUp(boolean isMouseWheelScrolledUp) { this.isMouseWheelScrolledUp = isMouseWheelScrolledUp; } 
	public void setMouseWheelScrolledDown(boolean isMouseWheelScrolledDown) { this.isMouseWheelScrolledDown = isMouseWheelScrolledDown; } 
	public void setWindowIconified(boolean isWindowIconified) { this.isWindowIconified = isWindowIconified; } 
	public void setWindowActivated(boolean isWindowActivated) { this.isWindowActivated = isWindowActivated; } 
	public void setWindowOpened(boolean isWindowOpened) { this.isWindowOpened = isWindowOpened; } 
	public void setWindowClosing(boolean isWindowClosing) { this.isWindowClosing = isWindowClosing; } 
	public void setKeyPressed(boolean isKeyPressed) { this.isKeyPressed = isKeyPressed; } 
	public void setKeyReleased(boolean isKeyReleased) { this.isKeyReleased = isKeyReleased; } 
	public void setKeyTyped(boolean isKeyTyped) { this.isKeyTyped = isKeyTyped; }
	public void setCurrentMouseButtonUsed(int currentMouseButtonUsed) { this.currentMouseButtonUsed = currentMouseButtonUsed; }
	public void setCurrentKeyUsed(int currentKeyUsed) { this.currentKeyUsed = currentKeyUsed; }
}
