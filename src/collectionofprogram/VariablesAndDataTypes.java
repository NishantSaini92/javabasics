package collectionofprogram;

public class VariablesAndDataTypes {
	static int x;//global variable have default values like int have 0,if no value is assigned value
	//Local variable will throw error if not initialized
	public static void main(String[] args) {
		//State of object are stored in field(Variables)
		//Behavior of object is exposed by methods
		byte integerValueVariable;//this is how variable is declared(DataType nameOfVariable;) **1 byte size
		integerValueVariable=34;//assigning value
		System.out.println(integerValueVariable);
	    //another way is to declare and assign in one statement
		double Doublevariable=21.31d;//fraction number to more accuracy **8 bytes size
		System.out.println(Doublevariable);
		
		System.out.println(x);
		
		boolean trueFalseVariable=true;//it can hold the value true and false
		System.out.println(trueFalseVariable);
	 
		float Fvariable=1.2f;//fraction number **4 bytes
		int intvariable=2345;//integer number **4 bytes
		short svariable=231;//saves integer but less range **2 bytes
		long lvariable=43535l;//saves integer more range then int **8 bytes
		char cvariable='c';//it saves character in single quotation marks **2 bytes
		
		String str="hello world";//it is not primitive type
		//strings are immutable in this context
		System.out.println(Fvariable);
		System.out.println(intvariable);
		System.out.println(svariable);
		System.out.println(lvariable);
		System.out.println(cvariable);
		System.out.println(str);
		
		
	}
	
	
	

}
