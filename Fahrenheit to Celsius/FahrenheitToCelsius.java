import java.util.Scanner;
public class FahrenheitToCelsius 
{

    public static void main(String[] args)
    {
    	double degreesFahrenheit, degreesCelsius, degreesCelsiusFinal;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the temperature in degrees Fahrenheit");
   		degreesFahrenheit = input.nextDouble();
   		degreesCelsius = degreesFahrenheit - 32;
   		degreesCelsiusFinal = (5/9) * degreesCelsius;
   		System.out.println("The temperature in degrees Fahrenheit is " + degreesFahrenheit + " and the temperature in degrees Celsius is " + degreesCelsius);
    }

    
}