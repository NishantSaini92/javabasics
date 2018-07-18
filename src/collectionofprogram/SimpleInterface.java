package collectionofprogram;

interface intrface//interface interface_name
{
	 public void display();//abstract method:so you cannot have body here.
}

public class SimpleInterface implements intrface {

	@Override
	public void display() {//implementation of body in class implementing interface
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		SimpleInterface si=new SimpleInterface();
		si.display();
	}

}
