package collectionofprogram;

public class SimpleArray {
	public static void main(String[] args) {
		//array is collection of homogeneous data types
		
		int[] integerarray;//array declaration 
		//Allocation:
		integerarray=new int[2];//arrayname =new-keyword int[size of array];
		//or you can do it in one line
		int[] array2=new int[2];
		
		//first way to initialize values
		integerarray[0]=3;
		integerarray[1]=54;
		array2[0]=1;
		array2[1]=2332;
		
		//creating array and initializing array
		int[] array3= {21,12};
		System.out.println(integerarray[0]);
		System.out.println(integerarray[1]);
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		
	int[] array4=new int[2];
	//this is used to copy first array2 array to second array array4
	System.arraycopy(array2, 0, array4, 0, 2);
	System.out.println(array4[0]);
	System.out.println(array4[1]);
		
		
		
		
	}

}
