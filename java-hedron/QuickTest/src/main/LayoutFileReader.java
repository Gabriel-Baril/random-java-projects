package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LayoutFileReader
{
	private static final char OPENING_SEQUENCE = '<';
	private static final char CLOSING_SEQUENCE = '>';
	private static final int ASCII_WHITESPACE_CHARACTER_DELIMITER = 32;
	
	private Scanner reader;
	private String currentLine;
	private int position;
	private boolean hasNextLine;
	
	
	public LayoutFileReader(String filePath)
	{
		try {
			reader = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.hasNextLine = true;
	}
	
	public String nextTag()
	{
		boolean openingFound = false;
		boolean closingFound = false;
		StringBuilder tag = new StringBuilder();
		char lastChar = ' ';
		while(!openingFound || !closingFound)
		{
			if(currentLine == null || position >= currentLine.length())
			{
				nextLine();
			}
			if(position == -1) return "";
				
			char currentChar = currentLine.charAt(position);
			position++;
			
			if(currentChar <= ASCII_WHITESPACE_CHARACTER_DELIMITER)
			{
				currentChar = ' ';
			}
			
			if(currentChar > ASCII_WHITESPACE_CHARACTER_DELIMITER || lastChar > ASCII_WHITESPACE_CHARACTER_DELIMITER)
			{
				tag.append(currentChar);
				if(currentChar == OPENING_SEQUENCE) 
				{
					openingFound = true;
					tag.append(' ');
				}
				else if(currentChar == CLOSING_SEQUENCE)
					closingFound = true;
			}
			lastChar = currentChar;
		}
		
		for(int i = 1;i < tag.length() - 1;i++)
		{
			if(tag.charAt(i) == '\"' &&
			   tag.charAt(i - 1) != '=' &&
			   tag.charAt(i + 1) != ' ')
			{
				tag.insert(i + 1, ' ');
				i++;
			}
		}
		return new String(tag);
	}
	
	public Tag nextTag2()
	{
		StringBuilder rawTag = nextRawTag();
		return new Tag(new String(rawTag));
	}
	
	private StringBuilder nextRawTag()
	{
		boolean openingFound = false;
		boolean closingFound = false;
		char currentChar;
		StringBuilder tag = new StringBuilder();
		while(!openingFound || !closingFound)
		{
			manageLine();
			validateHasNextLine();
			currentChar = currentLine.charAt(position);
			if(currentChar == OPENING_SEQUENCE) openingFound = true;
			else if(currentChar == CLOSING_SEQUENCE) closingFound = true;
			if(openingFound) tag.append(currentChar);
			position++;
		}
		return tag;
	}
	
	private void validateHasNextLine()
	{
		if(!hasNextLine)
			throw new IncompleteTagFragmentException();
	}
	
	private void manageLine()
	{
		if(currentLine == null || 
		   position >= currentLine.length() ||
		   currentLine.equals(""))
		{
			nextLine();
		}
	}
	
	private void nextLine()
	{
		if(reader.hasNextLine())
		{
			currentLine = reader.nextLine();
			position = 0;
		}
		else
		{
			hasNextLine = false;
			position = -1;
		}
	}
	
	public void close()
	{
		reader.close();
	}
}
