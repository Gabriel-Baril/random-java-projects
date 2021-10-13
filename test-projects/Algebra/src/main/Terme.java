package main;

public class Terme{
	public boolean IS_NULL = false; // When the coef is 0
	public boolean IS_EXPONENT_ZERO = false; // When the exponent is 0
	
	private double coef;
	private char variable;
	private double exponent;

	public Terme(double coef,char variable,double exponent){
		if(coef == 0) {
			IS_NULL = true;
		}else {
			if(exponent == 0) {
				IS_EXPONENT_ZERO = true;
			}
		}
		this.coef = coef;
		this.variable = variable;
		this.exponent = exponent;
	}
	
	public Terme(Terme copy) {
		this.coef = copy.coef;
		this.variable = copy.variable;
		this.exponent = copy.exponent;
	}

	public static Terme add(Terme t1,Terme t2){
	  if(t1.variable == t2.variable && t1.exponent == t2.exponent)
	    return new Terme(t1.coef + t2.coef,t1.variable,t1.exponent);
	  return null;
	}
	
	public String toString() {
		if(IS_NULL)
			return "" + 0;
		if(IS_EXPONENT_ZERO)
			return "" + coef;
		if(coef == 1 && exponent == 1)
			return "" + variable; 
		if(coef == 1)
			return variable + "^" + exponent;
		if(exponent == 1)
			return coef + "" + variable;
		return coef + "" + variable + "^" + exponent; 
	}


	public double getCoef() {return coef;}
	public void setCoef(double coef) {this.coef = coef;}
	public char getVariable() {return variable;}
	public void setVariable(char variable) {this.variable = variable;}
	public double getExponent() {return exponent;}
	public void setExponent(double exponent) {this.exponent = exponent;}
}
