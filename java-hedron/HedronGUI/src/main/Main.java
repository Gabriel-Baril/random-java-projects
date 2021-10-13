package main;

import java.awt.Color;

public class Main {
	public static void main(String[] args)
	{
		HFrame hf = new HFrame(30, 20, 200, 200, true);
		HFrame subHF = new HFrame(50, 50, 30, 30);
		HFrame hf2 = new HFrame(300, 300, 100, 200, true);
		HTextLabel htl = new HTextLabel("Bonjour", 30, 200, 200, 25, true);
		HWindow hw1 = new HWindow("MAIN_GUI_WINDOW", 1200, 800, 60);
		hw1.addGUIComponent(hf);
		subHF.setColor(new Color(255, 0, 0));
		hf.addSubComponent(subHF);
		hw1.addGUIComponent(hf2);
		hw1.addGUIComponent(htl);

		HWindow hw2 = new HWindow("SUB_GUI_WINDOW", 500, 400, 60);
		hw2.addGUIComponent(new HFrame(30, 20, 100, 100, true));
		hw2.addGUIComponent(hf2);
		
		Logger.log(htl.getRecursiveNormalSnakeUpperClassName());
		
		//HWindow hw2 = new HWindow("SUB_GUI_WINDOW",400, 500, 60);
		//hw2.addGUIComponent(new HFrame(100, 100, 100, 50));
		
		//HWindow hw3 = new HWindow("SUB_GUI_WINDOW_2",200, 100, 60);
		//hw3.addGUIComponent(new HFrame(12, 18, 50, 30));
		
	}
}
