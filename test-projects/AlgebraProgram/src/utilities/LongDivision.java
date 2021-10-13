package utilities;

public class LongDivision {
	public double[] divided;
	public double[] divisor;
	public double[] result;
	public double[] rest;
	public double[][] history;
	
	// Divided must be of higher degree that the divisor
	public LongDivision(double[] divided,double[] divisor)
	{
		this.divided = clearPolynomialData(divided);
		this.divisor = clearPolynomialData(divisor);
		double[] output = new double[divided.length - divisor.length + 1];
		double[] toSubstract = new double[divided.length];
		for(int i = 0;i < output.length;i++)
		{
			double multiplier = divided[0]/divisor[0];
			int multiplier_exponent = divided.length - divisor.length;
			toSubstract = new double[divided.length];
			for(int j = 0;j < divisor.length;j++)
			{
				int divisor_exponent = divisor.length - j - 1;
				toSubstract[divided.length - 1 - ( divisor_exponent + multiplier_exponent ) ] = multiplier*divisor[j];
			}

			divided = clearPolynomialData(polySub(divided,toSubstract));
			output[i] = multiplier;
		}
		this.rest = divided;
		this.result = clearPolynomialData(output);
	}
	
	public static double[] polySub(double[] substracted,double[] substracter)
	{
		double[] output = new double[substracted.length];
		for(int i = 0;i < substracted.length;i++) 
			output[i] = substracted[i] - substracter[i];
		return output;
	}
	
	public static double[] clearPolynomialData(double[] data)
	{
		int inc = 0;
		for(int i = 0;i < data.length;i++)
		{
			if(data[i] == 0) 
				inc++;
			else 
				break;
		}
		double[] output = new double[data.length - inc];
		for(int i = inc;i < data.length;i++)
			output[i - inc] = data[i];
		return output;
	}
}
