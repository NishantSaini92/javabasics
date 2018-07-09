package collectionofprogram;

public class UseOfThis {
	
	static int s;//suppose this is variable1
	public UseOfThis()
	{
		this(2);//this is how you can another constructor inside the constructor
	}
	public UseOfThis(int s)
	{
	this.s=s;//this.s will refer to variable1
	System.out.println(s);
	}
	public void display(int s)
	{
		this.s=s;//UseOfThis.s
	}
	

	public static void main(String[] args) {
		UseOfThis uot=new UseOfThis();
		uot.display(3);
		System.out.println(s);
	}
	
}
