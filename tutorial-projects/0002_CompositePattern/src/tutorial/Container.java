package tutorial;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component
{
	List<Component> components;
	
	
	public Container()
	{
		components = new ArrayList<Component>();
	}
	
	@Override
	public void render() {
		for(Component component : this.components)
		{
			component.render();
		}
	}
	
}
