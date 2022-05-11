package codingassesment;

public class Fibonacci {
	public static void fibonacci(int n) {
		int a = 1;
		int b = 1;

		for (int i = 1; i <= n; i++) {

			int c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
       fibonacci(10);
	}

}
