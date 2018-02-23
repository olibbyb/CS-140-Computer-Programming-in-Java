public class FormLetterWriter 
{
	public static void main(String[] args)
    {	
    	String firstName = "Olivia";
		String lastName = "Bravo";
  		displaySalutation(lastName);
    	displaySalutation(firstName, lastName);
    	System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String lName)
    {
    	System.out.println("Dear Mr. or Ms. " + lName);
    }
    public static void displaySalutation(String fName, String lName)
    {
    	System.out.println("Dear " + fName + " " + lName);
    }
}