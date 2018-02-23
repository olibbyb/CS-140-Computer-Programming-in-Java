
public class DoubleTennisGame extends TennisGame
{

	public static String partner1;
	public static String partner2;
    
    public static String getPartner1()
    {
    	return partner1;
    }
    public static String getPartner2()
    {
    	return partner2;
    }
    public static void setName1(String name1)
    {
    	player1 = name1;
    }
    public static void setName2(String name2)
    {
    	player2 = name2;
    }
    public static void setName3(String name3)
    {
    	partner1 = name3;
    }
    public static void setName4(String name4)
    {
    	partner2 = name4;
    }
}