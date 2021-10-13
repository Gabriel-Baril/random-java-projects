package utilities;

import java.util.ArrayList;

public class Utilities {
	private Utilities() {}
	
	public static double min(double[] data)
	{
		double min = data[0];
		for(int i = 0;i < data.length;i++)
		{
			if(data[i] < min)
			{
				min = data[i];
			}
		}
		return min;
	}
	
	public static double max(double[] data)
	{
		double max = data[0];
		for(int i = 0;i < data.length;i++)
		{
			if(data[i] > max)
			{
				max = data[i];
			}
		}
		return max;
	}
	
	public static double min(ArrayList<Double> data)
	{
		double min = data.get(0);
		for(int i = 0;i < data.size();i++)
		{
			if(data.get(i) < min)
			{
				min = data.get(i);
			}
		}
		return min;
	}
	
	public static double max(ArrayList<Double> data)
	{
		double max = data.get(0);
		for(int i = 0;i < data.size();i++)
		{
			if(data.get(i) > max)
			{
				max = data.get(i);
			}
		}
		return max;
	}
	
	public static void printArray(double[] data)
	{
		System.out.print("[");
		for(int i = 0;i < data.length;i++)
		{
			if(i < data.length - 1)
				System.out.print(data[i] + ",");
			else
				System.out.print(data[i]);
		}
		System.out.println("]");
	}
}
