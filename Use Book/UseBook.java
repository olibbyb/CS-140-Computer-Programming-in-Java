
public class UseBook 
{

    public static void main(String[] args)
    {
    	Book.setBookTitle("Fiction");
    	System.out.println("Book title = " + Book.getBookTitle());
    	Fiction.setPrice(24.99);
    	System.out.println("Price = " + Book.bookPrice);
    	Book.setBookTitle("Nonfiction");
    	System.out.println("Book title = " + Book.getBookTitle());
    	NonFiction.setPrice(37.99);
    	System.out.println("Price = " + Book.bookPrice);
    }
    
    
}