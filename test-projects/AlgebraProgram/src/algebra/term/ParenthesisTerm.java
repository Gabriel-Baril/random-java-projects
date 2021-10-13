package algebra.term;

import java.util.ArrayList;

import algebra.Expression;
import algebra.connector.Connector;

public class ParenthesisTerm extends Term{
	Expression inside;
	
	public ParenthesisTerm(ArrayList<Term> terms,ArrayList<Connector> connectors,double exponent)
	{
		super(exponent);
		this.inside = new Expression(terms,connectors);
	}
	
	@Override
	public String print() {
		if(exponent == 0) return "1";
		String output = "(";
		ArrayList<Term> terms = inside.getTerm();
		for(int i = 0;i < terms.size();i++)
		{
			if(i > 0) output += inside.getConnector().get(i - 1).print();
			output += terms.get(i).print();
		}
		output += ")";
		if(exponent != 1) output += "^" + ( (exponent == Math.floor(exponent)) ? Integer.toString((int)exponent) : exponent);
		return output;
	}

	@Override
	public String getType() {
		return "Parenthesis";
	}
}
