package components.style.converter;

public enum UnitLength
{
	NONE,
	MILLIMETER,
	CENTIMETER,
	INCHE,
	PIXEL,
	POINT,
	PICAS;
	
	public String toString()
	{
		return name().charAt(0) + name().substring(1).toLowerCase();
	}
}
