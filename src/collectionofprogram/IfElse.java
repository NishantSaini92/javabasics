package collectionofprogram;

public class IfElse {
public static void main(String[] args) {
	int x=1;
	int y=2;
	
	if (x==1)//is condition is true then if statement block  will executed otherwise else part in case of if else
	{
	
		if(y==2)//this is comparison operator
		//"==" this operator test LHS id equal to  RHS or not
		//if(condition)
		//if the condition is true only then statement will executed otherwise skipped
		{
		//this is statement
			System.out.println("option1");	
		}
		if(x<y)//checks:"x" is less than y or not
		{
		System.out.println("option2");	
		}
		if(x>y)//checks:"x" is greater than y or not
		{
		System.out.println("option3");	
		}
		if(x<=1)//checks:"x" is less than or equal to 1 or not
		{
		System.out.println("option4");	
		}
		if(y>=x)//checks:"y" is greater than or equal to x or not
		{
		System.out.println("option5");	
		}
	
	}
	else
	{//this contains other form of if else
		
		if(x>y) {// this will be checked first if true further condition will not be checked 
			//only this block will be executed when x>y is true
			System.out.println("option1");	
		}else if(x<y)//if first condition is not true only then it will be checked
		{
			System.out.println("option2");	
		}else//if no condition found to be true only then this else part get executed
		{
			System.out.println("option3");	
		}
		
		
		
		
	}
	
}
}
