package main;

public class TagNormalizer
{	
	public TagNormalizer() { }
	
	public String normalizeTag(String rawTag)
	{
		
		
		
		return rawTag;
	}
	
	// ["</", "<!", "<"], ["/>", ">"]
	public String getOpeningSequence(String rawTag)
	{
		if(rawTag.length() == 0)
			return null;
		String startDelimiter = LayoutResources.DEFAULT_TAG_OPENING_SEQUENCE;
		CharIndex currentCharIndex = getNextChar(rawTag, 0);
		if(currentCharIndex.ch != '<')
			throw new IncompleteTagFragmentException();
		currentCharIndex = getNextChar(rawTag, currentCharIndex.pos + 1);
		while(currentCharIndex.pos != -1)
		{
			if(charIndex.ch == '<')
			{
				startDelimiter += charIndex.ch;
			}
			charIndex = getNextChar(rawTag, charIndex.pos);
		}
		return startDelimiter;
	}
	
	public String getEndDelimiter(String rawTag)
	{
		String endDelimiter = "";
		
		return endDelimiter;
	}
	
	public String fitWith(String str,String[] toFit)
	{
		for(String fit : toFit)
		{
			if(str.indexOf(fit) != -1)
			{
				return fit;
			}
		}
		return null;
	}
	
	public CharIndex getNextChar(String str, int pos)
	{
		for(int i = pos; i < str.length(); i++)
		{
			if(str.charAt(i) > 32)
			{
				return new CharIndex(str.charAt(i), i);
			}
		}
		return new CharIndex(' ', -1);
	}
}
