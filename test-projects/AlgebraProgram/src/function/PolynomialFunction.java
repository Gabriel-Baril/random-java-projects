package function;

import java.util.ArrayList;
import java.util.Collection;

import utilities.LongDivision;

public class PolynomialFunction extends Function
{
	public double[] data;
	 
	public PolynomialFunction(double[] data)
	{
		this.data = data;
	}
	
	public static double NewtonRaphson(double guess,Function function,double oldGuess,int timeTry)
	{
		if(timeTry > 200){
			return Double.MAX_VALUE;
		}
		if(Math.abs(guess - oldGuess) < 0.000000000001){
			return guess;
		}else{
			timeTry++;
			return NewtonRaphson(guess - (function.y(guess)/function.Derivee().y(guess)),function,guess,timeTry);
		}
	}
	
	public ArrayList<Double> roots()
	{
		ArrayList<Double> al_roots = new ArrayList<Double>();
		double[] current = this.data;
		
		while(current.length > 1)
		{
			double temp_root = PolynomialFunction.NewtonRaphson(10, new PolynomialFunction(current), 0, 0);
			if(temp_root != Double.MAX_VALUE)
			{
				al_roots.add(temp_root);
				double[] temp_divisor = {1,-temp_root};
				current = (new LongDivision(current, temp_divisor)).result;
			} else break;
		}
		
		return al_roots;
	}
	
	public void print()
	{
		for(int i = 0;i < data.length;i++)
		{
			System.out.print(data[i] + "x^" + (data.length - i - 1) + " + ");
		}
		System.out.println();
	}
	
	public Function Derivee()
	{
		double[] output = new double[data.length];
		for(int i = 0;i < data.length - 1;i++) 
			output[i + 1] = data[i] * (data.length - i - 1);
		return new PolynomialFunction(LongDivision.clearPolynomialData(output));
	}
	
	public int getDegree()
	{
		return data.length;
	}

	public double y(double x) {
		double value = 0;
		for(int i = 0;i < data.length;i++)
			value += data[i]*Math.pow(x,data.length - i - 1);
		return value;
	}
}