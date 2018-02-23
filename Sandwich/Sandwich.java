
public class Sandwich 
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
    	mainIng = "Tuna";
    	return mainIng;
    }
    public static String breadData()
    {
    	breadType = "Wheat";
    	return breadType;
    }
    public static Double priceData()
    {
    	price = 4.99;
    	return price;
    }
}