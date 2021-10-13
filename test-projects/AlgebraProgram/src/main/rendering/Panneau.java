package main.rendering;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import function.Function;
import function.FunctionPlot;
import function.PolynomialFunction;
import main.Main;

public class Panneau extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private static Panneau instance;
	private Graphics2D g2d;
	
	public void paintComponent(Graphics g) {
		g2d = (Graphics2D) g;
		super.paintComponent(g2d);
		double[] data1 = {1,0,-9};
		double[] data2 = {3,2,-6,-9};
		double[] data3 = {0.5,0};
		Function function1 = new PolynomialFunction(data1);
		Function function2 = new PolynomialFunction(data2);
		Function function3 = new PolynomialFunction(data3);
		
		Graph.getInstance().renderAxis();
		Graph.getInstance().renderUnity(100);
		Graph.getInstance().graphFunction(new FunctionPlot()
		{
			public double y(double x)
			{
				return x*Math.log(Math.sqrt(x)/x);
			}
		});
		//g2d.setColor(new Color(0,128,0,255));
		//Graph.getInstance().graphFunction(function2);
		//g2d.setColor(new Color(128,0,0,255));
		//Graph.getInstance().graphFunction(function3);
		Graph.getInstance().renderPoint(20, 20, 3, true,new Font("Arial",10,10),new Color(0,0,0,255));
		Graph.getInstance().renderLine(10, 20, 50, 30, 3, true,new Font("Arial",10,10),new Color(0,0,0,255));
		Graph.getInstance().renderLine(10, 20, 50, 30, 3, true,new Font("Arial",10,10),new Color(0,0,0,255));
		Graph.getInstance().renderCursor(1,true,new Font("Arial",10,10),new Color(0,0,0,0));
	}
	
	public static Panneau getInstance() {
		if(Panneau.instance == null)
			Panneau.instance = new Panneau();
		return Panneau.instance;
	}
	
	public Graphics2D getG2D() {
		return this.g2d;
	}
}
