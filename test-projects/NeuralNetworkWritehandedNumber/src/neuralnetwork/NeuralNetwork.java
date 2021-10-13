package neuralnetwork;

import main.FillMode;
import main.Main;

public class NeuralNetwork {
	public int[] layers_size;
	public Matrix[] weights;
	public Matrix[] biases;
	public double learning_rate;
	public int batch_size;
 		
	
	public NeuralNetwork(int[] layers_size,double learning_rate,int batch_size)
	{
		this.learning_rate = learning_rate;
		this.batch_size = batch_size;
		this.layers_size = layers_size;
		this.weights = new Matrix[layers_size.length-1];
		this.biases = new Matrix[layers_size.length-1];
		for(int i = 1;i < layers_size.length;i++)
		{
			this.biases[i-1] = new Matrix(layers_size[i],1,-3,3);
			this.weights[i-1] = new Matrix(layers_size[i],layers_size[i-1],-1,1);
		}
	}
	
	
	public void run(int learning_batch_size,int testing_batch_size)
	{
		for(int i = 0;i < learning_batch_size;i++)
		{
			adjust(learn(Main.createBatch(this.batch_size, "training")));
			System.out.println("Learning step : " + i + "/" + learning_batch_size + " completed");
		}
		
		System.out.println();
		
		TrainingData[] td;
		int total = 0;
		int good_answer = 0;
		for(int i = 0;i < testing_batch_size;i++)
		{
			td = Main.createBatch(this.batch_size, "testing_");
			for(int j = 0;j < td.length;j++)
			{
				Pair<Matrix, Matrix> result = predict(td[j].gray_scale_pixels);
				if(Main.indexOfMax(result.obj_1[result.obj_1.length - 1].data) == Main.indexOfMax(td[j].answers))
					good_answer++;
				
				System.out.println(good_answer + "/" + total + " good answer(s) (" + ((double)good_answer/(double)total) + ") cost : (" + this.cost(result.obj_1[result.obj_1.length - 1].data, td[j].answers) + ")");
				total++;
			}
		}
	}
	
	public void adjust(Matrix[] data)
	{
		for(int i = 0;i < data.length;i++)
		{
			this.weights[i] = Matrix.matadd(this.weights[i].data, data[i].data);
		}
	}
	
	public Matrix[] learn(TrainingData[] data)
	{
		Pair<Matrix,Matrix> result = predict(data[0].gray_scale_pixels);
		Matrix[] avg_grad = this.gradient(result.obj_1, result.obj_2,data[0].answers);
		Matrix[] output = new Matrix[avg_grad.length];
		Matrix[] grad;
		for(int i = 1;i < data.length;i++)
		{
			result = predict(data[i].gray_scale_pixels);
			grad = this.gradient(result.obj_1, result.obj_2,data[0].answers);
			for(int j = 0;j < avg_grad.length;j++)
			{
				avg_grad[j] = Matrix.matadd(grad[j].data, avg_grad[j].data);
			}
		}
		
		for(int i = 0;i < avg_grad.length;i++)
		{
			output[i] = Matrix.matmul(-this.learning_rate, Matrix.matdiv(avg_grad[i], data.length));
		}
		
		return output;
	}
	
	public Pair<Matrix, Matrix> predict(double[] inputs)
	{
		double[][] output = new double[inputs.length][1];
		for(int i = 0;i < inputs.length;i++)
		{
			output[i][0] = inputs[i];
		}
		Matrix[] temp = new Matrix[this.layers_size.length];
		Matrix[] sums = new Matrix[this.layers_size.length - 1];
		temp[0] = new Matrix(output);
		for(int i = 1;i < this.layers_size.length;i++)
		{
			//temp[i] = Matrix.matadd(Matrix.matmul(this.weights[i-1].data,output).data, this.biases[i-1].data);
			temp[i] = Matrix.matmul(this.weights[i-1].data,output);
			
			for(int j = 0;j < temp[i].rows;j++)
			{
				sums[i-1] = new Matrix(temp[i].rows,1,FillMode.ZEROS);
				sums[i-1].data[j][0] = temp[i].data[j][0];
				temp[i].data[j][0] = sigmoid(temp[i].data[j][0]);
			}
			output = temp[i].data;
		}
		return new Pair<Matrix,Matrix>(temp,sums);
//		double[] d_out = {0,1,0,0};
//		double[] result = new double[layers_size[layers_size.length-1]];
//		for(int i = 0;i < result.length;i++)
//		{
//			result[i] = temp[temp.length-1].data[i][0];
//		}
//		System.out.println("The cost of this prediction is  : " + this.cost(result, d_out));
	}
	
	public double cost(double[][] result,double[] desired_result) throws IllegalArgumentException
	{
		if(result.length != desired_result.length)
			throw new IllegalArgumentException("You need to have the same number of result and desired result");
		
		double sum = 0;
		for(int i = 0;i < result.length;i++)
		{
			sum += (result[i][0] - desired_result[i])*(result[i][0] - desired_result[i]);
		}
		return sum;
	}
	
	public Matrix[] gradient(Matrix[] guess,Matrix[] sums,double[] desired_results)
	{
		Matrix[] grad = new Matrix[this.weights.length]; 
		for(int i = 1;i < layers_size.length;i++)
		{
			grad[i-1] = new Matrix(this.weights[i-1].rows,this.weights[i-1].columns,FillMode.ZEROS);
			for(int j = 0;j < this.weights[i-1].rows;j++)
			{
				for(int k = 0;k < this.weights[i-1].columns;k++)
				{
					grad[i-1].data[j][k] = guess[i-1].data[k][0]*sigmoid_derivative(sums[i-1].data[j][0])*a_derivative(i,j,k,guess,desired_results,sums);
				}	
			}
		}
		return grad;
	}
	
	// l = layer
	// j = index_current_layer
	// k = index_previous_layer
	private double a_derivative(int l, int j,int k,Matrix[] guesses,double[] desired_results,Matrix[] sums)
	{
		if(l >= this.layers_size.length - 1)
		{
			return 2*(guesses[l].data[j][0] - desired_results[j]);
		}
		else
		{
			double sum = 0;
			for(int i = 0;i < layers_size[l+1];i++)
			{
				sum += this.weights[l].data[i][j]*sigmoid_derivative(sums[l].data[i][0])*a_derivative(l+1,i,j,guesses,desired_results,sums);
			}
			return sum;
		}
	}
	
	public static double sigmoid(double x)
	{
		return 1/(1 + Math.pow(Math.E,-x));
	}
	
	public static double sigmoid_derivative(double x)
	{
		return sigmoid(x)*(1 - sigmoid(x));
	}
	
	private class Pair<T1,T2>
	{
		public T1[] obj_1;
		public T2[] obj_2;
		
		public Pair(T1[] obj_1,T2[] obj_2)
		{
			this.obj_1 = obj_1;
			this.obj_2 = obj_2;
		}
	}
}
