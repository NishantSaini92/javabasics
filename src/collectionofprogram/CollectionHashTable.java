package collectionofprogram;

import java.util.Hashtable;
import java.util.Map;

public class CollectionHashTable {
//It is Synchronized 
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(2,"Welcome");
		ht.put(12, "Dear");
		ht.put(4, "World");
		System.out.println("1st way:");
		System.out.println(ht);//one way to display
		System.out.println("2nd way:");
		for(Map.Entry m:ht.entrySet())//other way
		{
			System.out.println("row:"+m.getKey()+":"+m.getValue());
		}
	}

}
