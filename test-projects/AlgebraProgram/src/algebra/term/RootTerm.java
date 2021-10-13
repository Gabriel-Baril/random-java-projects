package algebra.term;

import java.util.ArrayList;

import algebra.Expression;
import algebra.connector.Connector;

public class RootTerm extends Term
{
	Expression inside;
	double n_root;

	public RootTerm(ArrayList<Term> terms,ArrayList<Connector> connectors,double exponent,double n_root) {
		super(exponent);
		this.inside = new Expression(terms,connectors);
		this.n_root = n_root;
	}

	@Override
	public String print() {
		String output = "";
		if(exponent == 0) return "1";
		if(exponent != 1) output += "(";
		output += ( (n_root == Math.floor((int)n_root)) ? Integer.toString((int)n_root) : n_root) + "_root(";
		ArrayList<Term> terms = inside.getTerm();
		for(int i = 0;i < terms.size();i++)
		{
			if(i > 0) output += inside.getConnector().get(i - 1).print();
			output += terms.get(i).print();
		}
		output += ")";
		if(exponent != 1) output += ")^" + ( (exponent == Math.floor(exponent) ? Integer.toString((int)exponent) : exponent) );
		return output;
	}

	@Override
	public String getType() {
		return "Log";
	}
}
