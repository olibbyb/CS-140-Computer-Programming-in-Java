
public class Purchase 
{
	public static int invoice;
	public static double sale;
	public static double salesTax;
    public static void main(String[] args) 
    {
    	getInvoice();
    	getSale();
    	getSalesTax();
    	setSalesAmount();
    	System.out.println("Invoice Number = " + invoice + "\nAmount of Sale = " + sale + "\nAmount of Sales Tax = " + salesTax);
    }
    public static int getInvoice()
    {
    	return invoice;
    }	
    public static double getSale()
    {
    	return sale;
    }
	public static double getSalesTax()
	{
		return salesTax;
	}
	public static void setSalesAmount()
	{
		salesTax = sale * 0.05;	
	}
}