package main;

public class HierarchicalTag
{
	private Tag tag;
	private int internalId;
	private int parentInternalId;
	
	public HierarchicalTag(Tag tag, int internalId, int parentInternalId)
	{
		this.tag = tag;//new HedronLayoutTag(tag);
		this.internalId = internalId;
		this.parentInternalId = parentInternalId;
	}
}
