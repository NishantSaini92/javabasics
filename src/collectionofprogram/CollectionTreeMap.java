package collectionofprogram;

import java.util.TreeMap;

public class CollectionTreeMap {
     //no null key
	//Ascending order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(23, "hey");
		tm.put(1, "how");
		tm.put(42, "city");
		tm.put(26,"else");
		System.out.println(tm);//displaying whole map
	}

}
