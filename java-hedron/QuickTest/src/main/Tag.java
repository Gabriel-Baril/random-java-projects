package main;

import java.util.HashMap;

public class Tag
{
	private final TagParser DEFAULT_TAG_PARSER = new TagParser();
	
	private final String fullTag;
	private final String name;
	private final TagType type;
	private final TagPriority priority;
	private final TagPosition position;
	private HashMap<String, String> properties;
	
	public Tag(String rawTag)
	{
		TagParser tagParser = DEFAULT_TAG_PARSER;
		this.fullTag = rawTag;
		this.name = tagParser.getTagName(rawTag);
		this.properties = tagParser.getTagProperties(rawTag);
		this.isOrphan = tagParser.isOrphan(rawTag);
	}
	
	public Tag(Tag copy)
	{
		this.fullTag = copy.fullTag;
		this.name = copy.name;
		this.isOrphan = copy.isOrphan;
		this.properties = new HashMap<String, String>(copy.properties);
	}
	
	public int getPropertyCount()
	{
		return this.properties.size();
	}
	
	public void addProperty(String key, String value)
	{
		this.properties.put(key, value);
	}
	
	public String getPropertyValue(String propertyName)
	{
		return this.properties.get(propertyName);
	}
	
	public String getFullTag() { return this.fullTag; }
	public String getTagName() { return this.name; }
	public boolean isOrphan() { return this.isOrphan; }
}
