package fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLine
 {
	
	public static void main(String[] args)
		throws IOException
	{
		
		List<String> listOfStrings
			= new ArrayList<String>();
	
		BufferedReader bf = new BufferedReader(
			new FileReader("/C:/Myjava/Demo.txt"));
	
		
		String line = bf.readLine();
	
		
		while (line != null) 
		{
			listOfStrings.add(line);
			line = bf.readLine();
		}
	
		
		bf.close();
	
		String[] array
			= listOfStrings.toArray(new String[0]);
		for (String str : array)
		{
			System.out.println(str);
		}
	}
}
