package algebra.term;

public class PolynomialTerm extends Term
{
	double coef;
	
	public PolynomialTerm(double coef,double exponent) {
		super(exponent);
		this.coef = coef;
	}

	@Override
	public String print() {
		if(exponent == 0)
			return "" + ( (Math.floor(coef) == coef) ? Integer.toString((int)coef) : coef);
		else if(exponent == 1)
			return ( (Math.floor(coef) == coef) ? Integer.toString((int)coef) : coef) + "x";
		else
			return ( (Math.floor(coef) == coef) ? Integer.toString((int)coef) : coef) + "x^" + ( (Math.floor(exponent) == exponent) ? Integer.toString((int)exponent) : exponent);
			
	}

	@Override
	public String getType() {
		return "Polynomial";
	}
}
