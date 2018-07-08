package collectionofprogram;

public class Continuekeyword {
public static void main(String[] args) {
	//unlabeled continue
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=3;j++)
		{
			if(j==2)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	
	//labeled continue skip the labeled outer loop
	System.out.println("continue:");
	continuelabel:
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=3;j++)
		{
			if(j==2)
			{
				continue continuelabel;
			}
			System.out.println(i);
		}
	}
}
}
