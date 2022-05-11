package codingassesment;

public class PrimeNumbers {
	public static void primenumbers(int n)
	{
		int i =0;
		int num=0;
		String prime="";
		for(i=1;i<=n;i++)
		{
			int count =0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count =count++;
				}
			}
			if(count==2)
			{
				prime= prime+i+" ";
			}
		}
		System.out.println(prime);
	       
	}

	public static void main(String[] args) {
		primenumbers(10);
		
	}

}
