package Example;

import java.util.Scanner;

public class GrayscaleImages {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println(" Enter rows :");
		int row = in.nextInt();
		System.out.println(" Enter column :");
		int col = in.nextInt();
		System.out.println(" Enter Grayscale Images Point :");

		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		gradation(matrix, row, col);
	}

	public static void gradation(int[][] matrix, int matrixRow, int matrixCol) {
		System.out.println("Resul Matrix is : ");

		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				int colour = (matrix[i][j] >= 128) ? 1 : 0;
				System.out.print(colour + "\t");
			}

			System.out.println();
		}
	}
}
