package main;

import java.util.ArrayList;
import java.util.Comparator;

public class Expression {
	private ArrayList<Terme> termes;


	public Expression(ArrayList<Terme> termes) {
		this.termes = termes;
	}
	
	public Expression() {
		this.termes = new ArrayList<Terme>();
	}
	
	public Expression reduce() {
		for(int i = 0;i < termes.size();i++) {
			if(termes.get(i).getCoef() == 0) {
				termes.remove(i);
				break;
			}
			Terme current = termes.get(i);
			for(int j = 0;j < termes.size();j++) {
				Terme previous = termes.get(j);
				if(i != j) {
					if(current.getVariable() == previous.getVariable() && current.getExponent() == previous.getExponent()) {
						termes.add(Terme.add(termes.get(i),termes.get(j)));
						termes.remove(current);
						termes.remove(previous);
						reduce();
						break;
					}
				}
			}
		}
		termes.sort(new Comparator<Terme>() {
			public int compare(Terme t1, Terme t2) {
				return (int)(t2.getExponent() - t1.getExponent());
			}
		});
		return this;
	}
	
	public static Expression add(Expression e1,Expression e2) {
		Expression result = new Expression();
		for(Terme te1 : e1.termes) {
			for(Terme te2 : e2.termes) {
				if(te1.getVariable() == te2.getVariable() && te1.getExponent() == te2.getExponent()) {
					result.termes.add(Terme.add(te1, te2));
				}
			}
		}
		return result.reduce();
	}
	
	public String toString() {
		reduce();
		String result = "";
		for(int i = 0;i < termes.size();i++) {
			result += termes.get(i).toString();
			if(i < termes.size() - 1)
				result += (termes.get(i).getCoef() < 0)?" - ":" + ";
		}
		return result;
	}
	
	public ArrayList<Terme> getTermes() {return termes;}
	public void setTermes(ArrayList<Terme> termes) {this.termes = termes;}
}
