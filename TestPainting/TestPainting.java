import java.util.Scanner;
public class TestPainting 
{
    public static String title;
	public static String artist;
	public static String medium;
	public static double price;
	public static double galleryCommission;
    public static void main(String[] args)
    {
    	titleData();
    	artistData();
    	mediumData();
    	priceData();
    	galleryCommissionData();
    	System.out.println("Title = " + title + "\nArtist = " + artist + "\nMedium = " + medium + "\nPrice = " + price + "\nCommission = " + galleryCommission);
    }   
    public static String titleData()
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter title.");
    	title = keyboard.next();
    	return title;
    }
    public static String artistData()
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter artist.");
    	artist = keyboard.next();
    	return artist;
    }
    public static String mediumData()
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter medium.");
    	medium = keyboard.next();
    	return medium;
    }
    public static double priceData()
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter price.");
    	price = keyboard.nextDouble();
    	return price;
    }
    public static double galleryCommissionData()
    {
    	galleryCommission = price * 0.20;
    	return galleryCommission;
    }
}