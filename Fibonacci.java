package hw8;

public class Fibonacci {
	public static int fibonacci(int num) {
		int fibo1 = 0;
		int fibo2 = 1;
		int f;
		if (num == 0)
			return fibo1;
		if (num == 1)
			return fibo2;
		for (int i = 2; i <= num; i++) {
			f = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = f;
		}
		return fibo2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int fibo = fibonacci(num);
		System.out.println("fibo of " + num + "=" + fibo);
	}

}
