package function;

import java.util.ArrayList;

import utilities.Interval;
import utilities.Utilities;

public abstract class Function
{
	public static final double dx = 0.0000001;
	
	public Function()
	{
	}
	
	protected abstract ArrayList<Double> roots();
	protected abstract Function Derivee();
	public abstract void print();
	
	public ArrayList<Interval> concaveUpInterval()
	{
		return null;
		
	}
	
	public ArrayList<Interval> concaveDownInterval()
	{
		return null;
		
	}
	
	public ArrayList<Interval> increasingInterval()
	{
		return null;
	}
	
	public ArrayList<Interval> decreasingInterval()
	{
		
		return null;
	}
	
	public final Function.Extremum extremums()
	{
		Function derivee = this.Derivee();
		ArrayList<Double> root_data = derivee.roots();
		Extremum extremum = new Extremum();
		for(int i = 0;i < root_data.size();i++)
			if(derivee.y(root_data.get(i) - dx) < 0) extremum.minimums.add(root_data.get(i));
			else 									 extremum.maximums.add(root_data.get(i));
		return extremum;
	}
	
	public final Function.Extremum globalExtremums()
	{
		Extremum extremums_data = extremums();
		return null;
	}
	
	public void analyse()
	{
		Extremum etm = extremums();
		System.out.println("Roots : " + roots());
		System.out.println("Minimums : " + etm.minimums);
		System.out.println("Maximums : " + etm.maximums);
	}
	
	public abstract double y(double x); 

	public static class Extremum
	{
		public ArrayList<Double> minimums;
		public ArrayList<Double> maximums;
		
		public Extremum()
		{
			this.minimums = new ArrayList<Double>();
			this.maximums = new ArrayList<Double>();
		}
		public Extremum(ArrayList<Double> minimums,ArrayList<Double> maximums) 
		{
			this.minimums = minimums;
			this.maximums = maximums;
		}
	}
}
