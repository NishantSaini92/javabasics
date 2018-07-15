package collectionofprogram;

enum disp
{
	hello,world,are(12);//in enum there can be constants
   void numb()//there can be methods
   {
	   System.out.println("number");
   }
   disp()//there can be constructor
   {
	   System.out.println("number2");
   }
  disp(int s){
	  System.out.println(s);
  }
	
}
public class SimpleEnum {
	
	public static void main(String[] args) {
		System.out.println(disp.hello);//this is how we use constants
		System.out.println(disp.world);
		System.out.println(disp.are);
		disp.hello.numb();//use of methods
		
	}

}
