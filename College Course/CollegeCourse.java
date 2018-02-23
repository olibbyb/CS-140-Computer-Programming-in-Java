
public class CollegeCourse 
{
	public static String courseID;
	public static int creditHours;
	public static char grade;

    public static String getCourseID()
    {
    	return courseID;
    }
    public void setCourseID(String id)
    {
    	courseID = id;
    }
    public static int getCreditHours()
    {
    	return creditHours;
    }
    public void setCreditHours(int ch)
    {
    	creditHours = ch;
    }
    public static char getGrade()
    {
    	return grade;
    }
    public void setGrade(char g)
    {
    	grade = g;
    }
}