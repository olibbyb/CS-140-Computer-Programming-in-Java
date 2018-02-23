import java.util.Scanner;
public class Billing 
{
	public static double price;
	public static double coupon;
	public static double tax;
	public static int quantity;
	public static double finalPrice;
	public static double finalTax;
    public static void main(String[] args)
    {
    	priceData();
    	couponData();
    	taxData();
    	quantityData();
    	computeBill(price);
    	computeBill(price, quantity);
    	computeBill(price, quantity, coupon);	
    }
    public static double priceData()
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter price.");
    	price = keyboard.nextDouble();
    	return price;
    }
	public static double couponData()
	{
		Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter coupon value.");
    	coupon = keyboard.nextDouble();
    	return coupon;
	}
	public static double taxData()
	{
		tax = 0.08;
		return tax;
	}
	public static int quantityData()
	{
		Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter quantity.");
    	quantity = keyboard.nextInt();
    	return quantity;
	}
    public static void computeBill(double p)
    {
		finalTax = p * tax;
		finalPrice = finalTax + price;
		System.out.println("Total = " + finalPrice);
	} 	
    public static void computeBill(double p, int q)
    {
		finalTax = p * q * tax;
		finalPrice = finalTax + price;
		System.out.println("Total = " + finalPrice);
    }
    public static void computeBill(double p, int q , double c)
    {
		finalTax = ((p * q) - coupon) * tax;
		finalPrice = finalTax + price;
		System.out.println("Total = " + finalPrice);
    }
}