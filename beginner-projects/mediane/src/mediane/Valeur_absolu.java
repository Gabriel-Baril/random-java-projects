package mediane;

public class Valeur_absolu {
	public static int valeur_absolu(int a,int b){
		
		int c = (a-b);
		if(c < 0){
			return -c;
		} else {
			return c;
		}
		
	}
    public static int valeur_absolu(int a){
		
		if(a < 0){
			return -a;
		} else {
			return a;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(valeur_absolu(-53));


		

	}

}
