package collectionofprogram;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class CollectionDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq=new ArrayDeque<Integer>();//Double ended 
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.pollLast();//Deque can remove or add elements from both sides
		Iterator it=dq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.hasNext());
		}
		
	}

}
