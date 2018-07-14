package collectionofprogram;

public class UseOfThis2 {
	
	int x=1;
	public void dream(int x)
	{
		System.out.println(this.x);//this will use x=1;refer to current class variable
		System.out.println(x);//this will use "x" of parameter
	}
	
	public static void main(String[] args) {
		new UseOfThis2().dream(3);
	}

}
