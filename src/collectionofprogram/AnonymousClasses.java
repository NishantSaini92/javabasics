package collectionofprogram;


class class1
{
	public void display()
	{
		System.out.println("Hello");
	}
}

public class AnonymousClasses {
	public static void main(String[] args) {
		class1 cl=new class1() {
			 public void display()//this override the method display 
			 //this is like child class of class1 and we override in it the parent method
			 //more on it later in inheritance and interfaces
			{
				System.out.println("World");
			}
		};//this is anonymous class 
		cl.display();//calling method
	}

}
