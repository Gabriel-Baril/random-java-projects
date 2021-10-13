
public class Methode {

public double PGCD(double numb1, double numb2) {
		
		double alphaNumb = (Math.max(numb1, numb2));
		double deltaNumb = (Math.min(numb1, numb2));
		double mod = 0;

		if (alphaNumb % deltaNumb == 0) {
			System.out.print("PGCD = " + deltaNumb);
		} else {

			while (alphaNumb % deltaNumb != 0) {
				mod = alphaNumb % deltaNumb;
				alphaNumb = deltaNumb;
				deltaNumb = mod;
				
			}

		}
		return mod;

	}
	
	public double PPCM(double numb1, double numb2) {
		
		double produit;
		double reste;
		double alphaNumb = (Math.max(numb1, numb2));
		double deltaNumb = (Math.min(numb1, numb2));
		double PPCM;

		produit = alphaNumb * deltaNumb;
		reste = alphaNumb % deltaNumb;
		while (reste != 0) {
			alphaNumb = deltaNumb;
			deltaNumb = reste;
			reste = alphaNumb % deltaNumb;
		}
		PPCM = produit / deltaNumb;

		

		
        return PPCM;
	}
}
