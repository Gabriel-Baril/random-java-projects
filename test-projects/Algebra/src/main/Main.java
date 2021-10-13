package main;

public class Main {
	
	public static int test(Pair<Character,Integer> p) {
		return p.getSecond();		
	}
	
	public static void main(String args[]) {
		Pair<Character,Integer> var = new Pair<>('x',4);
		//System.out.println(Main.test(var));

		Terme te1 = new Terme(5,'x',1);
		Terme te2 = new Terme(0,'x',1);
		System.out.println(Terme.add(te1, te2));
		
		Terme t1 = new Terme(3,'x',2);
		Terme t2 = new Terme(10,'x',2);
		Terme t3 = new Terme(5,'x',3);
		Terme t4 = new Terme(7,'x',2);
		Terme t5 = new Terme(3,'x',3);
		Terme t6 = new Terme(0,'x',4);
		Terme t7 = new Terme(2,'x',3);
		Terme t8 = new Terme(21,'x',5);
		
		Expression exp = new Expression();
		exp.getTermes().add(t1);
		exp.getTermes().add(t2);
		exp.getTermes().add(t3);
		exp.getTermes().add(t4);
		exp.getTermes().add(t5);
		exp.getTermes().add(t6);
		exp.getTermes().add(t7);
		exp.getTermes().add(t8);
		
		//System.out.println(exp.getTermes());
		System.out.println(exp);
	}
}
