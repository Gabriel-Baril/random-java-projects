package main;

import java.util.ArrayList;

public class HWindowManager
{
	private static HWindowManager instance;
	private HWindow focusedWindow;
	private ArrayList<HWindow> hWindowList;
	
	private HWindowManager()
	{
		hWindowList = new ArrayList<HWindow>();
	}
	
	public void addHWindow(HWindow hWindow)
	{
		hWindowList.add(hWindow);
	}
	
	public boolean removeHWindow(HWindow hWindow)
	{
		boolean windowContained = hWindowList.remove(hWindow);
		if(hWindowList.size() <= 0)
			System.exit(0);
		return windowContained;
	}
	
	public void setFocusedWindow(HWindow hWindow)
	{
		focusedWindow = hWindow;
	}
	
	public HWindow getFocusedWindow()
	{
		return focusedWindow;
	}

	public ArrayList<HWindow> getHWindowList()
	{
		return hWindowList;
	}
	
	public static HWindowManager getInstance()
	{
		if(instance == null)
			instance = new HWindowManager();
		return instance;
	}
}
