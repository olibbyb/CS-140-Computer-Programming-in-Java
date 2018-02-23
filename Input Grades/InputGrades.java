import java.util.*;
public class InputGrades 
{

    public static void main(String[] args) 
    {
    	int studentID, courseID;
    	String grade;
    	Scanner in = new Scanner(System.in);
    	for(int i = 0; i < 9; i++)
    	{
    		System.out.println("Please enter Student ID");
    		studentID = in.nextInt();
    		if(studentID < 0 || studentID > 10)
    		{
    			System.out.println("Incorrect ID");
    			break;
    		}
    		System.out.println("Please enter course ID");
    		courseID = in.nextInt();
    		if(courseID < 0 || courseID > 5)
    		{
    			System.out.println("Incorrect course ID");	
    			break;
    		}
    		System.out.println("Please enter grade");
    		grade = in.nextLine();	
    	}
    }
    
    
}