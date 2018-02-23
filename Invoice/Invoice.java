
public class Invoice 
{
	public static int invoiceNum;
	public static int month;
	public static int day;
	public static int year;
	public static double balanceDue;
    public static void main(String[] args)
    {
		getInvoiceNum();
		setInvoiceNum(invoiceNum);
		getBalanceDue();
		getMonth();
		getDay();
		getYear();
		setMonth(month);
		setDay(day);
		setYear(year);
		System.out.println(getInvoiceNum() + " " + getBalanceDue() + " " + getMonth() + " " + getDay() + " " + getYear());
    }
    public static int getInvoiceNum()
    {
    	return invoiceNum;
    }
    public static void setInvoiceNum(int invoiceNum)
    {
    	if(invoiceNum < 1000)
    		invoiceNum = 0;			
    }
    public static int getMonth()
    {
    	return month;
    }
    public static void setMonth(int month)
    {
    	if(month < 1 || month > 12)
    		month = 0;	
    }
    public static int getDay()
    {
    	return day;
    }
    public static void setDay(int day)
    {
    	if(day < 1 || day > 31)
    		day = 0;
    }
    public static int getYear()
    {
    	return year;
    }
    public static void setYear(int year)
    {
    	if(year < 2011 || year > 2017)
    		year = 0;
    }
    public static double getBalanceDue()
    {
    	return balanceDue;
    }
}