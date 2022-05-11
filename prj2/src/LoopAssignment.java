
public class LoopAssignment {
	
	void fn(int x)
	{
		for(int i=0;i<=x;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	void fn1(int y)
	{
		for(int i=0;i<=y;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	LoopAssignment l = new LoopAssignment();
	l.fn(3);
	l.fn1(4);
}
}
