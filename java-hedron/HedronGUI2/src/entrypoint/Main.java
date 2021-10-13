package entrypoint;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import components.style.LayoutHedronFileHandler;

public class Main {

	public static void main(String[] args)
	{
		LayoutHedronFileHandler lhfl = new LayoutHedronFileHandler("C:\\_DEV\\_PROJECTS\\JAVA\\HedronWorkspace\\HedronGUI2\\references\\fileReadTest\\layout.txt");
		String[] data = LayoutHedronFileHandler.parseChunk(lhfl.getChunk(0, 2));
		
		System.out.println(data[0] + " -- " + data[1]);
		
		
				
				
		//System.out.println(UnitLengthConverter.convert(100, UnitLength.PICAS, UnitLength.INCHE));
		/*
		HWindow hw2 = new HWindow("MAIN_WIN", 500, 400, 60);
		HRectTextLabel comp = new HRectTextLabel(50, 300, 100, 30);
		comp.setFont("Serif", Font.PLAIN, 32);
		comp.setContent("BONJOUR");
		hw2.addGUIComponent(comp);
		*/
	}
}
