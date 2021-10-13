package components.style.converter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UnitLengthConverter
{	
	public static final double MILLIMETERS_TO_CENTIMETERS_FACTOR = 0.1d;
	
	public static final String UNIT_LENGTH_CONVERTER_CLASS_SUFFIX = "Converter";
	public static final String UNIT_LENGTH_CONVERSION_METHOD_PREFIX = "convertTo";
	public static final String CONVERTER_CLASS_PACKAGE = "components.style.converter.";
	
	public static double convert(double quantity, UnitLength from, UnitLength to)
	{
		if(from != UnitLength.NONE && to != UnitLength.NONE)
		{
			String fromStr = from.toString();
			String toStr = to.toString();
			
			Class<?> fromConverter;
			try {
				fromConverter = Class.forName(CONVERTER_CLASS_PACKAGE + fromStr + UNIT_LENGTH_CONVERTER_CLASS_SUFFIX);
				Constructor<?> fromConverterConstructor = fromConverter.getConstructor();
				Object fromConverterInstance = (UnitLengthConvertable)fromConverterConstructor.newInstance();
				Class<?>[] methodParams = new Class[] {Double.TYPE};
				Method conversionMethod = fromConverter.getDeclaredMethod(UNIT_LENGTH_CONVERSION_METHOD_PREFIX + toStr + "s", methodParams);
				Object[] params = new Object[] { new Double(quantity) };
				Double toQuantity = (Double)conversionMethod.invoke(fromConverterInstance, params);
				return toQuantity;
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	
	
	
}
