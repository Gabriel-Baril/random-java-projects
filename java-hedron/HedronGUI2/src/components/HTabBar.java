package components;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import collider.colliders.Collider;
import collider.colliders.Rectangle;


public class HTabBar extends HRectComponent
{
	List<HTab> tabs;
	
	public HTabBar(double width, double height)
	{
		super(0, 0, width, height);
		this.tabs = new ArrayList<HTab>();
	}
	
	public void addTabElement(HTab tab)
	{
		tabs.add(tab);
	}
	
	public boolean removeTabElement(HTab tab)
	{
		return tabs.remove(tab);
	}

	@Override
	public void render(Graphics2D g2d)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update()
	{
		
	}
}
