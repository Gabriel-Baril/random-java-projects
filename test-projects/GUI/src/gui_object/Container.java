package gui_object;

import java.util.ArrayList;

public class Container<T extends GUIObject> extends AbstractContainer{
	ArrayList<T> components;
	
	@Override
	public void render() {
		for(int i = 0;i < components.size();i++)
		{
			components.get(i).render();
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
