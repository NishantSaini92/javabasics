package collectionofprogram;
import java.util.Scanner;

class fruits//some class
{
	private String fruitname;//private member of class
	public String functionname()
	{
		return fruitname;// returning string type
	}
	public void setfruitname(String setname)//assigning values
	{
		fruitname=setname;
	}
}
public class ArrayOfObjects {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	fruits[] nfruit=new fruits[4];//array of type fruits
	for(int i=0;i<nfruit.length;i++)
	{
		System.out.println("Input fruit name:");
		nfruit[i]=new fruits();//new instance 
		nfruit[i].setfruitname(sc.next());//calling function and assigning values 
	}
	for(int i=0;i<nfruit.length;i++)
	{
		System.out.println("name:"+nfruit[i].functionname());
	}
}

}
