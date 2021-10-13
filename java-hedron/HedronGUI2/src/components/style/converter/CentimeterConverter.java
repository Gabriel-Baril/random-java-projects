package components.style.converter;

public class CentimeterConverter implements UnitLengthConvertable
{
	public static final double CENTIMETER_TO_MILLIMETER_FACTOR = 10d;
	public static final double CENTIMETER_TO_INCHE_FACTOR = 0.3937007874d;
	public static final double CENTIMETER_TO_PIXEL_FACTOR = 37.7952755906d;
	public static final double CENTIMETER_TO_POINT_FACTOR = 28.346456693d;
	public static final double CENTIMETER_TO_PICAS_FACTOR = 2.362204724d;

	@Override
	public double convertToMillimeters(double value) {
		return value * CENTIMETER_TO_MILLIMETER_FACTOR;
	}

	@Override
	public double convertToCentimeters(double value) {
		return value;
	}

	@Override
	public double convertToInches(double value) {
		return value * CENTIMETER_TO_INCHE_FACTOR;
	}

	@Override
	public double convertToPixels(double value) {
		return value * CENTIMETER_TO_PIXEL_FACTOR;
	}

	@Override
	public double convertToPoints(double value) {
		return value * CENTIMETER_TO_POINT_FACTOR;
	}

	@Override
	public double convertToPicas(double value) {
		return value * CENTIMETER_TO_PICAS_FACTOR;
	}
}
