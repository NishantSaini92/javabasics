package collectionofprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//no order is maintained 
//unique keys
//accept null values and one null key
public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(122,"www");//put(key,value)
		hm.put(12,":url");
	    for(Entry m:hm.entrySet())
	    {
	    	  System.out.println(m.getKey()+" "+m.getValue());  
	    }
	}

}
