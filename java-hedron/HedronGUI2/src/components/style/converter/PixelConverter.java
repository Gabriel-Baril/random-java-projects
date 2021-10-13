package components.style.converter;

public class PixelConverter implements UnitLengthConvertable
{
	public static final double PIXEL_TO_MILLIMETER_FACTOR = 0.2645833333d;
	public static final double PIXEL_TO_CENTIMETER_FACTOR = 0.0264583333d;
	public static final double PIXEL_TO_INCHE_FACTOR = 0.0104166667d;
	public static final double PIXEL_TO_POINT_FACTOR = 0.75d;
	public static final double PIXEL_TO_PICAS_FACTOR = 0.0625d;
	
	@Override
	public double convertToMillimeters(double value) {
		return value * PIXEL_TO_MILLIMETER_FACTOR;
	}

	@Override
	public double convertToCentimeters(double value) {
		return value * PIXEL_TO_CENTIMETER_FACTOR;
	}

	@Override
	public double convertToInches(double value) {
		return value * PIXEL_TO_INCHE_FACTOR;
	}

	@Override
	public double convertToPixels(double value) {
		return value;
	}

	@Override
	public double convertToPoints(double value) {
		return value * PIXEL_TO_POINT_FACTOR;
	}

	@Override
	public double convertToPicas(double value) {
		return value * PIXEL_TO_PICAS_FACTOR;
	}
}
