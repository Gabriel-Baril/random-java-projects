package tutorial;

public class Main {
	/*	StringBuilder Info
	 * https://www.journaldev.com/538/string-vs-stringbuffer-vs-stringbuilder
	 * 
	 */
	public static void main(String[] args)
	{
		Main tutorial = new Main();
		tutorial.appendExample();
		tutorial.capacityExample();
		tutorial.trimmingExample();
	}
	
	private void printHeader(String textHeader)
	{
		System.out.println("------------" + textHeader + "------------");
	}
	
	private void appendExample()
	{
		printHeader("appendExample");
		StringBuilder strBuilder = new StringBuilder("Bonjour");
		System.out.println("Before append : " + strBuilder);
		strBuilder.append(" Test");
		System.out.println("After append : " + strBuilder);
	}
	
	private void capacityExample()
	{
		printHeader("capacityExample");
		StringBuilder strBuilder = new StringBuilder(10);
		strBuilder.append("Test");
		System.out.println("StringBuilder length : " + strBuilder.length());
		System.out.println("StringBuilder capacity : " + strBuilder.capacity());
	}
	
	private void trimmingExample()
	{
		printHeader("trimmingExample");
		StringBuilder strBuilder = new StringBuilder(10);
		strBuilder.append("Test");
		System.out.println("StringBuilder length : " + strBuilder.length());
		System.out.println("StringBuilder capacity : " + strBuilder.capacity());
		System.out.println("Trimming...");
		strBuilder.trimToSize();
		System.out.println("StringBuilder length : " + strBuilder.length());
		System.out.println("StringBuilder capacity : " + strBuilder.capacity());
	}
}
