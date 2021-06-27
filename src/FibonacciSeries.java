import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			// System.out.print(fibonacciReursion(i) + " ");
//			System.out.print(fibonacciLoop(i) + " ");
		}
		// comparison of performance of Fibonacci number with memoization
		int number1 = 100000000;
		long startTime = System.nanoTime();
		int result = fibonacciLoop(number1);
		// fibonacci number with memoization
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("Time taken :" + elapsedTime);

	}

	public static int fibonacciReursion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacciReursion(number - 1) + fibonacciReursion(number - 2);
	}

	public static int fibonacciLoop(int number) {
		int fibo1 = 1, fibo2 = 1, fibo3 = 1;

		if (number == 1 || number == 2) {
			return 1;
		}

		for (int i = 3; i <= number; i++) {
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
		}
		return fibo3;
	}
}
