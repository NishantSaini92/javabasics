package collectionofprogram;
//package is like folder in computer
//You can put related classes and interfaces in it

public class Helloworld {// Helloworld is name of class.
	//main method is static,so that JVM can call it without creating class instance.
	//main method is public so that JVM can easily access it.
	//public is access modifier
	//main method is void as in java main method return nothing.
	public static void main(String[] args) {
		System.out.println("Hello world");
		//System:final class in java.lang package
		//out:it is of PrintStream,and static member field of System class
		//println: method of PrintStream class
	}

}

/*Main function is the entry point to the program in core java.
 You need to use main function for entry point.
 If there is no main function in program then exception will be thrown no main function found.
 "public","static" in main method can be written in whichever order:public static or static public. 
Main method accept single argument: "String[] args" which is an array of type String.
 */
