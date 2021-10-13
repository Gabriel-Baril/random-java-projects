package src;

public class Transaction{
	private int transactionAmount;
	
	public Transaction(int transactionAmount){
		this.transactionAmount = transactionAmount;
	}
	
	public int getTransactionAmount(){
		return this.transactionAmount;
	}
	
	public TransactionType depositOrWithdrawal(){
		if (this.transactionAmount > 0)
			return TransactionType.DEPOSIT;
		else
			return TransactionType.WITHDRAWAL;
	}
}