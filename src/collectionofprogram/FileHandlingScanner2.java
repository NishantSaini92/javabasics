package collectionofprogram;

import java.io.File;
import java.util.Scanner;

public class FileHandlingScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File file=new File("info.txt");
			Scanner nd=new Scanner(file);
		    nd.useDelimiter("\\Z");
		    System.out.println(nd.next());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
