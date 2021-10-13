package tutorial;

public class Label implements Component
{
	String content;
	
	public Label(String content)
	{
		this.content = content;
	}
	
	@Override
	public void render()
	{
		System.out.println("Label content : " + this.content);
	}

}
