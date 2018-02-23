
public class Percentages 
{

    public static void main(String[] args)
    {
    	double a = 2.0, b = 5.0, percentage = 0;
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