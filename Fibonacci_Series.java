package coreJava;
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer for Fibinacci series: ");

		System.out.print(findFibonacciSeries(sc.nextInt()));
	}

	public static int findFibonacciSeries(int n) {

		if (n <= 1) {
			return n;
		}
		return findFibonacciSeries(n - 1) + findFibonacciSeries(n - 2);
	}
}
