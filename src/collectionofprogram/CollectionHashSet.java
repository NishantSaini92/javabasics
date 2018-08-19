package collectionofprogram;

import java.util.HashSet;
import java.util.Iterator;
//HashSet doesn't allow same value
public class CollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();//<type of hashtable>
		hs.add(1);//adding elements
		hs.add(2);
		hs.add(1);//adding similar element
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//displaying the element
		}
		
	}

}
