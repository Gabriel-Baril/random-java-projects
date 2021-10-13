package components.style;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LayoutHedronFileHandler
{
	public static final String OPENING_COMPONENT_DECLARATION_TOKEN = "<";
	public static final String CLOSING_COMPONENT_DECLARATION_TOKEN = "/>";
	public static final String CHUNK_SEPARATOR_TOKEN = " ";
	public static final String PROPERTY_INITIALIZER_TOKEN = "=";
	
	String fileName;
	List<StringBuilder> normalizedLines;
	List<List<String>> chunks;
	HashMap<String, String> props;
	
	public LayoutHedronFileHandler(String fileName)
	{
		this.fileName = fileName;
		this.normalizedLines = new ArrayList<StringBuilder>();
		this.chunks = new ArrayList<>();
		this.normalizeLines();
		this.computeChunks();
	}
	
	private void normalizeLines()
	{
		try {
			File file = new File(this.fileName);  
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine())
			{
				String currentLine = reader.nextLine().trim().replaceAll(" +", " ").replaceAll("([^=])\"([^ ])", "$1\" $2");
				if(currentLine.contains(OPENING_COMPONENT_DECLARATION_TOKEN))
					normalizedLines.add(new StringBuilder(currentLine.replaceFirst(OPENING_COMPONENT_DECLARATION_TOKEN, OPENING_COMPONENT_DECLARATION_TOKEN + " ") + CHUNK_SEPARATOR_TOKEN));
				else
					normalizedLines.get(normalizedLines.size() - 1).append(currentLine + CHUNK_SEPARATOR_TOKEN);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void computeChunks()
	{
		for(int i = 0;i < normalizedLines.size();i++)
		{
			this.chunks.add(new ArrayList<String>());
			String[] lineChunk = normalizedLines.get(i).toString().split(" "); 
			for(int j = 0;j < lineChunk.length;j++)
			{
				this.chunks.get(i).add(lineChunk[j]);
			}
		}
	}
	
	public static String[] parseChunk(String chunk)
	{
		String[] data = chunk.split(PROPERTY_INITIALIZER_TOKEN);
		data[1] = data[1].replaceAll("\"", "");
		return data;
	}
	
	
	public String getChunk(int y, int x)
	{
		return chunks.get(y).get(x);
	}
}
