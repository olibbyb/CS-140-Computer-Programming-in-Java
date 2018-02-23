import java.nio.file.*;
public class FileStatistics2
{

    public static void main(String[] args)
    {
		Path file1 = Paths.get("I:\\College\\CS 140-01\\4-12 Programming Assignment 11\\quote.txt");
		Path file2 = Paths.get("I:\\College\\CS 140-01\\4-12 Programming Assignment 11\\quote.docx");
		long size1, size2;
		double ratio;
		size1 = file1.getNameCount();
		size2 = file2.getNameCount();
		ratio = size1 / size2;
		System.out.println("Size of quote.txt = " + size1);
		System.out.println("Size of quote.docx = " + size2);
		System.out.println("Ratio of the files = " + ratio);
    }


}