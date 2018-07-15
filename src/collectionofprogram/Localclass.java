package collectionofprogram;

public class Localclass {

	public void display1()
	{
		System.out.print("Hello ");
		
		class RealLocalClass//local class :class defined inside a method 
		{
			public void display2()
			{
				System.out.println("World");
			}
		}
		
		RealLocalClass rlc=new RealLocalClass();//you call it locally 
		rlc.display2();//calling of method of local class
	}
public static void main(String[] args) {
	Localclass lc=new Localclass();//object of main class
	lc.display1();
}
}
