package src;

public class Main {

	public static void main(String[] args)
	{
		Transaction transaction = new Transaction(-20);
		System.out.println(transaction.depositOrWithdrawal());
	}
	
	public static float fahrenheitToCelsius(float fahrenheitConverted)
	{
		fahrenheitConverted = ((fahrenheitConverted - 32) * 5) / 9;
		return fahrenheitConverted;
	}

}
