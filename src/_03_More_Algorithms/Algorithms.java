package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int sum = num1 * num2;
		String sums = String.valueOf(sum);
		String numOne = String.valueOf(num1);
		String numTwo = String.valueOf(num2);
		
		return null ;
	}

	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}

	public static boolean isPrime(int num) {

		for(int i = 2; i < num/2+1; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSquare(int num) {
		return false;
	}

}
