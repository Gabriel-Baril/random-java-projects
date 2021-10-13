package algebra;

import java.util.ArrayList;

import algebra.connector.Connector;
import algebra.term.Term;

public class Expression 
{
	ArrayList<Term> terms;
	ArrayList<Connector> connectors;
	
	public Expression(ArrayList<Term> terms,ArrayList<Connector> connectors)
	{
		this.terms = terms;
		this.connectors = connectors;
	}
	
	public String print()
	{
		String output = "";
		for(int i = 0;i < terms.size();i++)
		{
			if(i > 0) output += connectors.get(i - 1).print();
			output += terms.get(i).print();
		}
		System.out.println(output);
		return output;
	}
	
	public ArrayList<Term> getTerm()
	{
		return this.terms;
	}
	
	public ArrayList<Connector> getConnector()
	{
		return this.connectors;
	}
}
