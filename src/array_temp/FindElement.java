package array_temp;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array limit : ");
		int limit = scanner.nextInt();
		int arr[] = new int[limit];
		for (int i = 0; i < limit; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}
		System.out.print("Array elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter element to search : ");
		int searchKey = scanner.nextInt();
		boolean isFind = false;
		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchKey) {
				isFind = true;
				position = i + 1;
				break;
			}
		}
		if (isFind) {
			System.out.println("Element found at position : " + position);
		} else {
			System.out.println("Element not present in the Array");
		}
		scanner.close();
	}

}
