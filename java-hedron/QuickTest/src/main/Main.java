package main;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		//HedronFileParser hfp = new HedronFileParser("C:\\_DEV\\_PROJECTS\\JAVA\\HedronWorkspace\\HedronGUI2\\references\\fileReadTest\\layout.txt");
		//System.out.println("END");
		
		TagNormalizer normalizer = new TagNormalizer();
		System.out.println(normalizer.getNextChar("a        	bc       defghijklmnop", 0));;
		
		//String s = "<TextField1 id=\"text_label_2\"paddingLeft   =      \"30in\"paddingTop=\"20px\" 			paddingRight=\"1cm\"   paddingBottom=\"30mm\"      marginLeft=\"3cm\" />";
		//LayoutFileReader reader = new LayoutFileReader("C:\\_DEV\\_PROJECTS\\JAVA\\HedronWorkspace\\HedronGUI2\\references\\fileReadTest\\layout.txt");
		//System.out.println(reader.nextTag2());
		//System.out.println(reader.nextTag2());
		//reader.close();
		//System.out.println(samePropName("backgroundColor", "background_color"));
	}
	
	public static boolean samePropName(String template, String toCheck)
	{
		int currentToCheckIndex = -1; 
		for(int i = 0; i < template.length(); i++)
		{
			currentToCheckIndex++;
			char currentTemplateChar = template.charAt(i);
			if(i != 0 && Character.isUpperCase(currentTemplateChar))
				currentToCheckIndex++;
			char currentToCheckChar = toCheck.charAt(currentToCheckIndex);
			if(Character.toLowerCase(currentTemplateChar) != Character.toLowerCase(currentToCheckChar))
				return false;
		}
		return true;
	}
}
