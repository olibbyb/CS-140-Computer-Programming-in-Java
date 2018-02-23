import java.util.Scanner;
public class BabyNameComparison 
{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	String name1, name2, name3;
    	System.out.println("Please enter first name.");
    	name1 = in.nextLine();
    	System.out.println("Please enter second name.");
    	name2 = in.nextLine();
    	System.out.println("Please enter third name.");
    	name3 = in.nextLine();
    	System.out.println(name1 + " " + name2);
    	System.out.println(name1 + " " + name3);
    	System.out.println(name2 + " " + name1);
    	System.out.println(name2 + " " + name3);
    	System.out.println(name3 + " " + name1);
    	System.out.println(name3 + " " + name2);
    }
    
    
}