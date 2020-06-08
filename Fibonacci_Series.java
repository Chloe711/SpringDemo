package coreJava;


public class Fibonacci_Series {

	public static void main(String[] args) {

		
		System.out.print(findFibonacciSeries(5));
	}

	public static int findFibonacciSeries(int n) {

		if (n <= 1) {
			return n;
		}
		return findFibonacciSeries(n - 1) + findFibonacciSeries(n - 2);
	}
}
