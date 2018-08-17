package collectionofprogram;

import java.util.ArrayList;

//user defined class for arraylist
class tim
{
	String name;
	int price;
	tim(String name,int price)//constructor with two argument
	{
		this.name=name;//this points to current class instance
		this.price=price;
	}
}


public class ArrayList2 {
	public static void main(String[] args) {
		tim t1=new tim("milk",2);
		tim t2=new tim("burger",3);
		ArrayList<tim> arl=new ArrayList<tim>();
		arl.add(t1);//adding elements
		arl.add(t2);
		
		for(tim x:arl)
		{ 
			System.out.println(x.name+" "+x.price);
		}
	}

}
