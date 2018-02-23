
public class BankAccount 
{
	public static int acctNum;
	public static double acctBal;
	public static String ownerName;
    public static void main(String[] args)
    {
		acctNumData();
		acctBalData();
		ownerNameData();
		double finalAcctBal = 0;
		finalAcctBal = deductMonthlyFee(acctBal, finalAcctBal);
		System.out.println("Account Number = " + acctNum + "\nOwner Name = " + ownerName + "\nAccount Balance = " + acctBal + "\nAccount Balance After Monthly Fee = " + finalAcctBal);
		explainAccountPolicy();
    }   
    public static int acctNumData()
    {
    	acctNum = 558101;
    	return acctNum;
    }
    public static double acctBalData()
    {
    	acctBal = 25000;
    	return acctBal;	
    }
    public static String ownerNameData()
    {
    	ownerName = "Olivia";
    	return ownerName;
    }
    public static double deductMonthlyFee(double aB, double fAB)
    {
    	fAB = aB - 4.00;
    	return fAB;
    }
    public static void explainAccountPolicy()
    {
    	System.out.println("The $4 service fee will be deducted each month.");
    }
}