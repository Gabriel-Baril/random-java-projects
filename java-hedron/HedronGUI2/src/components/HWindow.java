package components;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

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
	

	private boolean isDraggingGUIComponent;
	private List<HComponent> GUIcomponents;
	private HComponent currentDraggedComponent;
	private Thread thread;
	private Panel panel;
	
	
	public HWindow(String windowName, int windowWidth, int windowHeight, long preferedFps)
	{
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		this.windowName = windowName;
		
		this.isResizable = false;
		this.isRunning = true;
		this.isVisible = true;
		
		this.preferedFps = preferedFps;
		this.delay = 1000/preferedFps;
		this.currentFps = 0;
		this.timeLastFrame = 0;
		
		
		this.GUIcomponents = new ArrayList<HComponent>();
		this.panel = new Panel(this);
		
		HWindow me = this;
		build();
		this.thread = new Thread() 
		{
			public void run()
			{
				me.build();
				me.mainLoop();
			}
		};
		//ThreadManager.getInstance().addThread(this.thread);
		this.thread.start();
	}

	
	
	private void build() {
		//this.addKeyListener(Keyboard.getInstance());
		//this.addMouseListener(Mouse.getInstance());
		//this.addMouseMotionListener(Mouse.getInstance());
		//this.addMouseWheelListener(ScrollWheel.getInstance());
		//this.addWindowListener(Window.getInstance());
		this.setTitle(this.windowName);
		this.setSize(this.windowWidth, this.windowHeight);
		this.setVisible(isVisible);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(isResizable);
		this.setContentPane(this.panel);
	}
	
	public void addGUIComponent(HComponent component)
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
	
	public void removeGUIComponent(HComponent component)
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
				update();
				long timeElapsed = System.currentTimeMillis() - before;
				this.timeLastFrame = timeElapsed;
				if(timeElapsed > 0)
				{
					this.currentFps = (float)1000/timeElapsed;
				}
			}
			catch(InterruptedException e) {}
		}
	}
	
	private void update()
	{
		for(HComponent component : this.GUIcomponents)
		{
			component.update();
		}
		this.setContentPane(this.panel);
	}
	
	public void render()
	{
		this.getGraphics2D().drawString(String.format("%.2f", this.currentFps) + " FPS", 2, 15);
		for(int i = 0;i < GUIcomponents.size();i++)
		{
			GUIcomponents.get(i).render(this.getGraphics2D());
		}
	}
	
	public float getCurrentFps() {
		return currentFps;
	}
	
	public Graphics2D getGraphics2D()
	{
		return this.getPanel().getGraphics();
	}

	public Panel getPanel()
	{
		return this.panel;
	}
}
