package utilities;

public class Interval {
	private double min;
	private double max;
	private boolean right_boundary_open;
	private boolean left_boundary_open;
	
	public Interval(double min,double max,boolean lbo,boolean rbo) {
		if(max < min) 
		{
			double temp = min;
			min = max;
			max = temp;
		}
		this.setMin(min);
		this.setMax(max);
		this.left_boundary_open = lbo;
		this.right_boundary_open = rbo;
	}
	
	public String toString() {
		if(min == Double.MIN_VALUE && max == Double.MAX_VALUE) return "-infinity,infinity";
		else if(min == Double.MIN_VALUE) 					   return " -infinity" + "," + max + ( right_boundary_open ? "[" : "]" );
		else if(max == Double.MAX_VALUE) 					   return ( left_boundary_open ? "]" : "[" ) + min + "," + "infinity";
		else 												   return ( left_boundary_open ? "]" : "[" ) + min + "," + max + ( right_boundary_open ? "[" : "]" );
	}

	public double getMin() {return min;}
	public void setMin(double min) {this.min = min;}
	public double getMax() {return max;}
	public void setMax(double max) {this.max = max;}
	
	public boolean getRightBoundary() {return this.right_boundary_open;}
	public void setRightBoundary(boolean rbo) {this.right_boundary_open = rbo;}
	public boolean getLeftBoundary() {return this.left_boundary_open;}
	public void setLeftBoundary(boolean lbo) {this.left_boundary_open = lbo;} 
}

