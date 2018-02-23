
public class DemonstratingStringsMethods 
{

    public static void main(String[] args)
    {
    	String quote = "You can never cross the ocean until you have the courage to lose sight of the shore. - Christopher Columbus";
    	String replace;
    	boolean ends1, ends2;
    	char charat;
    	int index1, index2;
    	System.out.println(quote);
    	index1 = quote.indexOf('v');
    	System.out.println("Using indexOf('v'): " + index1);
    	index2 = quote.indexOf('x');
    	System.out.println("Using indexOf('x'): " + index2);
    	charat = quote.charAt(16);
    	System.out.println("Using charAt(16): " + charat);
    	ends1 = quote.endsWith("bus");
    	System.out.println("Using endsWith('bus'): " + ends1);
    	ends2 = quote.endsWith("car");
    	System.out.println("Using endsWith('car'): " + ends2);
    	replace = quote.replace('c', 'C');
    	System.out.println("Using replace.('c', 'C'): " + replace);
    }
    
}