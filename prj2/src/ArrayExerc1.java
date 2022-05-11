
public class ArrayExerc1 {
	public int findLarg(int a[]) {
		int lar = a[0];
		int l2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (lar < a[i]) {
				lar = a[i];
			}
		}
		System.out.println("largest no: "+lar);

			for (int i = 0; i < a.length; i++) {
				if (l2 < a[i] && a[i]!= lar) {
					l2 = a[i];
				}
			}
		
		return l2;
	}

	public int findSmall(int b[]) {
		int small = b[0];
		int s2 = b[0];
		for (int i = 0; i < b.length; i++) {
			if (small > b[i])
				small = b[i];
		}
		System.out.println("smallest no: "+small);

		for (int i = 0; i < b.length; i++) {
			if (s2 > b[i] && b[i]!= small) {
				s2 = b[i];
			}
		}
	
		return s2;
	}

	public static void main(String[] args)

	{
		ArrayExerc1 a = new ArrayExerc1();
		int[] arr1 = { 2, 3, 4, 7, 5 };
		int res1 = a.findLarg(arr1);
		int res2 = a.findSmall(arr1);
		System.out.println("The SecondLarg Element: " + res1);
		System.out.println("The SecondSmall Element: " + res2);
	}
}
