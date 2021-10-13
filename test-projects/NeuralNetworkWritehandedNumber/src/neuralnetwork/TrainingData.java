package neuralnetwork;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TrainingData
{
	public BufferedImage image;
	public double[] gray_scale_pixels;
	public double[] answers;
	// 19
	public TrainingData(String path_image)
	{
		try 
		{
			this.image = ImageIO.read(new File(path_image));
		} 
		catch (IOException e) { e.printStackTrace(); }
		
		this.gray_scale_pixels = new double[image.getWidth()*image.getHeight()];
		for(int i = 0;i < image.getWidth();i++)
		{
			for(int j = 0;j < image.getHeight();j++)
			{
				gray_scale_pixels[i*image.getWidth() + j] = ((image.getRGB(i, j) >> 16) & 0xff) / (double)255;
			}	
		}
		answers = new double[10];
		for(int i = 0;i < answers.length;i++)
		{
			answers[i] = (Character.getNumericValue(path_image.charAt(19)) == i) ? 1 : 0;
		}
	}
}
