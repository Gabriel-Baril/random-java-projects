package cercle;

public class Methode {
	public double CalculCercleDiam(double rayon) {
		double diametre;
		diametre = rayon * 2;

		return diametre;
	}

	public double CalculCercleCircon(double rayon) {
		double diametre;
		double circonference;
		diametre = rayon * 2;
		circonference = diametre * Math.PI;

		return circonference;
	}

	public double CalculCercleAire(double rayon) {
		double rayonCarre = rayon * rayon;
		double aire = Math.PI * rayonCarre;

		return aire;
	}

	public double CalculSphereAire(double rayon) {
		double rayonCarre = rayon * rayon;
		double aireSphere = 4 * Math.PI * rayonCarre;

		return aireSphere;
	}
	
	public double CalculSphereVolume(double rayon) {
		double rayonCube = rayon * rayon * rayon;
		double volumeSphere = (4 * Math.PI * rayonCube)/3;

		return volumeSphere;
	}

}
