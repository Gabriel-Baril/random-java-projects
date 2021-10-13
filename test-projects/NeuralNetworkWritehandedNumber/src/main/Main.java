package main;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import neuralnetwork.Matrix;
import neuralnetwork.NeuralNetwork;
import neuralnetwork.TrainingData;

public class Main {
	public static int indexOfMax(double[] arr)
	{
		double max = arr[0];
		int index = 0;
		for(int i = 1;i < arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i]; 
				index = i;
			}
		}
		return index;
	}
	
	public static int indexOfMax(double[][] arr)
	{
		double max = arr[0][0];
		int index = 0;
		for(int i = 1;i < arr.length;i++)
		{
			if(arr[i][0] > max)
			{
				max = arr[i][0]; 
				index = i;
			}
		}
		return index;
	}
	
	public static int randInt(int min,int max)
	{
		return new Random().nextInt((max-min) + 1) + min;
	}
	
	public static TrainingData[] createBatch(int size,String root)
	{
		TrainingData[] batch = new TrainingData[size];
		for(int i = 0;i < size;i++)
		{
			int f_layer = randInt(0,9);
			batch[i] = new TrainingData("mnist_png/" + root + "/" + f_layer + "/_ (" + randInt(1,new File("mnist_png/" + root + "/" + f_layer).listFiles().length - 1) + ").png");
		}
		return batch;
	}
	
	public static void main(String[] args)
	{
		long before = System.currentTimeMillis();
		
		int[] layers_s = {784,16,16,10};
		NeuralNetwork nn = new NeuralNetwork(layers_s,0.5,16);
		
		nn.run(25, 100);
		
		//System.out.println(System.currentTimeMillis() - before);
	}
}
