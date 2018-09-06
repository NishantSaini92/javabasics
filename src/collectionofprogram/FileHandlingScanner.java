package collectionofprogram;

import java.io.File;
import java.util.Scanner;

public class FileHandlingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("info.txt");
		try
		{Scanner sc =new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
