package components.util;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import components.HRectComponent;

public class HText extends HRectComponent
{
	private String content;
	private Font font;
	
	public HText(String content)
	{
		this.content = content;
		this.font = new Font("Serif", Font.PLAIN, 15);
	}
	
	public HText(String content, String fontName, int fontStyle, int fontSize)
	{
		this.content = content;
		this.font = new Font(fontName, fontStyle, fontSize);
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public void setFont(String fontName, int fontStyle, int fontSize)
	{
		font = new Font(fontName, fontStyle, fontSize);
	}
	
	public Font getFont()
	{
		return this.font;
	}
	
	public Rectangle2D textBound()
	{
		AffineTransform affinetransform = new AffineTransform();     
		FontRenderContext frc = new FontRenderContext(affinetransform,true,true);
		return this.font.getStringBounds(this.content, frc);
	}
	
	public Rectangle textBound(Graphics2D g2d)
	{
		FontRenderContext frc = g2d.getFontRenderContext();
        GlyphVector gv = g2d.getFont().createGlyphVector(frc, this.content);
        return gv.getPixelBounds(null, 0, 0);
	}

	@Override
	public void render(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
