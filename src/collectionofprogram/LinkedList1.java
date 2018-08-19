package collectionofprogram;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> lt=new LinkedList<Integer>();//<type>
		lt.add(2);//Adding to LinkedList
		lt.add(1);
		System.out.println("LinkedList:"+lt);//this is how you can display LinkedList
		int x=lt.get(1);//getting element at index 1
		System.out.println("Element at index 1:"+x);
		lt.remove(1);
		System.out.println("LinkedList after removing element:"+lt);
	}

}
