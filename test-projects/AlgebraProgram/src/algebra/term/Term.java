package algebra.term;

public abstract class Term {
	double exponent;
	
	public Term(double exponent)
	{
		this.exponent = exponent;
	}
	public abstract String print();
	
	public String getType()
	{
		return "Term";
	}
}
