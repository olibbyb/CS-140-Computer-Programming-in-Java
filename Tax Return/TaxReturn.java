import java.util.*;
public class TaxReturn 
{
	public String lastName;
	public String firstName;
	public String streetAddress;
	public String city;
	public String state;
	public static int maritalStatus;
	public int socialSecurity, zipCode;
	public double annualIncome;
	public double taxLiability;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	}
	public void display()
	{
		System.out.println("Social Security = " + socialSecurity + "\nLast Name = " + lastName + "\nFirst Name = " + firstName + "\nStreet Address = " + streetAddress + "\nCity = " + city + "\nState = " + state + "\nZip Code = " + zipCode + "\nMarital Status = " + maritalStatus + "\nTax Liability = " + taxLiability);
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public static int getMaritalStatusVariable()
	{
		return maritalStatus;
	}
	public int getSocialSecurity()
	{
		return socialSecurity;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	public double getAnnualIncome()
	{
		return annualIncome;
	}
	public double getTaxLiability()
	{
		return taxLiability;
	}
    public void calcTax()
    {
    	double rate = 0;
    	if(annualIncome >= 0 || annualIncome <= 20000)
    	{
    		if(maritalStatus == 0)
    			rate = 0.15;
    		else if(maritalStatus == 1)
    			rate = 0.14;
    	}
		else if(annualIncome >= 20001 || annualIncome <= 50000)
		{
			if(maritalStatus == 0)
				rate = 0.22;
			else if(maritalStatus == 1)
				rate = 0.20;	
		}
		else if(annualIncome >= 50001)
		{
			if(maritalStatus == 0)
				rate = 0.30;
			else if(maritalStatus == 1)
				rate = 0.28;	
		}
		taxLiability = annualIncome * rate;
    }
    
}