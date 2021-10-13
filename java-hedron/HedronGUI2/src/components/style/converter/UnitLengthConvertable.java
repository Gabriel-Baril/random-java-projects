package components.style.converter;

public interface UnitLengthConvertable {
	public double convertToMillimeters(double value);
	public double convertToCentimeters(double value);
	public double convertToInches(double value);
	public double convertToPixels(double value);
	public double convertToPoints(double value);
	public double convertToPicas(double value);
}
