package components.style.converter;

public class PointConverter implements UnitLengthConvertable
{
	public static final double POINT_TO_MILLIMETER_FACTOR = 0.3527777778d;
	public static final double POINT_TO_CENTIMETER_FACTOR = 0.0352777778d;
	public static final double POINT_TO_INCHE_FACTOR = 0.013888888888889d;
	public static final double POINT_TO_PIXEL_FACTOR = 1.333333333333333d;
	public static final double POINT_TO_PICAS_FACTOR = 0.0833333333d;
	
	@Override
	public double convertToMillimeters(double value) {
		return value * POINT_TO_MILLIMETER_FACTOR;
	}

	@Override
	public double convertToCentimeters(double value) {
		return value * POINT_TO_CENTIMETER_FACTOR;
	}

	@Override
	public double convertToInches(double value) {
		return value * POINT_TO_INCHE_FACTOR;
	}

	@Override
	public double convertToPixels(double value) {
		return value * POINT_TO_PIXEL_FACTOR;
	}

	@Override
	public double convertToPoints(double value) {
		return value;
	}

	@Override
	public double convertToPicas(double value) {
		return value * POINT_TO_PICAS_FACTOR;
	}
}
