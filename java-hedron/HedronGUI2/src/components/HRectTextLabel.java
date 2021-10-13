package components;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import components.util.HText;

public class HRectTextLabel extends HRectComponent
{
	HText text;
	
	public HRectTextLabel(String content, double x, double y, double width, double height) {
		super(x, y, width, height);
		this.text = new HText(content);
	}
	
	public HRectTextLabel(double x, double y, double width, double height) {
		super(x, y, width, height);
		this.text = new HText("");
	}
	
	public HRectTextLabel(HText text) {
		super(0, 0, 0, 0);
		this.text = text;
	}
	
	public HRectTextLabel() {
		super(0, 0, 0, 0);
		this.text = new HText("");
	}

	int test = 0;
	@Override
	public void render(Graphics2D g2d)
	{
		g2d.setFont(text.getFont());
		Rectangle textBound = text.textBound(g2d);
		text.setContent(test++ + "");
		g2d.drawRect(
				(int)textBound.getX() + getXi(), 
				(int)textBound.getY() + getYi(), 
				(int)textBound.getWidth(), 
				(int)textBound.getHeight()
			);

		Rectangle2D textBound2 = text.textBound();
		text.setContent(test++ + "");
		g2d.drawRect(
				(int)textBound2.getX() + getXi(), 
				(int)textBound2.getY() + getYi(), 
				(int)textBound2.getWidth(), 
				(int)textBound2.getHeight()
			);
		
		g2d.drawRect(getXi(), getYi(), getWi(), getHi());
		g2d.drawString(text.getContent(), getXi(), getYi());// + text.textHeight() - text.textHeight()/2 + 2);
	}

	@Override
	public void update() {
		 //setX(getX() + 0.1);
		 //setY(getY() + 0.1);
	}
	
	public void setFont(String fontName, int fontStyle, int fontSize)
	{
		text.setFont(fontName, fontStyle, fontSize);
	}
	
	public void setContent(String content)
	{
		this.text.setContent(content);
	}
	
	public String getContent()
	{
		return this.text.getContent();
	}
}
