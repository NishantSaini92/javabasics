package collectionofprogram;

public class SimpleConstructor {
	//every class have default constructor(for class to which user don't provide one) which is provided implicitly by java
	public SimpleConstructor()//constructor have same name as class
	//no return type
	
	{
		int variable1=21;
		int variable2=22;
		int result=variable1+variable2;
		System.out.println(result);
	}
	public SimpleConstructor(int x)//constructor with parameter
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		SimpleConstructor sc=new SimpleConstructor();//it will invoke the constructor without parameter
		SimpleConstructor sc1=new SimpleConstructor(10);//it will invoke the constructor with parameter
	}

}
