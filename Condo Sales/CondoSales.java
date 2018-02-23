import java.util.Scanner;
public class CondoSales 
{

    public static void main(String[] args) 
    {
    	int parkView = 1, golfView = 2, lakeView = 3, selection;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter your view selection. \n1. Park View\n2. Golf Course View\n3. Lake View");
    	selection = input.nextInt();
    	if (selection == 1)
    		System.out.println("Park View\nPrice: $150,000");
    		else if (selection == 2)
    			System.out.println("Golf Course View\nPrice: $170,000");
    			else if (selection == 3)
    				System.out.println("Lake View\nPrice: $210,000");
    				else if (selection < 1 || selection > 3)
    					System.out.println("Invalid Choice\nPrice: 0");
    }
    
    
}