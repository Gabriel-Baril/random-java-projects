package pratClass;

public class A {
	private int att1;
	private String att2;
	
	public A(int att1 ,String att2){
		this.att1 = att1;
		this.att2 = att2;
	}
	
	class C{
		private int nb = 13;
		public C(){
			System.out.println("att1 vaut : " + att1 + " --- att2 vaut : " + att2);
		}
	}
}
