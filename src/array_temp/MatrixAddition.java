package array_temp;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array dimentions :: (m : n) ");
		System.out.println("Enter row : ");
		int row = scanner.nextInt();
		System.out.println("Enter column : ");
		int column = scanner.nextInt();
		int[][] arr1 = new int[row][column];
		int[][] arr2 = new int[row][column];
		System.out.println("Enter elements for first array : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter element [" + (i + 1) + "] [" + (j + 1) + "]");
				arr1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter elements for second array : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter element [" + (i + 1) + "] [" + (j + 1) + "]");
				arr2[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		System.out.println("First array's elements are : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second array's elements are : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Addition of two matrix is : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
