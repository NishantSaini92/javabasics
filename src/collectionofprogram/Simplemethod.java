package collectionofprogram;

public class Simplemethod {
	
	public void add()//public:access modifier,void:return type
	//add():function name ,function without parameter
	
	{
		int variable1=1;
		int variable2=2;
		int result=variable1+variable2;
		System.out.println(result);
		//returning nothing as method is of void type
		
	}
	public int addtwo(int x,int y)//function with parameter x,y
	//these are formal parameters
	{
		int variable1=x;
		int variable2=y;
		int result=variable1+variable2;
		return result;//returning int value as method is of int type
	}
	public static void main(String[] args) {
		
		Simplemethod obj=new Simplemethod();
		//"Simplemethod obj" :declaration 
		//"new":instantiation
		//"new Simplemethod":initialization
		obj.add();//method calling objectOfClass.functionName();
		int getvalue=obj.addtwo(3, 4);//(actual parameter)
		System.out.println(getvalue);
		
	}

}
