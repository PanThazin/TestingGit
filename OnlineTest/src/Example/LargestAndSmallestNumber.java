package Example;

import java.util.Scanner;

public class LargestAndSmallestNumber {
	private static Scanner in;

	public static void main(String args[]) {

		System.out.println(" Please enter the number :");
		in = new Scanner(System.in);
		int[] input = new int[5];
		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
		}
		int max = input[0];
		int min = input[0];

		for (int s : input) {
			if (s > max) {
				max = s;
			} else if (s < min) {
				min = s;
			}
		}
		System.out.println("Max Value : " + max);
		System.out.println("Min Value : " + min);
	}

}
