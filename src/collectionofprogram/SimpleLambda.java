package collectionofprogram;

interface Xlambda//interface
{
	void display();
}
interface Xlambda2
{
	void display1(int x);
}

public class SimpleLambda {

	public static void main(String[] args) {
		
		Xlambda xl=()->System.out.println("hello");//this is lambda 
		//it need interface with exactly one abstract method(functional interface)
		xl.display();
		
		Xlambda2 xl2=(s)->//lambda expression with parameter
		{int se=45;
		int xe=s+se;
		System.out.println(xe);
		
		};
		xl2.display1(122);//calling parameter lambda expression

	}

}
