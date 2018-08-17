package collectionofprogram;

import java.util.ArrayList;
import java.util.Iterator;

//add one arraylist to other
public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> first=new ArrayList<Integer>();
		ArrayList<Integer> second=new ArrayList<Integer>();
		first.add(1);//adding element to first ArrayList
		first.add(2);
		second.add(3);//adding element to second ArrayList
		second.add(4);
		second.addAll(first);//adding whole first ArrayList to second
		Iterator it=second.iterator();
		while(it.hasNext())
		{
		 System.out.println(it.next());//displaying the elements
		}
		

	}

}
