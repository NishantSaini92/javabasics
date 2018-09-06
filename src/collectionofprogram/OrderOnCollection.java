package collectionofprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class OrderOnCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<String> al2=new ArrayList<String>();
		//Adding elements to ArrayList<Integer>:al1
        al1.add(32);
        al1.add(2);
        al1.add(43);
        al1.add(1);
        
        //Adding elements to ArrayList<String>:al2
        
        al2.add("Elen");
        al2.add("Bob");
        al2.add("Joe");
        al2.add("Antony");
        
        Collections.sort(al1);//it sort ArrayList numerically
        Collections.sort(al2);//it will sort ArrayList alphabetically
        
        System.out.println("First ArrayList:");
        Iterator<Integer> it=al1.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        System.out.println("Second ArrayList:");
        Iterator<String> it1=al2.iterator();
        while(it1.hasNext())
        {
        	System.out.println(it1.next());
        }
        
	}

}
