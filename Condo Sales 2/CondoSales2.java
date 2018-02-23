import java.util.Scanner;
public class CondoSales2 
{

    public static void main(String[] args) 
    {
    	int parkView = 1, golfView = 2, lakeView = 3, viewSelection, parkingSelection;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter your view selection. \n1. Park View\n2. Golf Course View\n3. Lake View");
    	viewSelection = input.nextInt();
    	if (viewSelection == 1)
    		System.out.println("Park View\nPrice: $150,000");
    		else if (viewSelection == 2)
    			System.out.println("Golf Course View\nPrice: $170,000");
    			else if (viewSelection == 3)
    				System.out.println("Lake View\nPrice: $210,000");
    				else if (viewSelection < 1 || viewSelection > 3)
    					System.out.println("Invalid Choice\nPrice: 0");
    	if (viewSelection >= 1 || viewSelection <=3)
    	{
    		System.out.println("Please enter your selection. \n1. Garage Space\n2. Parking Space");
    		parkingSelection = input.nextInt();
    		if (parkingSelection == 1)
    			System.out.println("Garage Space\nPrice $5,000");
    			else if (parkingSelection == 2)
    				System.out.println("Parking Space");
    				else if (parkingSelection < 1 || parkingSelection >2)
    					System.out.println("Invalid choice");
    	}				
    }
    
    
}