package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class LayoutFileParser
{
	private LayoutFileReader hedronFileReader;
	private HashMap<Integer, HierarchicalTag> tags;
	private int currentInternalId;
	
	public LayoutFileParser(String filePath)
	{
		this.hedronFileReader = new LayoutFileReader(filePath);
		this.tags = new HashMap<>();
		this.currentInternalId = -1;
		this.generateTagTree();
	}
	
	private HierarchicalTag getTagByInternalId(int internalId)
	{
		return tags.get(internalId);
	}
	
	private void generateTagTree()
	{
		Stack<Integer> parents = new Stack<Integer>();
		parents.push(-1);
		String rawTag = hedronFileReader.nextTag();
		while(!rawTag.equals(""))
		{
			Tag singleTag = new Tag(rawTag);
			currentInternalId++;
			int parentInternalId = parents.peek();
			if(!singleTag.isOrphan())
			{
				parents.push(currentInternalId);
			}
			else
			{
				if(singleTag.getPropertyCount() == 0)
				{
					parents.pop();
					parentInternalId = parents.peek();
				}
			}
			tags.put(currentInternalId, new HierarchicalTag(singleTag, currentInternalId, parentInternalId));
			rawTag = hedronFileReader.nextTag();
		}
		hedronFileReader.close();
	}
}
