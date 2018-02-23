
public class BookArray 
{

    public static void main(String[] args) 
    {
    	int i;
    	String[] bookList = {"book1", "book2", "book3", "book4", "book5", "book6", "book7", "book8", "book9", "book10"};
    	bookList[0] = "Fiction";
    	bookList[1] = "Nonfiction";
    	bookList[2] = "Nonfiction";
    	bookList[3] = "Fiction";
    	bookList[4] = "NonFiction";
    	bookList[5] = "Fiction";
    	bookList[6] = "Fiction";
    	bookList[7] = "Fiction";
    	bookList[8] = "NonFiction";
    	bookList[9] = "Fiction";
    	for(i = 0; i < 9; i++)
    		String.out.println(bookList[i]);
    }
    
    
}