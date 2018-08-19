package collectionofprogram;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionLinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(4);
		lhs.add(null);//also permits null value
		lhs.add(2);
		lhs.add(2);
		Iterator it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
