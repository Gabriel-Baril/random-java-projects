package main.window;

import java.awt.Font;

import javax.swing.JFrame;

import main.input.Keyboard;
import main.input.Mouse;
import main.input.MouseWheel;
import main.rendering.Panneau;

public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	public static final short WIDTH = 800;
	public static final short HEIGHT = 800;
	public static String title = "Graph";
	public static boolean running = true;
	public static byte refresh_rate = 16;
	private double fps = 0;
	
	public Window()
	{
		this.setTitle(Window.title);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(false);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Window.WIDTH, Window.HEIGHT);
		this.addMouseListener(Mouse.getInstance());
		this.addMouseMotionListener(Mouse.getInstance());
		this.addKeyListener(Keyboard.getInstance());
		this.addMouseWheelListener(MouseWheel.getInstance());
		this.setContentPane(Panneau.getInstance());
		this.mainLoop();
	}
	
	private synchronized void mainLoop()
	{
		while(true)
		{
			while(Window.running)
			{
				try 
				{
					long before = System.currentTimeMillis();
					Thread.sleep(Window.refresh_rate);
					this.update();
					this.setFps(1000/(System.currentTimeMillis() - before));
					System.out.println(this.getFps());
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	private synchronized void update()
	{
		Panneau.getInstance().repaint();
	}
	
	public void setFps(double fps) { this.fps = fps;}
	public double getFps() { return this.fps; }
}
