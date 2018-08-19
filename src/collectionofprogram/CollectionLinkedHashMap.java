package collectionofprogram;

import java.util.LinkedHashMap;
import java.util.*;

public class CollectionLinkedHashMap {
    //insertion order
	//have one null key and multiple null values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(123, "Hello");
		lhm.put(21,"World");
		lhm.put(132,"On");
		lhm.put(212,"Top");
		for(Map.Entry m:lhm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		

	}

}
