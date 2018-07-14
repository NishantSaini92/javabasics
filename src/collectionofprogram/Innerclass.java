package collectionofprogram;
//this is the one way of using class inside the class
public class Innerclass {// this is outer class
int x=2;
	
	public void dream()//method of outer class
	{
		System.out.println("hello");
	}
	class insideclass// this inner class
	{   
		public void dream2()//method of inner class
		{int r=x; //we can use the class variable of outer class like that
			System.out.println("world"+r);
		}
	}
	
	public static void main(String[] args) {
		Innerclass obj1=new Innerclass();
		Innerclass.insideclass obj2=obj1.new insideclass(); //this is the way to make object of inner class
		obj1.dream();
		obj2.dream2();
		
	}
}
