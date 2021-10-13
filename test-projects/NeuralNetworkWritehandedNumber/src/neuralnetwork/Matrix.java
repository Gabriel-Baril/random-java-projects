package neuralnetwork;

import main.FillMode;

public class Matrix {
	public double data[][];
	public int rows;
	public int columns;
	
	public Matrix(int rows,int columns, FillMode mode)
	{
		this.rows = rows;
		this.columns = columns;
		this.data = new double[rows][columns];
		
		if(mode == FillMode.RANDOM)
		{
			for(int i = 0;i < rows;i++)
			{
				for(int j = 0;j < columns;j++)
				{
					this.data[i][j] = Math.random();
				}
			}
		}
	}
	
	public Matrix(int rows,int columns, double fillNumberMin, double fillNumberMax)
	{
		this.rows = rows;
		this.columns = columns;
		this.data = new double[rows][columns];
		for(int i = 0;i < rows;i++)
		{
			for(int j = 0;j < columns;j++)
			{
				this.data[i][j] = fillNumberMin + (fillNumberMax - fillNumberMin) * Math.random();
			}
		}
	}
	
	public Matrix(double data[][])
	{
		this.rows = data.length;
		this.columns = data[0].length;
		this.data = data;
	}
	
	public static Matrix matadd(double[][] m1,double[][] m2)
	{
		if(m1.length != m2.length || m1[0].length != m2[0].length)
			throw new IllegalArgumentException("The two matrices must be of the same size");
		
		double[][] output = new double[m1.length][m1[0].length];
		
		for(int i = 0;i < m1.length;i++)
		{
			for(int j = 0;j < m1[0].length;j++)
			{
				output[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		return new Matrix(output);
	}
	
	public static Matrix matmul(Matrix m1,Matrix m2) throws IllegalArgumentException
	{
		if(m1.columns != m2.rows)
			throw new IllegalArgumentException("The numbers of rows of the first matrix must be the same of the number of column of the second matrix");
		
		
		double[][] data_output = new double[m1.rows][m2.columns];
		
		for(int i = 0;i < m1.rows;i++)
		{
			for(int j = 0;j < m2.columns;j++)
			{
				for(int k = 0;k < m2.rows;k++)
				{
					data_output[i][j] += m1.data[i][k]*m2.data[k][j];
				}
			}
		}
		
		return new Matrix(data_output);
	}
	
	public static Matrix matmul(double[][] m1,double[][] m2) throws IllegalArgumentException
	{
		if(m1[0].length != m2.length)
			throw new IllegalArgumentException("The numbers of rows of the first matrix must be the same of the number of column of the second matrix : " + m1.length + " != " + m2[0].length);
		double[][] data_output = new double[m1.length][m2[0].length];
		
		for(int i = 0;i < m1.length;i++)
		{
			for(int j = 0;j < m2[0].length;j++)
			{
				for(int k = 0;k < m2.length;k++)
				{
					data_output[i][j] += m1[i][k]*m2[k][j];
				}
			}
		}
		return new Matrix(data_output);
	}
	
	public static Matrix matmul(double lambda,Matrix mat)
	{
		Matrix output = new Matrix(mat.rows,mat.columns,FillMode.ZEROS);
		for(int i = 0;i < mat.rows;i++)
		{
			for(int j = 0;j < mat.columns;j++)
			{
				output.data[i][j] = lambda*mat.data[i][j];
			}
		}
		return output;
	}
	
	
	public static Matrix matdiv(Matrix mat,double lambda)
	{
		Matrix output = new Matrix(mat.rows,mat.columns,FillMode.ZEROS);
		for(int i = 0;i < mat.rows;i++)
		{
			for(int j = 0;j < mat.columns;j++)
			{
				output.data[i][j] = mat.data[i][j]/lambda;
			}
		}
		return output;
	}
	
	public void print()
	{
		for(int i = 0;i < this.rows;i++)
		{
			System.out.print("[");
			for(int j = 0;j < this.columns;j++)
			{
				System.out.print(data[i][j] + ((j == this.columns - 1) ? "" : ","));
			}
			System.out.println("]");
		}
	}
}
