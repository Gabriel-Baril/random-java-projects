package mediane;

public class Test_matrice {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		boolean matrice[][] = {{f,t,f,f,f,f},
							 {f,f,f,f,f},
							 {f,f,f,f,f},
							 {f,f,f,f,f},
							 {f,f,f,f,t}};
		
		
		int i, j;
		for(i=0; i<matrice.length; i++) {
			for(j=0; j<matrice[i].length; j++) {
				System.out.println(matrice[i].length);
			}
		}
		
		}
	     	

	}


