package array_temp;

import java.util.Scanner;

public class MatrixDeclaration {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array dimentions :: (m : n) ");
		System.out.println("Enter row : ");
		int row = scanner.nextInt();
		System.out.println("Enter column : ");
		int column = scanner.nextInt();
		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter " + (i + 1) + " Row's and " + (j + 1) + " column's Element");
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Array elements are : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
