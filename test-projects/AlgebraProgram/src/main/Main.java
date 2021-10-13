package main;

import java.util.ArrayList;

import algebra.Expression;
import algebra.connector.Addition;
import algebra.connector.Connector;
import algebra.connector.Division;
import algebra.connector.Multiplication;
import algebra.term.LogTerm;
import algebra.term.ParenthesisTerm;
import algebra.term.PolynomialTerm;
import algebra.term.RootTerm;
import algebra.term.Term;
import database.LayerData;
import function.PolynomialFunction;
import main.window.Window;
import utilities.Interval;

public class Main
{
	public static Window window;
	public static void main(String args[])
	{
		window = new Window();
		
		LayerData ld = new LayerData();
		System.out.println(ld.getData().get(1).getAccessCondition());
		
		Interval interval = new Interval(-10,20,true,true);
		//System.out.println(interval.toString());
		double[] t1 = {1,13,-9,6,6,7,-2,3};
		double[] t2 = {1,-3,5,8,-8,10,33};
		double[] func = {1,-4,-27,34,56};
		PolynomialFunction function = new PolynomialFunction(func);
		function.analyse();
		
		ArrayList<Term> t = new ArrayList<Term>();
		ArrayList<Term> st = new ArrayList<Term>();
		ArrayList<Term> lt = new ArrayList<Term>();
		
		ArrayList<Connector> cnt_1 = new ArrayList<Connector>();
		cnt_1.add(new Multiplication());
		cnt_1.add(new Addition());

		ArrayList<Connector> cnt_2 = new ArrayList<Connector>();
		cnt_2.add(new Addition());
		
		st.add(new PolynomialTerm(4,2));
		st.add(new PolynomialTerm(2,1));
		st.add(new PolynomialTerm(8,0));
		
		RootTerm sqrtData = new RootTerm(st,cnt_1,1,3);
		lt.add(sqrtData);
		lt.add(new PolynomialTerm(8,4));
		
		t.add(sqrtData);
		t.add(new PolynomialTerm(5,3));
		t.add(new LogTerm(lt,cnt_2,2));
		t.add(new ParenthesisTerm(st,cnt_1,2));
		
		ArrayList<Connector> cnt = new ArrayList<Connector>();
		cnt.add(new Division());
		cnt.add(new Multiplication());
		cnt.add(new Addition());
		
		
		Expression expression = new Expression(t,cnt);
		
		expression.print();
	}
}
