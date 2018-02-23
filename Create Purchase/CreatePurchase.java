import java.util.Scanner;
public class CreatePurchase 
{

    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter invoice number between 1,000 and 8,000");
    	Purchase.invoice = keyboard.nextInt();	
    	while(Purchase.invoice < 1000 || Purchase.invoice > 8000)	
    	{
    		System.out.println("You did not enter the correct invoice number. Please try again.");
    		Purchase.invoice = keyboard.nextInt();
    	}
    	System.out.println("Please enter sales amount.");
    	Purchase.sale = keyboard.nextDouble();
    	while(Purchase.sale < 0)
    	{
    		System.out.println("You entered a negative value. Please enter a positive value.");
    		Purchase.sale = keyboard.nextDouble();
    	}
    	Purchase.salesTax = Purchase.sale * 0.05;
    	System.out.println("Invoice Number = " + Purchase.invoice + "\nAmount of Sale = " + Purchase.sale + "\nAmount of Sales Tax = " + Purchase.salesTax);
    }
    
    
}