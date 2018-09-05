package Example;

import java.util.Scanner;

public class OutputBetweenTagData {
	private static Scanner in;

	public static void main(String args[]) {
		System.out.println(" Enter Input Tag : ");
		in = new Scanner(System.in);
		String tagString = in.nextLine().trim();
		String[] tag = tagString.split(" ");
		System.out.println(" Enter Input Value : ");
		String inputString = in.nextLine().trim();

		String splInputString[] = inputString.split(tag[1]);

		for (int i = 0; i < splInputString.length; i++) {
			int firTag = splInputString[i].indexOf(tag[0]);
			if (firTag >= 0) {
				String outputString = splInputString[i].substring(firTag + tag[0].length());
				if (outputString.length() > 0) {
					System.out.println(outputString);
				} else {
					System.out.println("<blank>");
				}
			}
		}
	}
}
