package database;

import java.util.ArrayList;

public class DataBase {
	private byte layer_depth_size;
	private ArrayList<ArrayList<LayerData>> layers_data;
	
	public DataBase(byte layer_depth_size)
	{
		this.layer_depth_size = layer_depth_size;
		this.layers_data = new ArrayList<ArrayList<LayerData>>();
		constructLayer();
	}
	
	private void constructLayer()
	{
		int number_data_unit = 1;
		for(int i = 0;i < this.layer_depth_size;i++)
		{
			int c_layer_index = 0;
			for(int j = 0;j < Math.pow(LayerData.LAYER_SIZE,i);j++)
			{
				if(j % LayerData.LAYER_SIZE == 0) c_layer_index++;
			}
		}
	}
	
	public byte getLayerDepthSize() { return layer_depth_size; }
	public ArrayList<ArrayList<LayerData>> getLayersData() { return layers_data; }
}
