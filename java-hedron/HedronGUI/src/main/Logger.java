package main;

public class Logger
{
	private static final String EXTRA_MESSAGE_SEPARATOR = ":";
	private static final String EXTRA_LOG_MESSAGE = "LOG " + EXTRA_MESSAGE_SEPARATOR + " ";
	private static final String EXTRA_WARNING_MESSAGE = "WARNING " + EXTRA_MESSAGE_SEPARATOR + " ";
	private static final String EXTRA_BUG_MESSAGE = "BUG " + EXTRA_MESSAGE_SEPARATOR + " ";
	private static final String EXTRA_ERROR_MESSAGE = "ERROR " + EXTRA_MESSAGE_SEPARATOR + " ";
	
	private Logger() {}
	
	public static void log(String message)
	{
		System.out.println(EXTRA_LOG_MESSAGE + message);
	}
	
	public static void warning(String message)
	{
		System.out.println(EXTRA_WARNING_MESSAGE + message);
	}
	
	public static void bug(String message)
	{
		System.out.println(EXTRA_BUG_MESSAGE + message);
	}
	
	public static void error(String message)
	{
		System.out.println(EXTRA_ERROR_MESSAGE + message);
	}
}
