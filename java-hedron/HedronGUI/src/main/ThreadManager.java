package main;

import java.util.ArrayList;

public class ThreadManager 
{
	private static ThreadManager instance;
	
	private ArrayList<Thread> threadList;
	
	private ThreadManager()
	{
		threadList = new ArrayList<Thread>();
	}
	
	public void addThread(Thread thread)
	{
		threadList.add(thread);
	}
	
	public boolean removeThread(Thread thread)
	{
		return threadList.remove(thread);
	}
	

	public ArrayList<Thread> getHWindowList()
	{
		return threadList;
	}
	
	public static ThreadManager getInstance()
	{
		if(instance == null)
			instance = new ThreadManager();
		return instance;
	}
}
