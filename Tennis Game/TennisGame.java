
public class TennisGame 
{
	public static String player1;
	public static String player2;
	public static int finalScoreP1;
	public static int finalScoreP2;
	public static String finalScoreP1S;
	public static String finalScoreP2S;

    public static String getName1()
    {
    	return player1;
    }
    public static String getName2()
    {
    	return player2;
    }
    public static int getFinalScoreP1()
    {
    	return finalScoreP1;
    }
    public static int getFinalScoreP2()
    {
    	return finalScoreP2;
    }
    public static String getFinalScoreP1S()
    {
    	return finalScoreP1S;
    }
    public static String getFinalScoreP2S()
    {
    	return finalScoreP2S;
    }
    public static void setName1(String name1)
    {
    	player1 = name1;
    }
    public static void setName2(String name2)
    {
    	player2 = name2;
    }
    public static void setFinalScoreP1(int score1)
    {
    	finalScoreP1 = score1;
    	if(finalScoreP1 < 0 || finalScoreP1 > 4)
    		finalScoreP1S = "error";
    	else if(finalScoreP1 == 0)
    		finalScoreP1S = "love";
    	else if(finalScoreP1 == 1)
    		finalScoreP1S = "15";
    	else if(finalScoreP1 == 2)
    		finalScoreP1S = "30";	
    	else if(finalScoreP1 == 3)
    		finalScoreP1S = "40";
    	else if(finalScoreP1 == 4)
    		finalScoreP1S = "game";					
    }
    public static void setFinalScoreP2(int score2)
    {
    	finalScoreP2 = score2;
    	if(finalScoreP2 < 0 || finalScoreP2 > 4)
    		finalScoreP2S = "error";
    	else if(finalScoreP2 == 0)
    		finalScoreP2S = "love";
    	else if(finalScoreP2 == 1)
    		finalScoreP2S = "15";
    	else if(finalScoreP2 == 2)
    		finalScoreP2S = "30";	
    	else if(finalScoreP2 == 3)
    		finalScoreP2S = "40";
    	else if(finalScoreP2 == 4)
    		finalScoreP2S = "game";
    }
}