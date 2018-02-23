
import javax.swing.JOptionPane;
public class MilesToFeetInteractive
{

    public static void main(String[] args) 
    {
    	int ftInMile = 5280;
    	double distanceInFeet;
    	String distanceUncles;
    	distanceUncles = JOptionPane.showInputDialog(null, "What is the distance to your Uncle's house from your house in miles?", "Distance", JOptionPane.QUESTION_MESSAGE);
    	distanceInFeet = Double.parseDouble(distanceUncles) * ftInMile;
    	System.out.println("The distance to your uncle's house is " + distanceUncles + " miles or " + distanceInFeet + " feet.");
    	
    }
    
    
}
