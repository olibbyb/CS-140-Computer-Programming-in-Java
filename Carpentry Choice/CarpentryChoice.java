import java.util.*;
public class CarpentryChoice 
{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	String[] items = {"Table", "Desk", "Dresser", "Entertainment Center"};
    	int[] price = {250, 325, 420, 600};
    	String choice;
    	System.out.println("Available Items: \nTable, Desk, Dresser, Entertainment Center");
    	System.out.println("Please enter your selection.");
    	choice = in.nextLine();
 		for(int i = 0; i < items.length; i++)
 		{
 			if(choice.equals(items[i]))
 				System.out.println("Price = " + price[i]);
 			else
 				System.out.println("Invalid choice");	
 			break;
 		}	
 		
    }
    
    
}