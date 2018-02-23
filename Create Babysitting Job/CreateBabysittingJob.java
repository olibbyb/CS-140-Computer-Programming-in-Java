import java.util.Scanner;
public class CreateBabysittingJob 
{

    public static void main(String[] args) 
    {
		int year;
		int jobNum;
		int babyCode;
		int amountChildren;
		int hours;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter year between 2013 and 2025");
		year = keyboard.nextInt();
		while(year < 2013 || year > 2025)
		{
			System.out.println("Incorrect year. Please enter a correct value.");
			year = keyboard.nextInt();
		}
		System.out.println("Please enter a job number between 1 and 9999");
		jobNum = keyboard.nextInt();
		while(jobNum < 1 || jobNum > 9999)
		{
			System.out.println("Incorrect job number. Please enter a correct value.");
			jobNum = keyboard.nextInt();
		}
		System.out.println("Please enter babysitter code 1, 2 or 3");
		babyCode = keyboard.nextInt();
		while(babyCode < 1 || babyCode > 3)
		{
			System.out.println("Incorrect babysitter code. Please enter a correct value.");
			babyCode = keyboard.nextInt();
		}
		System.out.println("Please enter the number of children between 1 and 9");
		amountChildren = keyboard.nextInt();
		while(amountChildren < 1 || amountChildren > 9)
		{
			System.out.println("Incorrect number of children. Please enter a correct value.");
			amountChildren = keyboard.nextInt();
		}
		System.out.println("Please enter the amount of hours between 1 and 12");
		hours = keyboard.nextInt();
		while(hours < 1 || hours > 12)
		{
			System.out.println("Incorrect number of hours. Please enter a correct balue.");
			hours = keyboard.nextInt();
		}
		System.out.println("Year = " + year + "\nJob Number = " + jobNum + "\nBabysitter Code = " + babyCode + "\nNumber of Children = " + amountChildren + "\nNumber of Hours = " + hours);
    }
    
    
}