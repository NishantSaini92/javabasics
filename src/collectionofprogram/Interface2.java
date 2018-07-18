package collectionofprogram;



interface in   //this is generally called as functional interface 
//functional interface contain exactly one abstract method,default can be zero or more
{ public void display();
	default void gg()//you can use default keyword to give body to method in interface
	{
		System.out.println("part one ");
	}
}
public class Interface2 implements in {
	public static void main(String[] args) {
		Interface2 ini=new Interface2();
		
		ini.gg();
		ini.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is implementation");
		
	}
}
