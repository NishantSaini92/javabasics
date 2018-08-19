package collectionofprogram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColectionQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//One way to implement queue
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(21);
		q.add(1);
		q.add(3);
		q.poll();//queue can remove only first element 
		
		for(int x:q)
		{
			System.out.println(x);
		}
		//Second way to implement queue
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(21);
		q1.add(1);
		q1.add(3);
		for(int x:q1)
		{
			System.out.println(x);
		}
		
        //PriorityQueue
		PriorityQueue<Integer> q2=new PriorityQueue<Integer>();
		q2.add(21);
		q2.add(1);
		q2.add(3);
		for(int x:q2)
		{
			System.out.println(x);
		}
		
	
		
	}

}
