import java.util.*;
public class DemoTennisGames 
{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter name for player 1: ");
    	String name1 = in.nextLine();
    	TennisGame.setName1(name1);
    	System.out.println("Enter name for player 2: ");
    	String name2 = in.nextLine();
    	TennisGame.setName2(name2);
    	System.out.println("Enter name of partner for player 1: ");
    	String name3 = in.nextLine();
    	DoubleTennisGame.setName3(name3);
    	System.out.println("Enter name of parner for player 2: ");
    	String name4 = in.nextLine();
    	DoubleTennisGame.setName4(name4);
    	System.out.println("Enter final score for player 1 from 0 to 4:");
    	int score1 = in.nextInt();
    	TennisGame.setFinalScoreP1(score1);
    	System.out.println("Enter final score for player 2 from 0 to 4:");
    	int score2 = in.nextInt();
    	TennisGame.setFinalScoreP2(score2);
    	System.out.println("Players: = " + TennisGame.player1 + " " + TennisGame.player2 + " " + DoubleTennisGame.partner1 + " " + DoubleTennisGame.partner2);
    	System.out.println("Final Score for player 1 = " + TennisGame.finalScoreP1S + "\nFinal Score for player 2 = " + TennisGame.finalScoreP2S);

    }
    
    
}