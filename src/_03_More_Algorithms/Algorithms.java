package _03_More_Algorithms;

import java.util.ArrayList;
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
		String result = (numOne + " x " + numTwo + " = " + sums);
		return result;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int broken = 0;
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				broken = i;
				break;
			}
		}

		return broken;
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
		int sqrt = (int) Math.sqrt(num);
		if(sqrt * sqrt == num) {
			return true;
		}		
		return false;
	}

	public static boolean isCube(int num) {
		int cube = (int) Math.cbrt(num);
		if(cube * cube * cube == num) {
			return true;
		}
		return false;
	}

	public static int countPearls(List<Boolean> pearls) {
		int numPearls = 0;

		for(int i = 0; i < pearls.size(); i++) {
			if(pearls.get(i)) {
				numPearls += 1;
			}
		}	

		return numPearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;

		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}

		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";

		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		String sos = "... --- ...";
		if(message.contains(sos)) {
			return true;
		}

		return false;
	}

	public static List<Double> sortScores(List<Double> results) {	
		for(int i = 0; i < results.size(); i++) {
			for(int k = 0; k < results.size() - 1; k++) {
				if(results.get(k) > results.get(k+1)) {
					double temp = results.get(k);
					results.set(k, results.get(k+1));
					results.set(k+1, temp);
					
				}
			}
		}
			return results;	
		}
	
	public static List<String> sortDNA(List<String> unsortedSequences) {
		for(int i = 0; i < unsortedSequences.size(); i++) {
			for(int k = 0; k < unsortedSequences.size() - 1; k++) {
				if(unsortedSequences.get(k).length() > unsortedSequences.get(k + 1).length()) {
					String temp = unsortedSequences.get(k);
					unsortedSequences.set(k, unsortedSequences.get(k+1));
					unsortedSequences.set(k+1, temp);
				}
			}
		}
		
		return unsortedSequences;
	}

	public static List <String> sortWords(List<String> words) {
		for(int i = 0; i < words.size(); i++) {
			for(int k = 0; k < words.size() - 1; k++) {
				if(words.get(k).compareTo(words.get(k+1)) > 0) {
					String temp = words.get(k);
					words.set(k, words.get(k+1));
					words.set(k+1, temp);
				}
			}
		}
		
		
		return words;
	}
	
	}
