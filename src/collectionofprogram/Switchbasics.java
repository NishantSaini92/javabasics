package collectionofprogram;

public class Switchbasics {
	public static void main(String[] args) {
		int day=1;//variable can be of int,char, short, byte, string type
		switch(day)//switch(variable)
		{
		case 1://variable matches value 1 then this will be executed
			System.out.println("Monday");
			break;// break is there for flow control 
			//if break is not there all statement after the matching case will be executed
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7://case variable:
			System.out.println("Sunday");
			break;
		}	
	}
	

}
