package cocktail;

public class Cocktail<E extends Liquid,U extends Liquid> {
	E solvent;
	U solute;
	
	public Cocktail(E solvent,U solute){
		this.solvent = solvent;
		this.solute = solute;
	}
}
