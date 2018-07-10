package collectionofprogram;
//public means you can access that thing everywhere easily
//private means you can only access within class 
//protected means you can access within class or in derived classes outside the package
//default(without public,private,protected)
//default means you can access within package but not outside class even in derived classes


class hello//class can have default modifier like this
{  private int v1=121;//class fields can be private,public,protected
   public int v2=13;
   protected int v3=14;
   
	public void method1()
	{
		final int a=12;//in local variable only final can do
		//a will always have 12 value.
		//you can't assign another value
		System.out.println("public1:"+a+" public2:"+v2);
		method2();
		}
	private void method2()//not accessible outside the class
	{    
		System.out.println("private"+v1);
	}
	protected void method3()
	{   
		System.out.println("protected:"+v3);
	}
}

public class AccessModifiers {//or class can have public modifier like this

	
	public static void main(String[] args) {
		hello obj=new hello();
		obj.method1();//public accessible
		obj.method3();//protected accessible
		System.out.println("public:"+obj.v2);//public accessible
		System.out.println("protected:"+obj.v3);//protected accessible
	}
}
