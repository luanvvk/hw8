package hw8;

public class FiboRecursive {
	public static int FibonacciRecursive(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		System.out.println("Recursive approach of fibo number: " + FibonacciRecursive(num));
	}

}
//O(n)