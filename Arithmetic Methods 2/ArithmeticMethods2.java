import java.util.Scanner;
public class ArithmeticMethods2 
{

    public static void main(String[] args)
    {
    	int a, b;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a value for variable a");
    	a = input.nextInt();
    	System.out.println("Please enter a value for variable b");
    	b = input.nextInt();
    	System.out.println("Variable a = " + a + " and variable b = " + b);
    	displayNumberPlus10(a, b);
    	displayNumberPlus100(a, b);
    	displayNumberPlus1000(a, b);
    }
    public static int displayNumberPlus10(int j, int k)
    {
    	int c;
    	int d;
    	c = j + 10;
    	d = k + 10;
    	System.out.println("Variable a plus 10 = " + c + " and variable b plus 10 = " + d);
    	return c;
    }
    public static int displayNumberPlus100(int l, int m)
    {
    	int e;
    	int f;
    	e = l + 100;
    	f = m + 100;
    	System.out.println("Variable a plus 100 = " + e + " and variable b plus 100 = " + f);
    	return e;
    }
    public static int displayNumberPlus1000(int n, int o)
    {
    	int g;
    	int h;
    	g = n + 1000;
    	h = o + 1000;
    	System.out.println("Variable a plus 1000 = " + g + " and variable b plus 1000 = " + h);
    	return g;
    }
}