import java.util.Scanner;
public class TestInvoice 
{
	public static int invoiceNum;
	public static int month;
	public static int day;
	public static int year;
	public static double balanceDue;
    public static void main(String[] args)
    {
		getInvoiceNum();
		getBalanceDue();
		getMonth();
		getDay();
		getYear();
		System.out.println("Invoice Number = " + invoiceNum + "\nBalance due = " + balanceDue + "\nMonth = " + month + "\nDay = " + day + "\nYear = " + year);
    }
    public static int getInvoiceNum()
    {
    	System.out.println("Enter invoice number.");
    	Scanner input = new Scanner(System.in);
    	invoiceNum = input.nextInt();
    	if(invoiceNum < 1000)
    		invoiceNum = 0;	
    	else 
    		invoiceNum = invoiceNum;
    	return invoiceNum;
    }
    public static int getMonth()
    {
    	System.out.println("Enter month.");
    	Scanner input = new Scanner(System.in);
    	month = input.nextInt();
    	if(month < 1 || month > 12)
    		month = 0;	
    	else
    		month = month;
    	return month;
    }
    public static int getDay()
    {
    	System.out.println("Enter day.");
    	Scanner input = new Scanner(System.in);
    	day = input.nextInt();
    	if(day < 1 || day > 31)
    		day = 0;
    	else
    		day = day;	
    	return day;
    }
    public static int getYear()
    {
    	System.out.println("Enter year.");
    	Scanner input = new Scanner(System.in);
    	year = input.nextInt();
    	if(year < 2011 || year > 2017)
    		year = 0;
    	else
    		year = year;
    	return year;
    }
    public static double getBalanceDue()
    {
    	System.out.println("Enter balance due.");
    	Scanner input = new Scanner(System.in);
    	balanceDue = input.nextDouble();
    	return balanceDue;
    }
}