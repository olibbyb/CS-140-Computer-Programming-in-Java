import java.util.Scanner;
public class Interest 
{

    public static void main(String[] args)
    {
    	double startingValue, interestValue = 0, finalValue = 0;
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Please enter starting value.");
    	startingValue = keyboard.nextDouble();
    	finalValue = calculate(startingValue, interestValue, finalValue);
   		System.out.println("Starting Value = " + startingValue + "\nFinal Value with 5 percent interest = " + finalValue);
    }  
    public static double calculate(double s, double i, double f)
    {
    	i = s * 0.05;
    	f = s + i;
    	return f;
    }

}