package collectionofprogram;

import java.util.ArrayList;

import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arlist=new ArrayList<Integer>();//<type of ArrayList>
		for(int i=0;i<10;i++)
		{
			arlist.add(i);//adding the element 
		}
        //one way to display
		System.out.println("first way:");
		for(int i=0;i<10;i++)
		{
			System.out.println(arlist.get(i));
		}
		//second  way to display
		System.out.println("second way:");
		Iterator obj=arlist.iterator();//Iterator which iterate the list
		while(obj.hasNext())//hasNext check:Is there any next element
		{
			System.out.println(obj.next());//next give us the next element
		}
		
		//third way 
		System.out.println("Third way:");
		for(int x:arlist)
		{
			System.out.println(x);
		}
	}

}
