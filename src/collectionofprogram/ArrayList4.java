package collectionofprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> first=new ArrayList<Integer>();
		ArrayList<Integer> second=new ArrayList<Integer>();
		first.add(1);//adding element to first ArrayList
		first.add(2);
		second.add(1);//adding element to second ArrayList
		second.add(4);
		second.removeAll(first);//removing all elements from second which are similar to first
		Iterator it=second.iterator();
		while(it.hasNext())
		{
		 System.out.println(it.next());//displaying the elements
		}

	}

}
