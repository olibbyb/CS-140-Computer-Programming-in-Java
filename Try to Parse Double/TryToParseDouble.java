import java.util.*;
public class TryToParseDouble
{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
		double parseDouble = 0;
		String input;
		try
		{
		System.out.println("Please enter a number.");
		input = in.nextLine();
		parseDouble = Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			input = "0";
			System.out.println("NumberFormatException error");
		}
		System.out.println("Result = " + parseDouble);
    }


}