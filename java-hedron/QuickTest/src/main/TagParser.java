package main;

import java.util.HashMap;

public class TagParser
{
	private static final TagNormalizer DEFAULT_TAG_NORMALIZER = new TagNormalizer();
	TagNormalizer tagNormalizer;
	
	public TagParser()
	{
		this.tagNormalizer = DEFAULT_TAG_NORMALIZER;
	}
	
	public TagParser(TagNormalizer tagNormalizer)
	{
		this.tagNormalizer = tagNormalizer;
	}

	public HashMap<String, String> getTagProperties(String rawTag)
	{
		HashMap<String, String> tagProperty = new HashMap<String, String>();
		for(String current : tagChunks)
		{
			int indexSeparator = current.indexOf('=');
			if(indexSeparator != -1)
			{
				tagProperty.put(current.substring(0, indexSeparator), current.substring(indexSeparator + 2, current.length() - 1));
			}
		}
		return tagProperty;
	}
	
	public String getTagName(String rawTag)
	{
		return tagChunks[1];
	}
	
	public boolean isOrphan(String rawTag)
	{
		int lastChunkIndex = this.tagChunks.length - 1;
		return this.tagChunks[lastChunkIndex].equals(LayoutResources.DEFAULT_TAG_CLOSING_SEQUENCE);
	}
}
