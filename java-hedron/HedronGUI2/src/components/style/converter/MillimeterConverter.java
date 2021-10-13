package components.style.converter;

public class MillimeterConverter implements UnitLengthConvertable
{
	public static final double MILLIMETER_TO_CENTIMETER_FACTOR = 0.1d;
	public static final double MILLIMETER_TO_INCHE_FACTOR = 0.03937007874d;
	public static final double MILLIMETER_TO_PIXEL_FACTOR = 3.7795275591d;
	public static final double MILLIMETER_TO_POINT_FACTOR = 2.834645669d;
	public static final double MILLIMETER_TO_PICAS_FACTOR = 0.236220472d;
	
	@Override
	public double convertToMillimeters(double value) {
		return value;
	}

	@Override
	public double convertToCentimeters(double value) {
		return value * MILLIMETER_TO_CENTIMETER_FACTOR;
	}

	@Override
	public double convertToInches(double value) {
		return value * MILLIMETER_TO_INCHE_FACTOR;
	}

	@Override
	public double convertToPixels(double value) {
		return value * MILLIMETER_TO_PIXEL_FACTOR;
	}

	@Override
	public double convertToPoints(double value) {
		return value * MILLIMETER_TO_POINT_FACTOR;
	}

	@Override
	public double convertToPicas(double value) {
		return value * MILLIMETER_TO_PICAS_FACTOR;
	}

}
