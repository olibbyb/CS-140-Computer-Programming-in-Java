import java.util.Scanner;
public class TestSandwich 
{
	public static String mainIng;
	public static String breadType;
	public static double price;
    public static void main(String[] args)
    {
		ingredientData();
		breadData();
    	priceData();
		System.out.println("Main Ingredient = " + mainIng + "\nBread Type = " + breadType + "\nPrice = " + price);
    }  
    public static String ingredientData()
    {
    	System.out.println("Please enter main ingredient.");
    	Scanner keyboard = new Scanner(System.in);
    	mainIng = keyboard.next();
    	return mainIng;
    }
    public static String breadData()
    {
    	System.out.println("Please enter bread type.");
    	Scanner keyboard = new Scanner(System.in);
    	breadType = keyboard.next();
    	return breadType;
    }
    public static Double priceData()
    {
    	System.out.println("Please enter price.");
    	Scanner keyboard = new Scanner(System.in);
    	price = keyboard.nextDouble();
    	return price;
    }
}