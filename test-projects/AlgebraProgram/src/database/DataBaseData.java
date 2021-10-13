package database;

import java.util.ArrayList;

public class DataBaseData {
	private char access_condition;
	private ArrayList<String> data;
	
	public DataBaseData(char access_condition,ArrayList<String> data)
	{
		this.data = data;
		this.access_condition = access_condition;
	}
	
	public DataBaseData(char access_condition)
	{
		this.data = new ArrayList<String>();
		this.access_condition = access_condition;
	}
	
	public char getAccessCondition() { return this.access_condition; }
	public ArrayList<String> getData() { return this.data; }
}
