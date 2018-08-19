package collectionofprogram;

import java.util.Iterator;
import java.util.TreeSet;
//It arrange things in ascending order
//no duplicate values
public class CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(32);
		ts.add(1);
		ts.add(100);
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
