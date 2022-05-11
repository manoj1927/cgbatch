
public class ArrayExerc {
	
	public int findLarg(int a[]) {
		int lar = a[0];
		for (int i = 0; i < a.length; i++) {
			if (lar < a[i]) {
				lar = a[i];
			}
		}
		return lar;
	}

	public int findSmall(int b[]) {
		int small = b[0];
		for (int i = 0; i < b.length; i++) {
			if (small > b[i])
				small = b[i];
		}
		return small;
	}

	public static void main(String[] args) 
   
	{
	   ArrayExerc o = new ArrayExerc();
       int[] arr1= {2,3,4,7,5};
       int res1=o.findLarg(arr1);
       int res2=o.findSmall(arr1);
       System.out.println("The Larg Element: "+res1);
       System.out.println("The Small Element: "+res2);
    }
}