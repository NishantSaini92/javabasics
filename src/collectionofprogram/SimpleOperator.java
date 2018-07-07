package collectionofprogram;

public class SimpleOperator {
	public static void main(String[] args) {
		int integer1=4;
		int integer2=2;
		int addition=integer1+integer2;//it adds two integers
		System.out.println(addition);
		int multiplication=integer1*integer2;//it multiply two integers
		System.out.println(multiplication);
		int quotient=integer1/integer2;//it gives quotient 
		System.out.println(quotient);
		int  remainder=integer1%integer2;//it return the remainder
		System.out.println(remainder);
		
		
		
		//unary operator
		boolean bvariable=true;
		int variable=0;
		variable=+10;// it adds 10 in value of variable
		System.out.println(variable);
		variable--;//it decrement variable by one
		System.out.println(variable);
		variable++;//it increment by one
		variable=-1;//it also decrement by one
		System.out.println(variable);
		System.out.println(!bvariable);
		
		
		}

}
