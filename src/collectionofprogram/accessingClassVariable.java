package collectionofprogram;

class anotherclass
{int x=2;//this is class variable 
}

public class accessingClassVariable {
	//also here all you need to create object and get that variable
	static int d=new anotherclass().x;//you can also get variable like that by creating reference to objects
	public static void main(String[] args) {
		anotherclass ch=new anotherclass();
		System.out.println(ch.x);//You can use this variable like here
		System.out.println(d);
	}
}
