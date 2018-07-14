package collectionofprogram;



public class Innerclass2 {//outer class
	
	//this is is another way of using inner class
	 int x=1;
	public void dream()
	{
		System.out.println("hello");
	}
	static class test2{ //inner class
		
		public void dream2()//inner class method
		{
			Innerclass obj=new Innerclass();//outer class object
			obj.x=2;//way to use outer class variable
			
			System.out.println("world"+obj.x);
		}
		public static void main(String[] args) {//main method inside inner class
			Innerclass ob1=new Innerclass();
			test2 ob2=new test2();//inner class object
			
			ob1.dream();
			ob2.dream2();
		}
	}

}
