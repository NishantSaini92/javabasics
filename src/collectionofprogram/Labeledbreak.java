package collectionofprogram;

public class Labeledbreak {
	public static void main(String[] args) {
		
		//unlabeled break breaks nearest loop
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i==2)
				{
					break;
				}
				System.out.println(i);
			}
		}
		
		//labeled break is used to terminate outer labeled loop
		System.out.println("labeled:");
		breaklabel:
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i==2)
				{
					break breaklabel;
				}
				System.out.println(i);
			}
		}
		
	}

}
