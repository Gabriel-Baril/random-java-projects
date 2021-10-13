package components.style.converter;

public class PicasConverter implements UnitLengthConvertable
{
	public static final double PICAS_TO_MILLIMETER_FACTOR = 4.233333333d;
	public static final double PICAS_TO_CENTIMETER_FACTOR = 0.423333333d;
	public static final double PICAS_TO_INCHE_FACTOR = 0.166666667d;
	public static final double PICAS_TO_PIXEL_FACTOR = 16d;
	public static final double PICAS_TO_POINT_FACTOR = 12d;
	
	@Override
	public double convertToMillimeters(double value) {
		return value * PICAS_TO_MILLIMETER_FACTOR;
	}

	@Override
	public double convertToCentimeters(double value) {
		return value * PICAS_TO_CENTIMETER_FACTOR;
	}

	@Override
	public double convertToInches(double value) {
		return value * PICAS_TO_INCHE_FACTOR;
	}

	@Override
	public double convertToPixels(double value) {
		return value * PICAS_TO_PIXEL_FACTOR;
	}

	@Override
	public double convertToPoints(double value) {
		return value * PICAS_TO_POINT_FACTOR;
	}

	@Override
	public double convertToPicas(double value) {
		return value;
	}
}
