import java.util.*;
public class PrepareTax 
{

    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
    	String lastName, firstName, streetAddress, city, state, writtenMaritalStatus = "";
    	int maritalStatus, socialSecurity, zipCode;
    	double annualIncome, taxLiability, rate = 0;
    	System.out.println("Please enter First name.");
    	firstName = in.nextLine();
    	System.out.println("Please enter Last name.");
    	lastName = in.nextLine();
    	System.out.println("Please enter Street Address.");
    	streetAddress = in.nextLine();
    	System.out.println("Please enter City.");
    	city = in.nextLine();
    	System.out.println("Please enter State.");
    	state = in.nextLine();
    	System.out.println("Please enter Zip Code.");
    	zipCode = in.nextInt();
    	while(zipCode > 1000000)
    	{
    		System.out.println("Incorrect Zip Code. \nPlease enter correct Zip Code.");
    		zipCode = in.nextInt();
    	}
    	System.out.println("Please enter Social Security Number.");
    	socialSecurity = in.nextInt();
    	while(socialSecurity < 0 || socialSecurity > 1000000000)
    	{
    		System.out.println("Incorrect Social Security Number. \nPlease enter correct Social Security Number");
    		socialSecurity = in.nextInt();
    	}

    	System.out.println("Please enter Marital Status. 1 for Single, 2 for Married.");
    	maritalStatus = in.nextInt();
    	while(maritalStatus < 0 || maritalStatus >= 3)
    	{
    		System.out.println("Incorrect Marital Status entered. \nPlease enter 1 for Single or 2 for Married");
    		maritalStatus = in.nextInt();
    	}
    	System.out.println("Please enter Annual Income.");
    	annualIncome = in.nextDouble();
    	if(annualIncome >= 0 || annualIncome <= 20000)
    	{
    		if(maritalStatus == 1)
    			rate = 0.15;
    		else if(maritalStatus == 2)
    			rate = 0.14;
    	}
		else if(annualIncome >= 20001 || annualIncome <= 50000)
		{
			if(maritalStatus == 1)
				rate = 0.22;
			else if(maritalStatus == 2)
				rate = 0.20;	
		}
		else if(annualIncome >= 50001)
		{
			if(maritalStatus == 1)
				rate = 0.30;
			else if(maritalStatus == 2)
				rate = 0.28;	
		}
		taxLiability = annualIncome * rate;
		if(maritalStatus == 1)
			writtenMaritalStatus = "Single";
		else if(maritalStatus == 2)
			writtenMaritalStatus = "Married";		
		System.out.println("Social Security = " + socialSecurity + "\nLast Name = " + lastName + "\nFirst Name = " + firstName + "\nStreet Address = " + streetAddress + "\nCity = " + city + "\nState = " + state + "\nZip Code = " + zipCode + "\nMarital Status = " + writtenMaritalStatus + "\nTax Liability = " + taxLiability);	
    }
    
    
}