import java.util.Scanner;
public class BabysittingJob 
{

    public static void main(String[] args)
    {
    	int jobNum;
    	int babyCode;
    	int amountChildren;
    	int hours;
    	double fee, feeHours = 0;
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter job number");
    	jobNum = keyboard.nextInt();
    	System.out.println("Please enter babyysitter code. \n1. Cindy \n2. Greg \n3. Marcia");
    	babyCode = keyboard.nextInt();
    	while(babyCode < 1 || babyCode > 4)
    	{
    		System.out.println("Incorrect baby code. Should be 1, 2 or 3");
    		babyCode = keyboard.nextInt();
    	}
    	System.out.println("Please enter the number of children to be watched.");
    	amountChildren = keyboard.nextInt();
    	while(amountChildren < 1)
    	{
    		System.out.println("You have entered a negative value. Please enter a positive value.");
    		amountChildren = keyboard.nextInt();
    	}
    	System.out.println("Please enter amount of hours.");
    	hours = keyboard.nextInt();
    	if(babyCode == 1)
    		{
    			feeHours = hours * 7;
    			fee = feeHours * amountChildren;
    		}
    		else if (babyCode == 2 || babyCode == 3)
    			{
    				feeHours = hours * 9;
    				fee = feeHours * amountChildren;
    			}
    	System.out.println("Fee = " + feeHours);
    }

}