import java.util.Scanner;
public class Coffee 
{

    public static void main(String[] args) 
    {
    	String menu = "\tMenu\n1. American \t 1.99\n2. Espresso \t 2.50\n3. Latte \t\t 2.15";
    	int american = 1, espresso = 2, latte = 3, selection;
    	double price = 0.0;
    	System.out.println(menu);
    	System.out.println("Please enter your selection. 0 quits program.");
    	Scanner input = new Scanner(System.in);
    	selection = input.nextInt();
    	if (selection == 1)
    	{
    		price = 1.99;
    		System.out.println("American \nTotal Price = " + price);
    	}
    		else if (selection == 2)
    		{
    			price = 2.50;
    			System.out.println("Espresso \nTotal Price = " + price);
    		}
    			else if (selection == 3)
    			{
    				price = 2.15;
    				System.out.println("Latte \nTotal Price = " + price);
    			}
    				else if (selection == 0)
    				{
    					System.out.println("Total bill = 0");
    					return;
    				}
    	System.out.println(menu);
    	System.out.println("Please select another item. 0 to quit");
    	selection = input.nextInt();
    	if (selection == 1)
    	{
    		price = price + 1.99;
    		System.out.println("American \nTotal Price = " + price);
    	}
    		else if (selection == 2)
    		{
    			price = price + 2.50;
    			System.out.println("Espresso \nTotal Price = " + price);
    		}
    			else if (selection == 3)
    			{
    				price = price + 2.15;
    				System.out.println("Latte \nTotal Price = " + price);
    			}
    				else if (selection == 0)
    				{
    					System.out.println("Total bill = " + price);
    					return;
    				}	
    	System.out.println("Please select another item. 0 to quit");
    	selection = input.nextInt();
    	if (selection == 1)
    	{
    		price = price + 1.99;
    		System.out.println("American \nTotal Price = " + price);
    	}
    		else if (selection == 2)
    		{
    			price = price + 2.50;
    			System.out.println("Espresso \nTotal Price = " + price);
    		}
    			else if (selection == 3)
    			{
    				price = price + 2.15;
    				System.out.println("Latte \nTotal Price = " + price);
    			}
    				else if (selection == 0)
    				{
    					System.out.println("Total bill = " + price);
    					return;
    				}							
    }
    
    
}