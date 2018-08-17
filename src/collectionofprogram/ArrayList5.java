package collectionofprogram;

import java.util.ArrayList;
import java.util.Iterator;

//retainAll :retaining elements which are present in collection 
public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<Integer> first=new ArrayList<Integer>();
		ArrayList<Integer> second=new ArrayList<Integer>();
		first.add(1);//adding element to first ArrayList
		first.add(2);
		second.add(3);//adding element to second ArrayList
		second.add(2);
		second.retainAll(first);//second will contain only those element which are present in first
		Iterator it=second.iterator();
		while(it.hasNext())
		{
		 System.out.println(it.next());//displaying the elements
		}
		
		
		
	}
}
