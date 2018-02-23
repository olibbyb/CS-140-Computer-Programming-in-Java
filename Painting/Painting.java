
public class Painting 
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
    	title = "The Starry Night";
    	return title;
    }
    public static String artistData()
    {
    	artist = "Vincent van Gogh";
    	return artist;
    }
    public static String mediumData()
    {
    	medium = "Oil on canvas";
    	return medium;
    }
    public static double priceData()
    {
    	price = 82000000;
    	return price;
    }
    public static double galleryCommissionData()
    {
    	galleryCommission = price * 0.20;
    	return galleryCommission;
    }
}