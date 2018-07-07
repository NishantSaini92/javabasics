package collectionofprogram;

public class BitwiseOperator {
public static void main(String[] args) {
	int firstvariable=5;//it is 0101 
	int secondvariable=3;//it is 0011 
	System.out.println(firstvariable ^ secondvariable); //0110
	System.out.println(firstvariable & secondvariable);//0001
	System.out.println(firstvariable | secondvariable);//0111
	System.out.println(firstvariable>>1);//0010
	System.out.println(firstvariable<<1);//1010
	System.out.println(firstvariable>>>1);//0010 does not take sign in consideration
}
}
