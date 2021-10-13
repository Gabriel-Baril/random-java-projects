package database;

import java.util.ArrayList;

public class LayerData {
	public static final byte LAYER_SIZE = 26;
	private ArrayList<DataBaseData> data;
	
	public LayerData()
	{
		data = new ArrayList<DataBaseData>();
		for(int i = 0;i < LAYER_SIZE;i++)
		{
			data.add( new DataBaseData( (char)(97 + i) ) );
		}
	}
	
	public ArrayList<DataBaseData> getData() { return this.data; }
}
