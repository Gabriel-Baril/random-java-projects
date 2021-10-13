package components.style.converter;

public class IncheConverter implements UnitLengthConvertable
{
	public static final double INCHE_TO_MILLIMETER_FACTOR = 25.4d;
	public static final double INCHE_TO_CENTIMETER_FACTOR = 2.54d;
	public static final double INCHE_TO_PIXEL_FACTOR = 300d;
	public static final double INCHE_TO_POINT_FACTOR = 72d;
	public static final double INCHE_TO_PICAS_FACTOR = 6d;
	
	@Override
	public double convertToMillimeters(double value) {
		return value * INCHE_TO_MILLIMETER_FACTOR;
	}

	@Override
	public double convertToCentimeters(double value) {
		return value * INCHE_TO_CENTIMETER_FACTOR;
	}

	@Override
	public double convertToInches(double value) {
		return value;
	}

	@Override
	public double convertToPixels(double value) {
		return value * INCHE_TO_PIXEL_FACTOR;
	}

	@Override
	public double convertToPoints(double value) {
		return value * INCHE_TO_POINT_FACTOR;
	}

	@Override
	public double convertToPicas(double value) {
		return value * INCHE_TO_PICAS_FACTOR;
	}
}
