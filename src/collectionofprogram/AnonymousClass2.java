package collectionofprogram;

//more on interface later
interface Apple
{
	public void display();
}
public class AnonymousClass2 {
public static void main(String[] args) {
	Apple apl=new Apple(){//this is another way to implement interface using anonymous class

		
		public void display() {
			
			System.out.println("Apple");
			
		}
		
	};
	apl.display();//calling method 
}
}
