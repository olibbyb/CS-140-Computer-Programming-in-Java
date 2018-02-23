import java.util.Scanner;
public class Percentages2 
{

    public static void main(String[] args)
    {
    	double a, b, percentage = 0;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a value for variable a");
    	a = input.nextDouble();
    	System.out.println("Please enter a value for variable b");
    	b = input.nextDouble();
    	computePercent(a, b, percentage);
    	computeReversePercent(a, b, percentage);
    }
    public static double computePercent(double c, double d, double p)
    {
    	double k;
    	k = c / d;
    	System.out.println(c + " is " + k + "% of " + d);
    	return k;
    }
    public static double computeReversePercent(double c, double d, double p)
    {
    	double l;
    	l = d / c;
    	System.out.println(d + " is " + l + "% of " + c);
    	return l;
    }
}