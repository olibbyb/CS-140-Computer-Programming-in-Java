import java.util.*;
public class CountMatches 
{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	String string1, string2; 
    	int count = 0;
    	System.out.println("Please enter a string.");
    	string1 = in.nextLine();
    	System.out.println("Please enter another string.");
    	string2 = in.nextLine();
    	for(int i = 0; i < string1.length(); i++)
			for(int j = 0; j < string2.length(); j++)
			{
				if (string1.charAt(i) == string2.charAt(j))
					count += 1;
			}
    	System.out.println(count + " characters in " + string1 + " are also found in " + string2);

    }
    
}