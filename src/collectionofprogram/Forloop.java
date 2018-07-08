package collectionofprogram;

public class Forloop {
public static void main(String[] args) {
	for(int i=0;i<=10;i++)//for(initialization;condition(needs to be true to execute block statements);increment)
	{
		System.out.println(i);
	}
	
	//a different way to use for loop on array
	
	int[] array1=new int[2];
	array1[0]=2;
	array1[1]=32;
	for(int x3:array1)
	{
		System.out.println(x3);
	}
	
	
	//another way to use this loop
	int i1=0;//initialization
	for(;;)
	{
		System.out.println(i1);
		i1++;//increment
		if(i1==11)//condition when it become true loop breaks and control go to next statement after loop
		{
			break;
		}
	}
}
}
