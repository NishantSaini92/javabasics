package collectionofprogram;

import java.io.FileReader;

public class FileHandlingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader fr=new FileReader("info.txt");
		
		int st;
		while((st=fr.read())!=-1)
		{
			System.out.println((char)st);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}

}
