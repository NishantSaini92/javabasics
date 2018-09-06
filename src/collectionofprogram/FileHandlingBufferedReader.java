package collectionofprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandlingBufferedReader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("info.txt");
		try {
		BufferedReader ne=new BufferedReader(new FileReader(file));
		String str;
		while((str=ne.readLine())!=null)
		{
			System.out.println(str);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			
		}
	}

}
