package collectionofprogram;

public class WhileDoWhile {
public static void main(String[] args) {
	//while loop
	int variable1=0;
	int variable2=0;
	while(variable1<10)//statement block will keep executing until condition become invalid 
	{
		System.out.println(variable1);
		variable1++;//it increment by value 1 
		
	}
	
	//do while loop
	
   do {
	   System.out.println(variable2);//this statement will execute at least once
	   variable2++;
   }
   while(variable2<10);//loop will run until this condition become false
}
}
